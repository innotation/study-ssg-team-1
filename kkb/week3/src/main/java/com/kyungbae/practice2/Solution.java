package com.kyungbae.practice2;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // System.out.println(palindrom(str));
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.toCharArray());
        }

    }

    public static String palindrom(String str){
        String result = "I'm Sorry Hansoo";

        /*
            알파벳 요소별로 모아서 개수 및 짝수 체크,
            홀수가 2개 이상이면 무조건 false
            알파벳 순서대로 반으로 나누어 양쪽끝에 배치
            홀수개 있는 알파벳 1개는 가운데 배치
         */
        Map<Character, Integer> alpha = new HashMap<>();
        for (int i = 0; i <str.length() ; i++) {
            alpha.put(str.charAt(i), i);
        }



        return result;
    }

}
