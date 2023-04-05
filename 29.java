import java.util.Scanner;
class MonthNumber
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Month");
String month=sc.next();
switch(month)
{
case"january":System.out.println(month+" is 1st");
break;
case"febrauary":System.out.println(month+" is 2st");
break;
case"march":System.out.println(month+" is 3st");
break;
case"april":System.out.println(month+" is 4st");
break;
case"may":System.out.println(month+" is 5st");
break;
case"june":System.out.println(month+" is 6st");
break;
case"july":System.out.println(month+" is 7st");
break;
case"august":System.out.println(month+" is 8st");
break;
case"september":System.out.println(month+" is 9st");
break;
case"october":System.out.println(month+" is 10st");
break;
case"november":System.out.println(month+" is 11st");
break;
case"december":System.out.println(month+"is 12st");
break;
default:System.out.println("Invalid input");
}
}
}
