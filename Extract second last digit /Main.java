import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
        Scanner in=new Scanner (System.in);
      int l=in.nextInt();
      int i=0;
      while(l>100)
      {
        l=l%100;
	  }
      int n=l/10;
      System.out.println(n);
    }
}