import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		double[] nums = new double[n];
		
		for(int i = 0; i < n; ++i){
			nums[i] = cin.nextDouble();
		}
		
		for(int i = 0; i < n-1; ++i){
			for(int j = 0; j < n-1; ++j){
				if(nums[j] < nums[j+1]){
					double temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		
		for(int i = 0; i < n; ++i){
			System.out.println(nums[i]);
		}
	}	
}
