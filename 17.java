import java.util.Scanner;
class Upsc
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Welcome!");
System.out.println("Enter Your age");
int age=sc.nextInt();
if (age>=21 && age<35)
{
System.out.println("You are elgible");
}
else
{
System.out.println("You are not elgible");
}
}
}
 