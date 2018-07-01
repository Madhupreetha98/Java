import java.io.*;
import java.util.*;
class Li{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
int i;
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=n-1;i>=0;i--)
{
if(i!=0)
{
System.out.print(a[i]+"->");
}
else
{
System.out.print(a[i]);
}
}}
}
