package org.example.ZOHO;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class OneDimensionArray {

    public  void DistinctDigitArray(int[] A){

        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0 ; i < A.length; i++){
            int value = A[i], value_length = String.valueOf(A[i]).length();



            while (value_length > 0){
                int int_value = value % 10;

                if(!set.contains(int_value)){
                    set.add(int_value);
                }

                value = value/10;

                value_length--;
            }

        }

        int[] ans = new int[set.size()];

        Iterator<Integer> it = set.iterator();

        int index = 0;

        while (it.hasNext()) {
            ans[index] = it.next();
            index++;
        }

        System.out.println(Arrays.toString(ans));

    }
}
