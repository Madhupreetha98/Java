import java.io.*;
import java.util.*;
class Possiblesub{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.next();
int n=sc.nextInt();
int c,i;
int len=s.length();
String sub="";
for(c=0;c<len;c++)
{
for(i=1;i<=len-c;i++)
{
sub=s.substring(c,c+i);
if(sub.length()==n)
{
System.out.println(sub);
}
}
}
}
}
