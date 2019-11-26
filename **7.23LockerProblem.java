public class LockerProblem {
    
    public static void main(String[] args) {
    	
       boolean[] locker = new boolean[100];
       
       for(int i =0;i<100;i++){
           locker[i]=false;
       }
       
       for(int m =1;m<=100;m++){
           for(int n =m;n<=100;n+=m){
               
               locker[n-1]=!locker[n-1];
               
           }
       }
       
       for(int t =0;t<100;t++){
           if(locker[t])
        	   System.out.print(t+1+" ");
       }
    }  
}
