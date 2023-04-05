import java.util.Scanner;
class SumAgain
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
while(n>0)
{
int r=n%10;
sum+=r;

n/=10;
}
if(sum>=26)
{
int a=sum;
sum=0;
while(a>0)
{
int r=a%10;
sum+=r;
a/=10;
}
}
System.out.println(sum);
}
}
