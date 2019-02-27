package org.neekolay;

import java.util.HashMap;

class NumbersService {

    private static final HashMap<String, Integer> NUMBERS = new HashMap<String, Integer>();

    static {
        NUMBERS.put("one", 1);
        NUMBERS.put("two", 2);
        NUMBERS.put("three", 3);
        NUMBERS.put("four", 4);
        NUMBERS.put("five", 5);
        NUMBERS.put("six", 6);
        NUMBERS.put("seven", 7);
        NUMBERS.put("eight", 8);
        NUMBERS.put("nine", 9);

        NUMBERS.put("ten", 10);
        NUMBERS.put("eleven", 11);
        NUMBERS.put("twelve", 12);
        NUMBERS.put("thirteen", 13);
        NUMBERS.put("fourteen", 14);
        NUMBERS.put("fifteen", 15);
        NUMBERS.put("sixteen", 16);
        NUMBERS.put("seventeen", 17);
        NUMBERS.put("eighteen", 18);
        NUMBERS.put("nineteen", 19);

        NUMBERS.put("twenty", 20);
        NUMBERS.put("thirty", 30);
        NUMBERS.put("forty", 40);
        NUMBERS.put("fifty", 50);
        NUMBERS.put("sixty", 60);
        NUMBERS.put("seventy", 70);
        NUMBERS.put("eighty", 80);
        NUMBERS.put("ninety", 90);

        NUMBERS.put("hundred", 100);
        NUMBERS.put("thousand", 1000);
    }

    static int toInt(String inputText) {
        String[] words = inputText.toLowerCase().split(" ");
        int result = 0;
        try {
            for (int i = 0; i < words.length - 1; i += 2) {
                if (NUMBERS.get(words[i]) < NUMBERS.get(words[i + 1])) {
                    result += NUMBERS.get(words[i]) * NUMBERS.get(words[i + 1]);
                } else {
                    result += NUMBERS.get(words[i]) + NUMBERS.get(words[i + 1]);
                }
            }
            if (words.length % 2 == 1) result += NUMBERS.get(words[words.length - 1]);
        } catch (NullPointerException e) {
            System.out.println("Incorrect input.");
        }
        return result;
    }
}

