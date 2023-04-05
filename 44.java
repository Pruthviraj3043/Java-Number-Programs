import java.util.Scanner;
class Sum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value");
int n=sc.nextInt();
int sum=0;
for(int i=0;i<=n;i++)
{
sum+=i;
}
System.out.println("sum of the number is" +sum);
}
}
