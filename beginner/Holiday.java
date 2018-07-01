import java.io.*;
import java.util.*;
class Holiday{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String leave="Saturday";
String leave1="Sunday";
if(s.equalsIgnoreCase(leave) || s.equalsIgnoreCase(leave1))
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}
}
