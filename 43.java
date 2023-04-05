import java.util.Scanner;
class QuotientMn
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter m value");
int m=sc.nextInt();
System.out.println("Enter n value");
int n=sc.nextInt();
int count=0;
while(m>=n)
{
m-=n;
count++;
}
System.out.println("quotient is"+count);
}
}