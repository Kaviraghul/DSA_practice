package org.example.ZOHO.Questions;

public class PatternPrinting {

    // pattern no : 1
    public  void PatternPrinting_1(int B) {

        System.out.println("PatternPrinting_1");

        int rowLength = 0;
        for (int i = 1; i <= B; i++) {
            rowLength++;
            int j = 1, k = i, increment = B - 1;
            System.out.print(k + " ");
            while (j < rowLength) {
                System.out.print(k + increment + " ");
                k += increment;
                j++;
                increment--;
            }
            System.out.println();
        }
    }

    // pattern no : 2  (17 min )
    public   void DiamondPattern(int B){

        System.out.println("Diamond pattern");

        int starCount = 0;

        for(int i = 0; i < 2*B; i++){

            if(i < B)starCount++;
            if(i > B)starCount--;

            // spacing
            for(int j = 0; j < B - starCount; j++){
                System.out.print(" ");
            }

            // star with space
            for(int j = 0; j < starCount; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}



/*
* Questions :
*
* 1. pattern no : 1
*    1
*    2 6
*    3 7 10
*    4 8 11 13
*    5 9 12 14 15
*
* 2. pattern no : 2 ( diamond pattern )
*        *
*       * *
*      * * *
*     * * * *
*     * * * *
*      * * *
*       * *
*        *
*
* 3. pattern no : 3
*
*
* 4. pattern no : 4
*
*
* 5. pattern no : 5
*
* */
