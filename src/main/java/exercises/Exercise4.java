/*
4. (4p) Create a two-dimensional vector containing the name and height of people.
The program should return the name of the people ordered by height in ascending
order. For that, use the insertion sort algorithm.
 */

package exercises;

public class Exercise4 {
    public static void main(String[] args) {

        String[][] persons = {{"MARIA", "1,47"}, {"JUAN", "1,91"}, {"LAURA", "1,63"}, {"DIEGO", "1,87"}, {"ANA", "1,22"},
                {"ALEJANDRO", "1,75"}, {"PATRICIA", "1,74"}, {"MANUEL", "1,90"}, {"CLARA", "1,89"}, {"JOSE", "1,41"}};

        insertion(persons);
        showMatrix(persons);
    }

    public static void insertion(String[][] array){
        String clave;

        for (int i = 1; i < array[0].length; i++) {

            clave = array[0][i];
            int j = i - 1;

            while (j >= 0 && array[0][j].compareTo(clave) > 0){
                array[0][j + 1] = array[0][j];
                j--;
            }

            array[0][j + 1] = clave;
        }
    }

    public static void showMatrix(String[][] matrix) {

        for (String[] strings : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(strings[j] + " ");
            }

            System.out.println();
        }
    }
}
