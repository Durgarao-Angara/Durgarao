package IO;

import java.io.File;
import java.io.IOException;

class Durga 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("Hello World!");
		File f=new File("file.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		// for getting all the files and directories getting form the D:\\API'S\\java-api-doc\\api...
		File d=new File("D:\\API'S\\java-api-doc\\api");
		String[] s=d.list();
		for(String s1:s)
		{
			System.out.println(s1);
		}

	}
}
