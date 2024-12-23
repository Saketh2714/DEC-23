package Dec23;

class Demo{

int id;
String name;
String subject;
String address;
int gpa;

public Demo(int id, String name, String subject, String address, int gpa) {
	super();
	this.id = id;
	this.name = name;
	this.subject = subject;
	this.address = address;
	this.gpa = gpa;
}

@Override
public String toString() {
	return "Demo [id=" + id + ", name=" + name + ", subject=" + subject + ", address=" + address + ", gpa=" + gpa + "]";
}
}
public class Student {

	public static void main(String[] args) {
		Demo std1= new Demo(6609,"Saketh","Java","Hyd",7);
		System.out.println(std1);

	}

}
