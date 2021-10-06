package codewars;

import java.util.Arrays;

import java.util.stream.Collectors;

public class ToCamelCase {

    public static void main(String[] args) {
        String s = "The_stealth-warrior";
        //String s1 = "The_Stealth_Warrior";
        
        String[] strings = s.split("[-_]");
        String camelString = Arrays.stream(strings)
                .skip(1)
                .map(p->p.replaceFirst(
                        String.valueOf(p.charAt(0)),
                        String.valueOf(Character.toUpperCase(p.charAt(0)))
                        ))
                .collect(Collectors.joining());
        
        System.out.println(strings[0]+camelString);
    }

}
