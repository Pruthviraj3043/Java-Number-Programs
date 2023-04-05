import java.util.Scanner;
class Spy
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
int product=1;
while(n>0)
{
int r=n%10;
sum+=r;
product*=r;
n/=10;
}
if(sum==product)
{
System.out.println("spy number");
}
else
{
System.out.println("not a spy number");
}
}
}