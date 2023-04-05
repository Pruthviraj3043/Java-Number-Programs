import java.util.Scanner;
class PerfectSquare
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
int count=0;
for(int i=1;i<=n;i++)
{
if(i*i==n)
{
count++;
break;
}
}
if(count>0)
{
System.out.println(n+"perfect number");
}
else
{
System.out.println(n+" not perfect number");
}
}
}