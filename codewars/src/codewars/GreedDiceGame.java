package codewars;

public class GreedDiceGame {
    public static void main(String[] args) {
        int[] dice = {2, 4, 4, 5, 4};
        int[] diceCount = new int[6];
        for (Integer diceFromDice : dice){
            diceCount[diceFromDice-1]++;
        }
        int points = 0;
        for (int i=1; i<diceCount.length; i++){
            if (diceCount[i]>=3) {
                points = (i+1)*100;
                diceCount[i] -= 3;
            }
        }
        if (diceCount[0]>=3){
            points += 1000+(diceCount[0]-3)*100;
        }else {
            points += diceCount[0]*100;
        }
        if (diceCount[4]>0) points+=diceCount[4]*50;

        System.out.println(points);

    }
}
