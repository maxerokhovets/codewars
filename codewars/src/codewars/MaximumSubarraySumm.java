package codewars;

public class MaximumSubarraySumm {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSumm = 0;
        for (int i=0; i<arr.length; i++){
            int tempSumm = arr[i];
            for (int j=i+1; j<arr.length; j++){
                tempSumm += arr[j];
                if (tempSumm>maxSumm) maxSumm = tempSumm;
            }
        }

        System.out.println(maxSumm);

    }
}
