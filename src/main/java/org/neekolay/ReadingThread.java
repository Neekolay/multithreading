package org.neekolay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.neekolay.Main.isRunning;
import static org.neekolay.Main.numbersMap;

public class ReadingThread extends Thread {

    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (isRunning) {
            try {
                String inputText = reader.readLine();
                if (inputText.equals("stop")) {
                    isRunning = false;
                    return;
                }
                int number = NumbersService.toInt(inputText);
                if (number != 0) {
                    numbersMap.put(number, "text");
                    System.out.println("adding " + number);
                    System.out.println("Numbers in memory - " + numbersMap.keySet());
                    System.out.println();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
