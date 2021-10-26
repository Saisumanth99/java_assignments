package stringcheck;

import java.util.*;

public class StringCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the string : ");
        String str = scanner.nextLine().toLowerCase();

        int arr[] = new int[26];

        for(Character ch : str.toCharArray()){
            int asciiValue = (int)ch;
            if(asciiValue>=97 && asciiValue<=122) {
                arr[asciiValue-97] = 1;
            }
        }
        int sum = 0;
        for(int i : arr) sum+=i;
        if(sum == 26) System.out.println("the string contains all the alphabet");
        else System.out.println("the string does NOT contain all the alphabet");


        //abcdefghIJKLMNOpqrstuvWXYZ
        //time complexity : O(n+26) -> n is length of string
        //space complexity : O(n+26) -> n is length of string

    }
}
