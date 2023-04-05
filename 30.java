import java.util.Scanner;
class DayNumber
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Day");
String day=sc.next();
switch(day)
{
case"monday":System.out.println(day+"is 1st day of week");
break;
case"tuesday":System.out.println(day+"is 2st day of week");
break;
case"wednesday":System.out.println(day+"is 3st day of week");
break;
case"thursday":System.out.println(day+"is 4st day of week");
break;
case"friday":System.out.println(day+"is 5st day of week");
break;
case"saturday":System.out.println(day+"is 6st day of week");
break;
case"sunday":System.out.println(day+"is 7st day of week");
break;
default:System.out.println("invalid input");
}
}
}