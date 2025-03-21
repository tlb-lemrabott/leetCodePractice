package org.example.codereport.string;

public class StringToArray {

    public static String buildStringFromArray(String [] arr){
        String result = "";
        for(String str: arr){
            result = result + " " + str;
        }
        return result;
    }

    public static void main(String[] args) {
        String []arr = new String[]{"Alo", "Helper", "Soccer", "Clear"};
        System.out.println(buildStringFromArray(arr));
    }

}
