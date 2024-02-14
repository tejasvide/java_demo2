import java.util.Scanner;
import java.lang.Math;
class prgmsqr
{
  public static void main(String args[])
    {
	Scanner S=new Scanner(System.in);
	System.out.println("Enetr the number");
	int number=S.nextInt();
	double result=Math.sqrt(number);
	System.out.println("Squareroot of "+number+"="+result);
    }
}