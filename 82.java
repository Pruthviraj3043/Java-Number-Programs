import java.util.Scanner;
class Amstrong
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int num=n;
int sum=0;
int count=0;
int temp=n;
while(n>0)
{
count++;
n=n/10;
}
while(temp>0)
{          
int r=temp%10;
int product=1;
for(int i=1;i<=count;i++)
{
product=product*r;
}
sum=sum+product;
temp/=10;
}
if(sum==num)
{
System.out.println("Armstrong");
}
else{
System.out.println("Not Armstrong");
}
}
}