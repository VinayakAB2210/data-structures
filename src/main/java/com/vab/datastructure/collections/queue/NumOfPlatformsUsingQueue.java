package com.vab.datastructure.collections.queue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class NumOfPlatformsUsingQueue {

    public static void main(String[] args) {
        int[] arr = { 100, 300, 600 };
        int[] dep = { 900, 400, 500 };

        System.out.println(calculateMinPatforms(arr, dep, arr.length));
    }

    public static int calculateMinPatforms(int at[], int dt[], int n) {

        TrainSchedule trainSchedules[] = new TrainSchedule[at.length];

        for(int i=0; i<at.length; i++) {
            trainSchedules[i] = new TrainSchedule(at[i], dt[i]);
        }

        Arrays.sort(trainSchedules, new SortByArrival());

        PriorityQueue<Integer> depTmQueue = new PriorityQueue<>();
        depTmQueue.add(trainSchedules[0].getDepTm());

        int count = 1;

        for(int i=1; i<at.length; i++) {
            TrainSchedule ts = trainSchedules[i];

            if(depTmQueue.peek() < ts.getArrTm()) {
                depTmQueue.poll();
            } else {
                count++;
            }

            depTmQueue.add(ts.getDepTm());
        }

        return count;
    }

    private static class TrainSchedule {
        public int arr_tm;
        public int dep_tm;

        public TrainSchedule(int arr_tm, int dep_tm) {
            this.arr_tm = arr_tm;
            this.dep_tm = dep_tm;
        }

        public int getArrTm() {
            return arr_tm;
        }

        public int getDepTm() {
            return dep_tm;
        }

        public void setArrTm(int arr_tm) {
            this.arr_tm = arr_tm;
        }

        public void setDepTm(int dep_tm) {
            this.dep_tm = dep_tm;
        }
    }

    private static class SortByArrival implements Comparator<TrainSchedule> {

        @Override
        public int compare(TrainSchedule t1, TrainSchedule t2) {
            return t1.getArrTm() - t2.getArrTm();
        }
    }


    
}
