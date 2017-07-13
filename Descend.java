package Pro;

import java.util.ArrayList;
import java.util.Collections;

public class Descend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer> array=new ArrayList<Integer>();
 
          array.add(15);
          array.add(14);
          array.add(7);
          array.add(31);
          array.add(2);
          System.out.println("before");
          for(int x:array){
        	  System.out.println(x);
          }Collections.sort(array,Collections.reverseOrder());
          System.out.println("arraylist descending order");
          for(int x:array){
        	  System.out.println(x);
       }
	}   
}
