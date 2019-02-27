package org.neekolay;

import java.util.concurrent.locks.Lock;

import static org.neekolay.Main.isRunning;
import static org.neekolay.Main.numbersMap;

public class DeletingThread extends Thread {

    @Override
    public void run() {
        while (isRunning) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (numbersMap) {
                if (!numbersMap.isEmpty()) {
                    System.out.println("deleting " + numbersMap.firstKey());
                    numbersMap.remove(numbersMap.firstKey());
                    System.out.println("Numbers in memory = " + numbersMap.keySet());
                    System.out.println();
                }
            }

        }
    }
}

