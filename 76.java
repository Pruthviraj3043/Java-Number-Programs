import java.util.Scanner;
class Sunny
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
int count=0;
for(int i=1;i<=n;i++)
{
if(i*i==n+1)
{
count++;
break;
}
}
if(count>0)
{
System.out.println(" it is sunny number");
}
else
{
System.out.println(" it is not sunny number");
}
}
}
