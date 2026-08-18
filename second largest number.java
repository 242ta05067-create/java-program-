import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int a[]=new int[n];
	   for(int i=0;i<n;i++){
	       a[i]=sc.nextInt();
	   }
	   int m1=a[0],m2=a[0];
	   for(int i=1;i<n;i++){
	       if(m1<a[i]){
	           m1=a[i];
	           
	       }
	       else if(m1!=a[i] && m2<a[i]){
	           m2=a[i];
	       }
	   }
	       System.out.println(m2);
	}
}
