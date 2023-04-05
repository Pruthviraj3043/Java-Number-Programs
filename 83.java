
class AmstrongNumber
{
public static void main(String[] args)
{

int count=0;

for(int i=1;i<=1000;i++)
{
int num=i;
int temp=i;

while(i>0)


{
count++;
i=i/10;
}
int sum=0;
while(temp>0)
{          
int r=temp%10;
int product=1;
for(int j=1;j<=count;j++)
{
product=product*r;
}
sum=sum+product;
temp/=10;
}
}
if(i==sum)
{
System.out.println(sum);
}
}
}