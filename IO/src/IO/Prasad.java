package IO;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
// to perform FileWriter Operatios...
public class  Prasad
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw= new FileWriter("A.txt", true);
		fw.write(100);
		char[] ch={'a','b','g','t'};
		fw.write('\n');
		fw.write(ch);
		fw.write('\n');
		fw.write("Durgarao Angara");
		fw.write('\n');
fw.write("Kapavaram");
		fw.flush();

		//to perform FileRead operations ...

		File f=new File("A.txt");
		FileReader fr=new FileReader(f);
		fr.read();
		char[] ch1=new char[(int)(f.length())];
		fr.read(ch1);
		for (char c1: ch1)
		{
			System.out.println(c1);
		}
	}
}
