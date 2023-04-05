import java.util.Scanner;
class Shaadi
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to the Shaadi.com");
System.out.println("Enter the Age");
int age=sc.nextInt();
if(age>=21)
{
System.out.println("You are Elgible");
}
else{
System.out.println("You are not Elgible");
}
}
}
