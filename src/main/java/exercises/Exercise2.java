/*
2. (1p) Implement exercise 1 but sorting the matrix using the mergesort algorithm.
 */

package exercises;

public class Exercise2 {
    public static void mergeSort(String[] v, int start, int size) {
        int longitud1, longitud2;

        if (size > 1) {
            longitud1 = size / 2;
            longitud2 = size - longitud1;

            mergeSort(v, start, longitud1);
            mergeSort(v,start + longitud1, longitud2);
            merge(v, start, longitud1, longitud2);
        }
    }

    private static void merge(String[] v, int start, int longitud1, int longitud2) {
        String[] buffer = new String[longitud1 + longitud2];
        int i1 = 0, i2 = 0, iBuffer = 0;

        while ((i1 < longitud1) && (i2 < longitud2)) {

            if (v[start + i1].compareTo(v[start + longitud1 + i2]) < 0) {
                buffer[iBuffer] = v[start + i1];
                i1++;
                iBuffer++;

            } else {
                buffer[iBuffer] = v[start + longitud1 + i2];
                i2++;
                iBuffer++;
            }
        }

        while (i1 < longitud1) {
            buffer[iBuffer] = v[start + i1];
            i1++;
            iBuffer++;
        }

        while (i2 < longitud2) {
            buffer[iBuffer] = v[start + longitud1 + i2];
            iBuffer++;
            i2++;
        }

        for (int i = 0; i < buffer.length; i++) {
            v[start + i] = buffer[i];
        }
    }
}
