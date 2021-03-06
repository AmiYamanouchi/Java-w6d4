package w6d4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class Driver {

	public static void main(String[] args) {
		
		LinkedList<Student> students= new LinkedList<>();
		
		Scanner input = new Scanner(System.in);
		
		
		
		int userselected = input.nextInt();
		
		boolean stop = false;
		
		while(!stop) {
			
			System.out.println("\nMenu to:" + 
					"\n  1 - add student" + 
					"\n  2 - display student" +
					"\n  3 - remove student" +
					"\n  4 - quit");
			
			switch(userselected) {
			
			case 1:
				addStudent(students);				
				break;
			case 2:
				displayStudents(students);
				break;
			case 3:
				removeStudentById(students);
				break;
			case 4:
				stop = true;
				System.out.println("See you.");
				break ;
			default:
				System.out.println("Please input again.");
				
			}
		
			
		}
		
		
		
	}
	
	
	//add student method
	public static void addStudent(LinkedList<Student> students) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the student full name: ");
		String name = input.nextLine();
		
		System.out.print("Enter the student email: ");
		String email = input.nextLine();
		
		System.out.print("Enter the student id: ");
		int id = input.nextInt();
		
		Student student = new Student(id, email, name);
		students.add(student);
		System.out.println("Added: " + student);
		
	}
	
	//display student method
	public static void displayStudents(LinkedList<Student> students) {
		Iterator iterator = students.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public static void removeStudentById(LinkedList<Student> students) {
		
	}
	
	
	//remove student method
	
	public static void removeStudent(LinkedList<Student> students) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the id that you want to remove : ");
		int id = input.nextInt();

		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			Student s = iterator.next();
			if (s.getId() == id) {
				System.out.println("Removed: " + s);
				iterator.remove();
			}
		}
	}

}
