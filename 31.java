import java.util.Scanner;
class MonthName
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int number=sc.nextInt();
switch(number)
{
case 1:System.out.println(number+" is january");
break;
case 2:System.out.println(number+" is febrauary");
break;
case 3:System.out.println(number+" is tmarch");
break;
case 4:System.out.println(number+" is april");
break;
case 5:System.out.println(number+" is may");
break;
case 6:System.out.println(number+" is june");
break;
case 7:System.out.println(number+" is july");
break;
case 8:System.out.println(number+" is august");
break;
case 9:System.out.println(number+" is september");
break;
case 10:System.out.println(number+" is october");
break;
case 11:System.out.println(number+" is november");
break;
case 12:System.out.println(number+"is december");
break;
default:System.out.println("Invalid input");
}
}
}