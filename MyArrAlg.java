package org.anzo.ArrAlg;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by andreyz on 10.09.16.
 */
public class MyArrAlg {

    public static void main(String[] args) {

        int[] array = {1, 6, 9, 11, 22, 25, 30};

        int sum = 47;

        System.out.println(elementSumm(array, sum));


    }

    public static boolean elementSumm(int[] array, int sum) {


        Boolean result = false;
        int lowIndex = 0;
        int hihgIndex = 0;
        for (int i = 0; i < array.length; ) {
            if (array[lowIndex] + array[array.length - (hihgIndex + 1)] == sum) {
                result = true;
                break;

            } else if (array[lowIndex] + array[array.length - (hihgIndex + 1)] > sum) {
                i++;
                hihgIndex++;
            } else if (array[lowIndex] + array[array.length - (hihgIndex + 1)] < sum) {
                i++;
                lowIndex++;

            }

        }

        return result;
    }

}
