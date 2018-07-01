import java.io.*;
import java.util.*;
class Reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String s=Integer.toString(n);
int i,rev;
String s1="";
for(i=s.length()-1;i>=0;i--)
{
s1=s1+s.charAt(i);
}
rev=Integer.parseInt(s1);
System.out.println(rev);
}
}
