import java.util.Scanner;
class findarea
{
  public static void main(String args[])
    {
       double pi=3.14,area;
       Scanner S=new Scanner(System.in);
       System.out.println("Enter the Radius of the circle");
       int radius=S.nextInt();
	area=pi*radius*radius;
       System.out.("area of the circle is"+area);
    }
}	      