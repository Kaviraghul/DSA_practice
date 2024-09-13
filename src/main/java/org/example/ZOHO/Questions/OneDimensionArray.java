package org.example.ZOHO.Questions;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class OneDimensionArray {

    public void DistinctDigitArray(int[] A) {

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < A.length; i++) {
            int value = A[i], value_length = String.valueOf(A[i]).length();


            while (value_length > 0) {
                int int_value = value % 10;

                if (!set.contains(int_value)) {
                    set.add(int_value);
                }

                value = value / 10;

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

    public void CustomSorting_1(int[] A) {
        Arrays.sort(A);

        int lastOddIntIndex = -1;

        for (int i = 0, j = 0; j < A.length; ) {
            if (A[i] == A[j] && A[i] % 2 == 1) {
                i++;
                j++;
                lastOddIntIndex++;
            } else if (A[i] % 2 == 1 && i < j) {
                i++;
                lastOddIntIndex++;
            } else if (A[i] % 2 == 0 && A[j] % 2 == 1 && i < j) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j++;
                lastOddIntIndex++;
            } else {
                j++;
            }
        }


        for (int i = 0, j = lastOddIntIndex; j >= lastOddIntIndex / 2; ) {
            int temp = A[j];
            A[j] = A[i];
            A[i] = temp;
            j--;
            i++;
        }

        System.out.println(Arrays.toString(A));

    }


    // Find minimum number of currency notes and values that sum to given amount

    public void MinimumCurrencyNumber(int amount) {
        int[] currencies = new int[]{2000, 500, 200, 100, 50, 20, 10, 5,};

        int amountRef = amount;
        int currencyIndex = 0;

//        // greedy approach
//        Map<Integer, Integer> ans = new TreeMap<>((a, b) -> b - a);
//        while (amountRef != 0){
//
//            int currentCurrency = currencies[currencyIndex];
//
//            if(currentCurrency > amountRef ){
//                currencyIndex++;
//            }else{
//                ans.merge(currentCurrency, 1, Integer::sum);
//                amountRef = amountRef % currentCurrency;
//            }
//        }

        // normal approach
        HashMap<Integer, Integer> ans = new HashMap<Integer, Integer>();
        while (amountRef != 0) {
            int currentCurrency = currencies[currencyIndex];
            if (currentCurrency > amountRef) {
                currencyIndex++;
            } else {
                if (ans.containsKey(currentCurrency)) {
                    ans.put(currentCurrency, ans.get(currentCurrency + 1));
                } else {
                    ans.put(currentCurrency, 1);
                }
                amountRef = amountRef % currentCurrency;
            }
        }
        System.out.println("Currency  Count");
        ans.forEach((key, value) -> System.out.println(key + " " + value));
    }

    // Program to Convert Hexadecimal Number to Binary

    public void  HexaBinaryConversion(String hexaValue){
        HashMap<Character, Integer> hexaNumbers = new HashMap<Character, Integer>();
        hexaNumbers.put('0', 0);
        hexaNumbers.put('1', 1);
        hexaNumbers.put('2', 2);
        hexaNumbers.put('3', 3);
        hexaNumbers.put('4', 4);
        hexaNumbers.put('5' ,5);
        hexaNumbers.put('6', 6);
        hexaNumbers.put('7', 7);
        hexaNumbers.put('8', 8);
        hexaNumbers.put('9', 9);
        hexaNumbers.put('A', 10);
        hexaNumbers.put('B', 11);
        hexaNumbers.put('C', 12);
        hexaNumbers.put('D', 13);
        hexaNumbers.put('E', 14);
        hexaNumbers.put('F', 15);

        StringBuilder ans = new StringBuilder();

        for(char value : hexaValue.toCharArray()){

            int decimalValue = hexaNumbers.get(value);
            String binaryValue = "";

            if(value == '0'){
                binaryValue = "0";
            } else if (value == '1') {
                binaryValue = "1";
            }else{
                while(decimalValue != 0){
                    int reminder = decimalValue % 2;
                    binaryValue =  reminder + binaryValue;
                    decimalValue = decimalValue / 2;
                }
            }

            if(binaryValue.length() < 4){
                while (binaryValue.length() != 4){
                    binaryValue = "0" + binaryValue;
                }
            }

            ans.append(binaryValue);
        }

        System.out.println(ans);

    }

    // Sort elements by frequency

    public void DescendingFrequencySorting(int[] A) {
        // Step 1: Count the frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int temp : A) {
            frequencyMap.put(temp, frequencyMap.getOrDefault(temp, 0) + 1);
        }

        // Step 2: Group elements by their frequency
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int element = entry.getKey();
            int frequency = entry.getValue();

            if (!map.containsKey(frequency)) {
                map.put(frequency, new ArrayList<>());
            }
            map.get(frequency).add(element);
            maxFrequency = Math.max(maxFrequency, frequency);  // Track the maximum frequency
        }

        // Step 3: Build the result array based on frequency
        int[] ans = new int[A.length];
        int index = 0;
        while (maxFrequency > 0) {
            if (map.containsKey(maxFrequency)) {
                for (int value : map.get(maxFrequency)) {
                    for (int i = 0; i < maxFrequency; i++) {
                        ans[index++] = value;
                    }
                }
            }
            maxFrequency--;
        }

        System.out.println(Arrays.toString(ans));
    }

    // Program to print prime numbers from 1 to N.

    public void PrimeNumbersBtwRange(int N){
        ArrayList<Integer> ans = new ArrayList<Integer>();

        if(N == 0 || N == 1)System.out.println("0");

        for (int i = 2; i < N; i++){
            boolean prime = true;
            for (int j = 2; j * j <= i; j++){
                if(i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if(prime)ans.add(i);
        }
        System.out.println(ans);
    }

}




