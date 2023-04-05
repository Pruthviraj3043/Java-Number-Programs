import java.util.Scanner;
class SumProductEven
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();
int sum=0;
int product=1;
for(int i=m;i<=n;i++)
{
if(i%2==0)
{
product *=i;
sum +=i;
}
System.out.println("product is " +product);
System.out.println("sum is " +sum);
}
}
}