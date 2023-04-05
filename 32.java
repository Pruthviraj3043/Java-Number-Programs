import java.util.Scanner;
class Season
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int number=sc.nextInt();
switch(number)
{
case 1:System.out.println("winter is january");
break;
case 2:System.out.println("winter is febrauary");
break;
case 3:System.out.println("summer is march");
break;
case 4:System.out.println("summer is april");
break;
case 5:System.out.println("summer is may");
break;
case 6:System.out.println("rainy is june");
break;
case 7:System.out.println("rainy is july");
break;
case 8:System.out.println("rainy is august");
break;
case 9:System.out.println("spring is september");
break;
case 10:System.out.println("spring is october");
break;
case 11:System.out.println("spring is november");
break;
case 12:System.out.println("winteris december");
break;
default:System.out.println("Invalid input");
}
}
}