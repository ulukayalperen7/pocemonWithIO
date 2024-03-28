import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IOPokemon {
    public static void main(String[] args) {

    }

    public static void intLogger(String filename) {
        try (Scanner scanner = new Scanner(System.in);
                PrintWriter writer = new PrintWriter(new File(filename))) {

            System.out.println("Enter the integers:");
            while (true) {
                try {
                    int input = scanner.nextInt();
                    if (input == 0) {
                        writer.println(input);
                        System.out.println("Exiting...");
                        break;
                    }
                    writer.println(input);

                } catch (InputMismatchException e) {
                    System.out.println("non-integer-"
                            + "input");
                    writer.println("non-integer-"
                            + "input");
                    scanner.next();
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not "
                    + "found - " + e.getMessage());
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void display(int[] array) {
        for (int i : array) {
            System.out.printf("%d\t", i);
        }
        System.out.println();
    }

    public static void display(char[] array) {
        for (int i : array) {
            System.out.printf("%c\t", i);
        }
        System.out.println();
    }

    public static void display2D(int[][] array2D) {
        for (int[] row : array2D) {
            display(row);
        }
        System.out.println("--------------------------");
    }

    public static void display2D(char[][] array2D) {
        for (char[] row : array2D) {
            display(row);
        }
        System.out.println("--------------------------");
    }

    public static int[][] generateArray2D(int m,
            int n, int start, int end) {
        int[][] array2D = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array2D[i][j] = random(start, end);
            }
        }

        return array2D;
    }

    public static int random(int start, int end) {
        return start + (int) (Math.random()
                * (end - start + 1));
    }

    public static double round(double value, int places) {

        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

}