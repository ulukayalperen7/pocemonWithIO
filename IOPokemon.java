import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
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

    public static void readFilterPokeStats(String filename) {

        try {

            File file = new File(filename + ".txt");
            Scanner input = new Scanner(file);

            input.nextLine();

            int counter = 0;
            while (input.hasNext()) {
                String linee = input.nextLine();
                counter++;
            }
            String[] pokemonsArray = new String[counter];
            int[] speedStatsArr = new int[counter];

            input.nextLine();

            int i = 0;
            while (input.hasNextLine()) {
                pokemonsArray[i] = input.nextLine();
                i++;
            }

            input.nextLine();

            int j = 0;

            while (input.hasNext()) {

                String name = input.next();
                String type1 = input.next();
                String type2 = input.next();

                int hpValue = Integer.parseInt(input.next());
                int attackValue = Integer.parseInt(input.next());
                int defenseValue = Integer.parseInt(input.next());
                int spdAttackValue = Integer.parseInt(input.next());
                int spdDefenseValue = Integer.parseInt(input.next());
                speedStatsArr[j++] = Integer.parseInt(input.next());
            }

            input.close();

            sorting(pokemonsArray,
                    speedStatsArr);

            HighestSpeed(pokemonsArray,
                    speedStatsArr);

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: There "
                    + "is no file named " + filename + ".txt");
        }
    }

    public static String[] readFilterPokeType(String filename, String poketype) {

        try (Scanner inp = new Scanner(new File(filename + ".txt"))) {
            int pokeCount = 0;
            while (inp.hasNextLine()) {
                pokeCount++;
                inp.nextLine();
            }
            String[][] pokemonsType = new String[pokeCount][3];
            Scanner input1 = new Scanner(new File(filename + ".txt"));
            input1.nextLine();
            for (int i = 0; i < pokemonsType.length; i++) {
                for (int j = 0; j < pokemonsType[i].length; j++) {
                    pokemonsType[i][j] = input1.next();
                }
                try {
                    input1.nextLine();
                } catch (NoSuchElementException p) {
                }
            }
            input1.close();
            int counterr = 0;
            for (String[] pokemon : pokemonsType) {
                for (String type : pokemon) {
                    if (type.equals(poketype)) {
                        counterr++;
                        break;
                    }
                }
            }
            int c = 0;
            String[] pokemonsWithRightType = new String[counterr];
            for (String[] pokemon : pokemonsType) {
                for (String type : pokemon) {
                    if (type.equals(poketype)) {
                        pokemonsWithRightType[c] = pokemon[0];
                        c++;
                        break;
                    }
                }
            }
            return pokemonsWithRightType;
        } catch (FileNotFoundException z) {
            System.out.println("ERROR: file not found");
        }
        return new String[0];
    }

    public static void readSortPokeStats(String datafile, String sortedfile) {

        try (Scanner input = new Scanner(new File(datafile + ".txt"));
                PrintWriter output = new PrintWriter(sortedfile)) {

            input.nextLine();

            int counter = 0;
            while (input.hasNext()) {
                input.nextLine();
                counter++;
            }

            String[] stats = new String[counter];

            input.nextLine();
            int i = 0;
            while (input.hasNext()) {
                stats[i] = input.nextLine();
                i++;
            }

            int[] totalStats = new int[counter];

            input.nextLine();

            i = 0;
            while (input.hasNext()) {
                String name = input.next();
                String type1 = input.next();
                String type2 = input.next();

                totalStats[i] = input.nextInt() + input.nextInt() + input.nextInt() +
                        input.nextInt() + input.nextInt() + input.nextInt();
                i++;
            }

            for (int k = 0; k < totalStats.length; k++) {
                for (int j = k + 1; j < totalStats.length; j++) {
                    if (totalStats[k] < totalStats[j]) {
                        swap(stats, k, j);
                        swap(totalStats, k, j);
                    }
                }
            }

            output.println("Name Type1 Type2 HP Attack Defense Sp.Atk Sp.Def Speed");
            for (String stat : stats) {
                output.println(stat);
            }

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found.");
        }
    }

    public static void swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void replaceNumbers(String filename1,
            String filename2, int oldNum, int newNum) {

        File file1 = new File(filename1 + ".log");

        File file2 = new File(filename2 + ".log");

        try {
            PrintWriter writer = new PrintWriter(file2);

            Scanner input = new Scanner(file1);

            Scanner scan = new Scanner(file1);

            while (scan.hasNext()) {
                try {
                    if (scan.nextInt() == oldNum) {
                        writer.println(newNum);
                        input.nextInt();
                    } else {
                        writer.println(input.nextInt());
                    }
                } catch (InputMismatchException l) {
                    scan.next();
                    input.next();
                }
            }
            input.close();
            scan.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found.");
        }

    }

    public static int[] intReader(String filename) {

        int[] array = new int[0];
        int count = 0;

        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNext()) {
                try {
                    if (scanner.hasNextInt()) {
                        int number = scanner.nextInt();
                        array = newArrayForEx2(array,
                                count + 1);
                        array[count] = number;
                        count++;
                    } else {
                        scanner.next();
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not"
                    + " found - " + e.getMessage());
        }
        return array;
    }

    public static int[] newArrayForEx2(int[] array, int newLengt) {
        int[] newArray = new int[newLengt];
        System.arraycopy(array, 0, newArray,
                0, Math.min(array.length, newLengt - 1));
        return newArray;
    }

    public static void sorting(String[] array, int[] speedStats) {
        int n = speedStats.length;
        for (int k = 0; k < n; k++) {
            for (int m = k + 1; m < n; m++) {
                if (speedStats[k] < speedStats[m]) {
                    swap(array, k, m);
                    swap(speedStats, k, m);
                }
            }
        }
    }

    public static void HighestSpeed(String[] pokemons, int[] speedStats) {
        swap(pokemons, 1, 4);
        System.out.println("Top 5 Pokémon "
                + "Based on Speed Stats:");
        for (int i = 0; i < Math.min(5, pokemons.length); i++) {
            System.out.println(pokemons[i]);
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