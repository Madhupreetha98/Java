import java.io.*;
import java.util.*;
class Substring{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s1=sc.next();
String s2=sc.next();
int count=0,i,j;
for(i=0;i<s2.length();i++)
{
for(j=0;j<s1.length();j++)
{
if(s1.contains(s2))

{ 
count++;
}
}
}
if(count!=0)
{
System.out.println(s1.indexOf(s2));

}else
{
System.out.println("-1");
}
}
}
