
class PerfectSquareUpto
{
public static void main(String[] args)
{
for(int i=1;i<=500;i++)
{
int count=0;
for(int j=1;j<=i;j++)
{
if(j*j==i)
{
count++;
break;
}
}
if(count>0)
{
System.out.println(i+"perfect number");
}
}
}
}