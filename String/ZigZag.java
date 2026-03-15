/* 6 The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R 
 */
package String;

public class ZigZag {

    // Function to convert the string into Zigzag pattern
    public String convert(String s, int numRows) {

        // If only one row OR rows are greater than string length
        // then zigzag pattern will be same as original string
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        // Create an array of StringBuilder to store characters for each row
        StringBuilder[] rows = new StringBuilder[numRows];

        // Initialize each row
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        // Start from the first row
        int currentRow = 0;

        // Direction flag: true = moving down, false = moving up
        boolean goingDown = false;

        // Traverse each character in the string
        for (char c : s.toCharArray()) {

            // Append character to current row
            rows[currentRow].append(c);

            // If we reach the top row or bottom row, reverse the direction
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Move to the next row depending on direction
            currentRow += goingDown ? 1 : -1;
        }

        // Combine all rows to get the final result
        StringBuilder result = new StringBuilder();

        for (StringBuilder row : rows) {
            result.append(row);
        }

        // Return the final zigzag converted string
        return result.toString();
    }

    // Main method to test the program
    public static void main(String[] args) {

        ZigZag obj = new ZigZag();

        String s = "PAYPALISHIRING";
        int numRows = 3;

        String result = obj.convert(s, numRows);

        System.out.println("Original String: " + s);
        System.out.println("ZigZag Converted String: " + result);
    }
}