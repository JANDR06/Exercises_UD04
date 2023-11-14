/*
1. (4p) Giving a vector having an unsorted set of String elements (in upper case),
return the vector sorted in ascending order (from A to Z) by using the selection
sort algorithm.
 */

package exercises;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {

        String[] strings = {"MARIA", "JUAN", "LAURA", "DIEGO", "ANA", "ALEJANDRO", "PATRICIA", "MANUEL", "CLARA", "JOSE",
                "ANDRES", "SANDRA", "CARMEN", "RAUL", "VERONICA", "LUCAS", "JAVIER", "CRISTOBAL", "SANTIAGO", "LUIS"};

        selection(strings);
        Exercise2.mergeSort(strings, 0, strings.length);
        Exercise3.quickSort(strings, 0, strings.length - 1);

        System.out.println(Arrays.toString(strings));
    }

    public static void selection(String[] array){
        int posMin;

        for (int i = 0; i < array.length - 1; i++) {
            posMin = i;

            for (int j = i+1; j < array.length; j++) {
                if (array[j].compareTo(array[posMin]) < 0) {
                    posMin = j;
                }
            }

            swap(array, i, posMin);
        }

    }

    public static void swap(String[] array, int i, int j){
        String aux = array[j];
        array[j] = array[i];
        array[i] = aux;
    }
}
