import java.util.Scanner;
import java.util.Arrays;

public class CountTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int inf = 101;
		System.out.print("Enter the integers between 1 and 100: ");
		Scanner input = new Scanner(System.in);
		int[] num = new int[100];
		int count = 0;
		while(true) {
			int temp = input.nextInt();
			if(temp == 0)
				break;
			num[count] = temp;
			count++;
		}
		Arrays.sort(num,0,count);
		int time = 0;
		for(int i = 0;i < count; i++){
			if(num[i] != inf) {
				time = 0;
				for(int j = 0; j < count; count++) {
					if(num[i] == num[j]) {
						time++;
						if(i != j)
							num[j] = inf;
					}
				}
				System.out.println(num[i] + " occurs " + time + (time > 1 ? " times" : " time"));
			}
		}
	}

}
