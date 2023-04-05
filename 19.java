import java.util.Scanner;
class Postive
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int number=sc.nextInt();
if(number>0)
{
System.out.println(number+"is positive Number");
}
else if(number<0)
{
System.out.println(number+"is negative number");
}
else
{
System.out.println(number+"is a zero");
}
}
}