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
        int j = 0;
        int k = 0;
        for (int i = 0; i < array.length; ) {
            if (array[j] + array[array.length - (k + 1)] == sum) {
                result = true;
                break;

            } else if (array[j] + array[array.length - (k + 1)] > sum) {
                i++;
                k++;
            } else if (array[j] + array[array.length - (k + 1)] < sum) {
                i++;
                j++;

            }

        }

        return result;
    }

}
