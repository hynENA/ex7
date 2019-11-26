import java.util.Scanner;
 
public class SortStudent{
	
	public static void main(String[] args){
    System.out.print("Enter total numbers: ")
		Scanner cin = new Scanner(System.in);
		int num = cin.nextInt();
		String[] names = new String[num];
		double[] grades = new double[num];
		
		for(int i = 0; i < num; ++i){
      System.out.print("Enter name: ")
			names[i] = cin.next();
      System.out.print("Enter grades: ")
			grades[i] = cin.nextDouble();
		}
		
		for(int i = 0; i < num-1; ++i){
			for(int j = i+1; j < num; ++j){
				if(grades[i] < grades[j]){
					double temp = grades[i];
					grades[i] = grades[j];
					grades[j] = temp;
					
					String tmp = names[i];
					names[i] = names[j];
					names[j] = tmp;
				}
			}
		}
		
		for(int i = 0; i < n; ++i){
			System.out.println(names[i] + "    " + grades[i]);
		}
	}	
 
}
