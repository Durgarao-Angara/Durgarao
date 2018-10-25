package IO;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	int id;
	String name;
}

public class Persist {
	public static void main(String args[]) throws Exception {
		Student s1 = new Student(211, "ravi");

		FileOutputStream fout = new FileOutputStream("f.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);

		out.writeObject(s1);
		out.flush();
		System.out.println("success");
		// Dederialization
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
		Student s = (Student) in.readObject();
		System.out.println(s.id + " " + s.name);
	}
}
