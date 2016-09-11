package org.anzo.ArrAlg;

/**
 * Created by andreyz on 11.09.16.
 */
public class MyArrIndex {


    public static void main(String[] args) {

        System.out.println(FindArrIndex());

    }


    public static int FindArrIndex() {

        int[] array = {2, 5, 6, 8, 10};

        int number = 8;
        int lowIndex = 0;
        int hihgIndex = array.length - 1;

        while (lowIndex <= hihgIndex) {

            int midleIndex = (hihgIndex + lowIndex) / 2;
            if (array[midleIndex] == number) {
                return midleIndex;
            }
            if (array[midleIndex] > number) {
                hihgIndex = midleIndex;
            } else
                lowIndex = midleIndex;
        }
        return -1;
    }
}
