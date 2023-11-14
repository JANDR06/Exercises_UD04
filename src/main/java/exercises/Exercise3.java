/*
3. (1p) Implement exercise 1 but sorting the matrix using the quicksort algorithm.
 */

package exercises;

public class Exercise3 {

    // QuickSort method that orders the vector in ascending order (A-Z)
    public static void quickSort(String[] v, int left, int right) {
        String pivot = v[(left + right) / 2];

        int i = left;
        int d = right;

        do {

            while (v[right].compareTo(pivot) > 0) {
                right--;
            }

            while (v[left].compareTo(pivot) < 0) {
                left++;
            }

            if (left <= right) {
                Exercise1.swap(v, left, right);
                left++;
                right--;
            }

        } while (left < right);

        if (left < d) {
            quickSort(v, left, d);
        }

        if (right > i) {
            quickSort(v, i, right);
        }

    }
}
