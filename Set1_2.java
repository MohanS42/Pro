package Pro;
import java.util.*;
public class Set1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp,i=0,j=0;
         Scanner sc=new Scanner(System.in);
         int num[]=new int[5];
      
         System.out.println("enter the 5 elements");
        for(i=0;i<5;i++)
          num[i]=sc.nextInt();
          temp=num[0];
      for(i=0;i<5;i++){
    	  for(j=i;j<5;j++){
    		  if(num[i]>num[j]){
    			  temp=num[i];
    			  num[i]=num[j];
    			  num[j]=temp;
    		  }
    			  
    	  }
      }
      for(i=0;i<2;i++)
    	  System.out.print(num[i]);
    	  
      
      
	}
      
}
