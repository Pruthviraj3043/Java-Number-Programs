import java.util.Scanner;
class Neon{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int sqr=n*n;
int sum=0;
while(sqr>0)
{
int r= sqr%10;
sum=sum+r;
sqr=sqr/10;
}
if(sum==n)
{
System.out.println(n+"is a neon number");
}
else
{
System.out.println(n+"is a not neon number");
}
}
}