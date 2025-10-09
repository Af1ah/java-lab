import java.util.Scanner;

public class matrix {
	static int[][] display(int a[][], int n, int m) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				System.out.print("	" + a[j][i]);
			}
			System.out.println();
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = 0;
		int cols = 0;
		System.out.print("Enter number of rows and columns(m x n): ");
		rows = sc.nextInt();
		cols = sc.nextInt();
		int[][] matrix = new int[rows][cols];
		int[][] transpose = new int[cols][rows];
		int trace = 0;

		if (rows != cols) {
			System.out.println("Please provide a square matrix.");
			return;
		}
		System.out.println("Enter the elements of the matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Enter element for the index " + i + " x " + j + ": ");
				matrix[i][j] = sc.nextInt();
				transpose[j][i] = matrix[i][j];
				if (i == j) trace += matrix[i][j];
			}
		}

		System.out.println("Original Matrix:");
		display(matrix, rows, cols);
		System.out.println("Transposed Matrix:");
		display(transpose, cols, rows);
		System.out.println("Trace of the matrix: " + trace);

	}
}