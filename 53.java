import java.util.Scanner;
class CountTheDigit
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int temp=n;
int count=0;
while(n>0)
{
count++;
n/=10;
}
System.out.println(count);
}
}