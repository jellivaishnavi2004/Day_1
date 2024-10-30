import java.util.Scanner;
class Test{
public static void checkEvenOdd(int a)
{
if((a/2)*2==a)
System.out.println("Even");
else 
System.out.println("Odd");
}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int n=scob.nextInt();
Test.checkEvenOdd(n);
}
}