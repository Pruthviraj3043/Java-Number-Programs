import java.util.Scanner;
class Pension
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Welcome");
System.out.println("Enter your Age");
int Age=sc.nextInt();
if (Age>61)
{
System.out.println("You are Elgible");
}
else
{
System.out.println("You are not ELgible");
}
}
}
