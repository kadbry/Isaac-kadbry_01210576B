import java.util.Arrays;
import java.util.Scanner;

public class Sum2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        
        int[][] array = new int[rows][cols];
        
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Element at row [%d], column [%d]: ",i+1,j+1);
                array[i][j] = scanner.nextInt();
            }
        }
        
    
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += array[i][j];
            }
        }
        
        System.out.println("Sum of all elements in the 2D array: " + sum);
        
        scanner.close();
    }
}

