import java.util.Scanner;
class StrongNumber{
public static void main(String[] args)
{
for(int i=1;i<=1000;i++)
{
int sum=0;
int temp=i;
while(i>0)
{
int rem=i%10;
i=i/10;
for(int j=1;j<=rem;j++)
{
int product=1;
product=product*i;
}
sum=sum+product;
}
if(sum==temp)
{
System.out.println(temp+"  are strong number");
}
}
}
}