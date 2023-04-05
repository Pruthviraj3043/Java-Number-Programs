import java.util.Scanner;
class Check
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int number=sc.nextInt();
int countEven=0;
int countOdd=0;
for(int i=1;i<=number;i++)
{
if(i%2==0)
{
countEven++;
}
else{
countOdd++;
}
}
System.out.println(countEven);
System.out.println(countOdd);
}
}

