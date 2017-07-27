package rough;
import java.util.*;
public class Pattern{
public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	  int num=1;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the Seed :");
	  String temp1=sc.next();
		    char[] a1=temp1.toCharArray();
	  for(int i=0;i<temp1.length();i++)
	  {
	        int a=Character.getNumericValue(a1[i]);
	         num*=a;
	    }
	    int n1=Integer.valueOf(temp1);
	    num*=n1;
	    System.out.println(num);

        sc.close();
	}
	}
	