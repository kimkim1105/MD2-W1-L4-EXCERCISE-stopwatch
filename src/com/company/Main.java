package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        StopWatch stopWatch = new StopWatch();
        SelectionSort doJob = new SelectionSort();
        Random random = new Random();
        int[] arr = new int[50000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
//        System.out.println("Mảng ban đầu:");
//        doJob.showArray(arr);
        stopWatch.start();
        System.out.println(stopWatch.getStartTime());
        doJob.sort(arr);
        stopWatch.stop();
        System.out.println(stopWatch.getEndTime());
        System.out.println("\nThời gian " + stopWatch.getElapsedTime());
//        System.out.println("Mang sau:");
//        doJob.showArray(arr);
    }
}
