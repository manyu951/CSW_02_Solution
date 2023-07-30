/*Create a class Student having member variable name, age, mark and
required member variable. Create an LikedList of Student type and
perform the below operation on it.
(a.) Display the list
(b.) Ask the user to enter a student object and print the existence of
the object. Specify is the object is search according to reference
or contain.
(c.) Remove an specified student object.
(d.) Count the number of object present in the list.*/
import java.util.Scanner;
import java.util.LinkedList;
class Student{
	String name;
	int age;
	double marks;
	Student(String name,int age,double marks){
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student other = (Student)obj;
			return this.name.equals(other.name) && this.age == other.age && this.marks==other.marks;
		}
		else {
			return false;
		}
	}
	
}
public class Q_2A_02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Student> ll = new LinkedList<Student>();  
		// For add all name,age,marks first we have to create 
		// class of Student and constructor for that
        ll.add(new Student("Manyu",23,8.04));
        ll.add(new Student("Aniket",23,8.44));
        ll.add(new Student("Rahul",18,8.74));
        ll.add(new Student("Agnik",23,8.97));
        for(Student s:ll) {
        	System.out.println(s.name + "\t" + s.age + "\t" + s.marks);
        }
        System.out.println("Enter for search element :");
        String Sna = sc.nextLine();
        int age = sc.nextInt();
        double marks = sc.nextDouble();
        Student search = new Student(Sna,age,marks);
        System.out.println("Element is present in List is " + ll.contains(search));
        System.out.println("Enter for remove element :");
//        Sna = sc.nextLine();
//        age = sc.nextInt();
//        marks = sc.nextDouble();
        Student remove = new Student(sc.next(),sc.nextInt(),sc.nextDouble());
        ll.remove(remove);
        System.out.println("The size of list is " + ll.size());
        
        
	}

}
