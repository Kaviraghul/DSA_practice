package org.example.ZOHO.Questions;

public class TwoPointers {

    // Check for subsequence

    public void StringSubSequence(String A, String B){

        int firstStringIndex = 0, secondStringIndex = 0;

        while(firstStringIndex < A.length() && secondStringIndex < B.length()){
            if(B.charAt(secondStringIndex) == A.charAt(firstStringIndex)){
                firstStringIndex++;
            }
            secondStringIndex++;
        }

        if(firstStringIndex == A.length()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }

}
