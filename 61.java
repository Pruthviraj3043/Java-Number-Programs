import java.util.Scanner;
class SumAndProduct
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
System.out.println("sum and product are equal");
}
else
{
System.out.println("sum and product are not equal");
}
}
}