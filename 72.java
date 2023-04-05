
class NeonNumbers{
public static void main(String[] args)
{
for(int i=0;i<10;i++)
{
int sum=0;
for(int j=0;j<=i;j++)
{
int sqr=i*i;
while(sqr>0)
{
int r= sqr%10;
sum=sum+r;
sqr=sqr/10;
}
if(sum==i)
{
System.out.println(i+" are neon number");
}
}
}
}
}