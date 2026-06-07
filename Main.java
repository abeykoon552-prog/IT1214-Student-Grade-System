import java.util.ArrayList;
import java.util.Scanner;

	public class Main{
		static ArrayList<Student>studentList=new ArrayList<>();
		static Scanner sc=new Scanner(System.in);
		
	public static void main(String[] args){
		int option;
		do{
			System.out.println("----STUDENT GRADE MANAGEMENT SYSTEM----");
			System.out.println("1.Add A Student");
			System.out.println("2.Display All Student");
			System.out.println("3.Search Student By ID");
			System.out.println("4.Calculate Average Marks");
			System.out.println("5.Exit");
			System.out.print("Enter Your Option: ");
			option=sc.nextInt();
			sc.nextLine();
			
		switch (option){
			case 1: 
				addStudent();
			break;
			
			case 2: 
				displayStudents();
			break;
			
			case 3: 
				searchStudents();
			break;
			
			case 4: 
				calculateAverage();
			break;
			
			case 5:
				System.out.println("Bye!");
			break;
			
			default:
				System.out.println("Invalid Option!");
		}
		}
		while(option !=5);
	}
	
	static void addStudent(){
		System.out.print("Enter Student ID: ");
		String id=sc.nextLine();
		
		System.out.print("Enter Student Name: ");
		String name=sc.nextLine();
		
		System.out.print("Enter Marks: ");
		double marks=sc.nextDouble();
		sc.nextLine();
		
		studentList.add(new Student(id,name,marks));
		System.out.println("ADD STUDENT TO SYSTEM!");
	}
	
	static void displayStudents(){
		System.out.println("----STUDENT LIST----");
				for	(Student s: studentList){
					s.displayStudent();
		}
	}
	
	static void searchStudents(){
		System.out.print("Enter Student ID: ");
		String id=sc.nextLine();
		
			for(Student s: studentList){
				if(s.getStudentId().equals(id)){
					System.out.println("STUDENT FOUND!");
					s.displayStudent();
				}
			}
	}

	static void calculateAverage(){
				double total=0;
				for (Student s: studentList){
					total +=s.getMarks();
				}
				double avg=total/studentList.size();
				System.out.println("AVERAGE MARKS OF ALL STUDENTS: "+avg);
	}
	}
	
				
					
	
			
			
		
	
