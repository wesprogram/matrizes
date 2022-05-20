
/** Exercise is part of Professor Nelio Alves' Java course from UDEMY, where you are asked to enter the size of the matrix and data, the integer values of the matrix, and then a value to search.
The system should return if the value entered is in the array, if it is in which position and who is around it. Prints in Brazilian Portuguese */

package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho da matriz: ");
		System.out.print("Entre com o número de linhas: ");
		int n = sc.nextInt();
		System.out.print("Entre com o número de colunas: ");
		int m = sc.nextInt();
		int [][] mat = new int [n][m];
		
		System.out.println("Insira os valores da matriz: ");
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("Digite sua busca: ");
		int search = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == search) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		sc.close();

	}

}
