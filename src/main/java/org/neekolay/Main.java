package org.neekolay;

import java.util.TreeMap;

public class Main {

    final static TreeMap<Integer, String> numbersMap = new TreeMap<Integer, String>();
    static volatile boolean isRunning = true;

    public static void main(String[] args) throws InterruptedException {

        Thread readingThread = new ReadingThread();
        Thread deletingThread = new DeletingThread();

        readingThread.start();
        deletingThread.start();

    }

}