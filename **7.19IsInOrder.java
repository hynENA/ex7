import java.util.Scanner;

public class IsInOrder {
	
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		System.out.println("Enter list: ");
		int n = cin.nextInt();
		int[] nums = new int[n];
		for(int i = 0; i < n; ++i)
			nums[i] = cin.nextInt();
		
		for(int i = 1; i < n; ++i){
			if(nums[i] < nums[i-1]){
				System.out.println("The list is not sorted");
				return;
			}
		}
		System.out.println("The list is already sorted");
	}	
}
