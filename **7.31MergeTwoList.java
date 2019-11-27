import java.util.Scanner;
 
public class MergeTwoList {
	
	public static void main(String[] args){
		int[] arr1 = new int[6];
		int[] arr2 = new int[5];
		Scanner cin = new Scanner(System.in);
		System.out.print("Enter list1:");
		for(int i = 0; i < arr1.length; ++i)
			arr1[i] = cin.nextInt();
		System.out.print("Enter list2:");
		for(int i = 0; i < arr2.length; ++i)
			arr2[i] = cin.nextInt();
		
		int[] result = merge(arr1, arr2);
		
		for(int i = 0; i < result.length; ++i){
			if(result[i] != 0){
				for(int j = 0; j < result[i]; ++j)
					System.out.print(i + " ");
			}
		}
	}
 
	public static int[] merge(int[] list1, int[] list2){
		int max = 0;
		for(int i = 0; i < list1.length; ++i){
			if(list1[i] > max)
				max = list1[i];
		}
		
		for(int i = 0; i < list2.length; ++i){
			if(list2[i] > max)
				max = list2[i];
		}
		
		int[] array = new int[max+1];
		
		for(int i = 0; i < list1.length; ++i)
			++array[list1[i]];
		
		for(int i = 0; i < list2.length; ++i)
			++array[list2[i]];
		
		return array;
	}
}
