class CountDivisible
{
public static void main(String[] args)
{
int i=88;
int count=0;
for(i=88;i<=199;i++)
{
if(i%3==0 && i%7==0)
{
count++;
}
}
System.out.println(count);
}
}