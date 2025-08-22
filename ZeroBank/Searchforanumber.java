package Array_practice;
import java.util.Scanner;
public class Searchforanumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a array:\n");
		int[] arr=new int[8];
		System.out.println("Enter a number to search in given array:\n");
		int s=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==s) {
				System.out.println("the number is at the "+i+"th position in the array");
				
			}
			else {
				System.out.println("Entered number is not present in the array");
			}
		}
		sc.close();
		
	}

}
