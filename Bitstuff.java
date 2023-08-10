import java.io.*;
import java.util.*;
import java.lang.*;
class Bitstuff
{
public static void main(String args[])throws Exception
{
int a[]=new int[70];
int b[]=new int[70];
int ca[]=new int[70];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter how many bits you want to enter:");
int n,i,j=0,k,c=0;
n=Integer.parseInt(br.readLine()); 
System.out.println("enter"+n+"bits 0,1");
for(i=0;i<n;i++)
{
a[i]= Integer.parseInt(br.readLine()); 
if(a[i]!=0 && a[i]!=1)
{
System.out.println("invalid input try again");
i=-1;
continue;
}
}
for(j=0;j<7;j++)
{
if(j==0||j==7)
b[j]=0;
else b[j]=1;
}
for(i=0;i<n;i++)
{
if(a[i]==1)
c++;
if(a[i]==0&&c<4)
c=0;
if(c==5)
{
b[j++]=a[i];
b[j++]=0;
c=0;
}
else
b[j++]=a[i];
}
for(int m=0;m<7;m++)
{
if(m==0||m==7)
{
b[j++]=0;
}
else
b[j++]=1;
}
System.out.println("\t\tSENDER SIDE");
System.out.println(" stuffed data is :");
for(i=0;i<j;i++)
{
System.out.print(b[i]);
}
System.out.println();
c=k=0;
j=j-8;
for(i=8;i<j;i++)
{
if(b[i]==1)
c++;
if(b[i]==0)
if(c==5)
{
i++;
ca[k++]=b[i];
c=1;
continue;
}
else
c=0;
ca[k++]=b[i];
}
System.out.println("\t\tRECIEVER SIDE");
System.out.println("\n after destuffing");
for(i=0;i<k;i++)
System.out.print(ca[i]);
}
}