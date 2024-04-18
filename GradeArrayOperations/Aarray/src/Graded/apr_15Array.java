package Graded;
import java.util.Arrays;
import java.util.Scanner;
public class apr_15Array {
public static void readArray(int[]grades) {
	System.out.printf("Give %d grades %n", grades.length);
	Scanner input = new Scanner(System.in);
	for(int i = 0; i < grades.length; i++) {
		grades[i] = input.nextInt();
	}
}
	public static int maxGrade(int [] b) {
		int max = b[0]; 
		for(int d = 1; d < b.length; d++ ) {
		if(max < b[d]) {
			max = b[d];
		}
		
		}
		return max;
	}
	public static double averageGrade(int [] A) {
		double sum = 0;
	
		for(int j = 0; j < A.length; j++ ) {
			sum = sum + A[j];
		}
		
		return sum/A.length;
}
	public static void main(String[] args) {
		System.out.println("Give the number of students");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int []grades = new int [n];
		readArray(grades);
		System.out.println(Arrays.toString(grades));
		System.out.println(averageGrade(grades));
		System.out.println(maxGrade(grades));
	}
}
