package arraydemo;

import java.util.Scanner; 

public class ArrayDemo {

    public static void main(String[] args) {
        
        oneDimArray();
        // twoDimArray(); 
    }

    static void oneDimArray() {
        int[] numbers;
        numbers = new int[5];
        int i = 0;

        System.out.println(" oneDimArray, length: " + numbers.length);
        Scanner kbdInput = new Scanner(System.in); 
        for (i = 0; i < numbers.length; i++) {      
            System.out.print("Bitte Zahl eingeben: ");
            numbers[i] =  kbdInput.nextInt(); // i * i;
            System.out.println();
        }
        
        for (i = 0; i < numbers.length; i = i + 1) {
            System.out.print(numbers[i] + ", ");
        }
        
        for (i = numbers.length - 1; i >= 0; i = i - 1) {
            System.out.print(numbers[i] + ", ");
        }

        System.out.println();
        int[] values = {2, -3, 7, 4, -1, -9, -2, 4};
        printIntArray(numbers);
        printIntArray(values);
        absValues(values);
        printIntArray(values);
        System.out.println("--- done ---");
    }

    static void absValues(int[] values) {
        if (values == null) {
            return;
        }
        for (int i = 0; i < values.length; i = i + 1) {
            if (values[i] < 0) {
                values[i] = -values[i];
            }
        }
    }

    static void printIntArray(int[] intArr) {
        if (intArr == null) {
            return;
        }
        for (int v : intArr) {
            System.out.print(v + ", ");
        }
        System.out.println();
    }

    static void twoDimArray() {
        int[][] tdArr;

        tdArr = new int[4][5];
        System.out.println(" twoDimArray, length: " + tdArr.length);
        for (int i = 0; i < tdArr.length; i++) {
            for (int j = 0; j < tdArr[i].length; j++) {
                tdArr[i][j] = 10 * (i + 1) + j + 1;
                System.out.printf("tdArr[%d][%d]: %2d,  ", i, j, tdArr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        System.out.println(" second variant:");
        tdArr = new int[3][];
        tdArr[0] = new int[4];
        tdArr[1] = new int[2];
        tdArr[2] = new int[3];

        for (int i = 0; i < tdArr.length; i++) {
            for (int j = 0; j < tdArr[i].length; j++) {
                tdArr[i][j] = 10 * (i + 1) + j + 1;
                System.out.printf("tdArr[%d][%d]: %2d,  ", i, j, tdArr[i][j]);
            }
            System.out.println();
        }
    }
}
