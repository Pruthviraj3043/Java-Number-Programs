import java.util.Scanner;
class SumProduct
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter m value");
int m=sc.nextInt();
System.out.println("Enter n value");
int n=sc.nextInt();

int product=1;
int sum=0;

for(int i=m;i<=n;i++)
{
product*=i;
sum+=i;
}
System.out.println("sum of the number is" +product);
System.out.println("product of the number is" +sum);
}
}