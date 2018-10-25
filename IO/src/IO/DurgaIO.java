package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DurgaIO 
{
	public static void main(String[] args) throws IOException
	{
		File f1=new File("E:\\Interview purpose\\jdbc.docx");
		FileReader f= new FileReader(f1);
		/*int i=f.read();
		while(i!=-1)
		{
			System.out.println((char)i);
			i=f.read();
		}*/
BufferedReader br= new BufferedReader(f);
		String st=br.readLine();
		while(st!=null)
			{
System.out.println(st);
st=br.readLine();
		}
	}
}