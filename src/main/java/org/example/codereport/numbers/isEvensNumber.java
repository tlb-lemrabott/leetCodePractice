package org.example.codereport.numbers;

public class isEvensNumber {
    public static int isEvens(int number){
        while (number != 0){
            int last = number % 10;
            if(last % 2 != 0){
                return 0;
            }
            number /= 10;
        }
        return 1;
    }

    public static void main(String[] args) {
        int n = 3224;
        System.out.println(isEvens(n));
    }

}
