import java.util.Scanner;
class DivideRemainder
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter m number");
int m=sc.nextInt();
System.out.println("Enter n number");
int n=sc.nextInt();
while(m>=n)
{
m-=n;
}
System.out.println("remainder is:"+m);
}
}
