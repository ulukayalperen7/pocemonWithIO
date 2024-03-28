# HERE IS THE DESCRIPTION OF THE METHODS: 

```java
public static void intLogger(String filename) {
        /*
         * Write a method that logs all integers entered to the console.
         * Your method must handle FileNotFoundException and
         * InputMismatchException exceptions.
         * Exception handling message should take only one line in console.
         * Each input has to be logged in separate line.
         * If non-integer number entered to the console: log it as
         * "non-integer-input" (without ") to the text file (specified
         * with filename). And continues to take inputs.
         * Take inputs until 0 entered. (log 0 too.) 
         * Args:
         * filename: String that specifies the target log file.
         */
    }
```
```java
public static int[] intReader(String filename) {
        /*
         * Write a method that reads all integers from the log file
         * you created in the previous Question 1.
         * Your method must handle FileNotFoundException and
         * InputMismatchException exceptions.
         * Exception handling message should take only one line in console.
         * 
         * Args:
         * filename: String that specifies the target log file.
         * Returns:
         * int[]: Integer Array that stores the integers in the
         * log file.
         */
    }
```
```java
public static void replaceNumbers(String filename1,
            String filename2, int oldNum, int newNum) {
        /*
         * Write a method that replaces the numbers in the source log file you created
         * in Question 1 and save the edited version to the new log file.
         * Your method must handle FileNotFoundException
         * Exception handling message should take only one line in console.
         * Your method must replace the exact numbers into the new number.
         * Example: oldNum=100 newNum=255: All 100s will replaced with 255 but 1000s
         * stays same. (1000 should not be replaced to 2550)
         * Args:
         * filename1: String that specifies the source log file.
         * filename2: String that specifies the edited new log file.
         * oldNum: The Number to be replaced in the log file.
         * newNum: The Number to be replaced in the log file.
         *
         * Some Pokémon names that can be troublesome (Has spaces or non-alphabetic
         * characters) are fixed.
         * If you implemented any strategies for handling this situations, you may
         * revert it back.
         * You must handle the data file regardless of the number of rows
         */
    }
```
### Example Pokémon Data:
- Name Type1 Type2 HP Attack Defense Sp.Atk Sp.Def Speed
- Bulbasaur Grass Poison 45 49 49 65 65 45
- Ivysaur Grass Poison 60 62 63 80 80 60
- Venusaur Grass Poison 80 82 83 100 100 80
- Charmander Fire null 39 52 43 60 50 65
- Charmeleon Fire null 58 64 58 80 65 80
- Charizard Fire Flying 78 84 78 109 85 100
- Squirtle Water null 44 48 65 50 64 43
- Wartortle Water null 59 63 80 65 80 58
- Blastoise Water null 79 83 100 85 105 78
- Caterpie Bug null 45 30 35 20 20 45
- Metapod Bug null 50 20 55 25 25 30
- Butterfree Bug Flying 60 45 50 90 80 70
-  Weedle Bug Poison 40 35 30 20 20 50
- Kakuna Bug Poison 45 25 50 25 25 35
- Beedrill Bug Poison 65 90 40 45 80 75
- Pidgey Flying Normal 40 45 40 35 35 56

```java
public static void readSortPokeStats(String datafile, String sortedfile) {
        /*
         * Write a method that reads pokemon data from a file and sort pokémons
         * by their total base stats in descending order and writes the sorted
         * data on a new file in the same format.
         * Data Header in the file is:
         * "Name Type1 Type2 HP Attack Defense Sp.Atk Sp.Def Speed"
         * Your method must handle FileNotFoundException
         * Exception handling message should take only one line in console.
         * Args:
         * datafile: String that specifies the target data file.
         * sortedfile: String that specifies the new data file that
         * will contain the sorted data. 
         */
    }
```
```java
public static String[] readFilterPokeType(String filename, String poketype) {
        /*
         * Write a method that reads pokemon data from a file and filters
         * the pokémons with the specified type and returns the names
         * of the pokémons with specified types as String Array
         * Example: For the data above, poketype="Flying": the output
         * should be ["Charizard", "Butterfree", "Pidgey"]
         * Exception handling message should take only one line in console. 
         * Args:
         * filename: String that specifies the target data file.
         * poketype: String that represents the target Pokémon type.
         * (Do not print a message for non-existant Pokémon types
         * just return an empty string array in that case.)
         * Returns:
         * String[]: String that contains the Pokémon names of the specified type. 
         */
    }
```

```java
public static void readFilterPokeStats(String filename) {
    /*
         * Write a method that reads pokemon data from a file and filters
         * and prints the 5 pokémons with the highest Speed stat along
         * with the data header to the console.
         * Print them with their stats without sorting.
         * Exception handling message should take only one line in console. 
         * Args:
         * filename: String that specifies the target data file.
         */
}
```