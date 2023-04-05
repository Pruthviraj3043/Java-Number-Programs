import java.util.Scanner;
class Army
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter age");
int age=sc.nextInt();
System.out.println("weight");
int weight=sc.nextInt();
System.out.println("height");
double height=sc.nextInt();
if(age>=18 && weight>=60 && height>5.8)
{
System.out.println("elgible");
}
else{
System.out.println("not elgible");
}
}
}