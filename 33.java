import java.util.Scanner;
class NumberOfDays
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int number=sc.nextInt();
switch(number)
{
case 1:System.out.println("january month has 31days");
break;
case 2:System.out.println("febrauary month has 28days");
break;
case 3:System.out.println("march month has 31days");
break;
case 4:System.out.println("april month has 30days");
break;
case 5:System.out.println("may month has 31days");
break;
case 6:System.out.println("june month has 30days");
break;
case 7:System.out.println("july month has 31days");
break;
case 8:System.out.println("august month has 31days");
break;
case 9:System.out.println("september month has 30days");
break;
case 10:System.out.println("october month has 31days");
break;
case 11:System.out.println("november month has 30days");
break;
case 12:System.out.println("december month has 31days");
break;
default:System.out.println("Invalid input");
}
}
}