import java.lang.*;
import java.io.*;
class Transposematrix
{
public static void main(String args[ ])throws IOException
{
int i,j,a[][],b[][];
a=new int[10][10];
b=new int[10][10];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter size of the matrix");
int m=Integer.parseInt(br.readLine());
int n=Integer.parseInt(br.readLine());
System.out.println("enter "+m*n+" elements of matrix");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=Integer.parseInt(br.readLine());
}
}
System.out.println("The Matrix is");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println( );
}
System.out.println("The Transpose matrix is");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
b[i][j]=a[j][i];
System.out.print(b[i][j]+"\t");
}
System.out.println( );
}
}
}