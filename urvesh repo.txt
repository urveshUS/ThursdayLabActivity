import java.io.*;
import java.util.*;
class file_read_write
{
public static void main(String args[])throws Exception
{
Scanner sc=new Scanner(System.in);
System.out.println(" Enter Source file ");
String fname = sc.nextLine();
System.out.println(" Enter destination  file ");
String dname=sc.nextLine();


FileInputStream fin=new FileInputStream(fname);
FileOutputStream fout=new FileOutputStream(dname);

long startTime=System.currentTimeMillis();
int ch=fin.read();
while(ch!=-1)
{
fout.write((char)ch);
ch=fin.read();
}
long endTime =System.currentTimeMillis();
long totalTime=endTime-startTime;
System.out.println("/nTotal time in Milli.;"+totalTime);
fin.close();
fout.close();
System.out.println("/nFile Reading writting successfully !!!/n");
}
}