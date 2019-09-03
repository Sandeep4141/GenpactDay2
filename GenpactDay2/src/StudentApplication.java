import java.util.Scanner;
public class StudentApplication {
	
	
	public static void showMenu() {
		
		System.out.println("1. Create Student database");
		System.out.println("2 . Display Student ");
		System.out.println("3. exit");
		
		System.out.println("------------------------");
	}
	

	public static void main(String[] args) {
		//We will create Student object to accesss data of Student;
		
		while(true) {
		showMenu();
		Student s=null;
		// how to take input in java
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter your choice : ");
		int choice  = sc.nextInt();

		
		//for switch case ,choice should be int ,string ,byte ,char ,enum but cannot be float ,long ,double 
	     switch(choice) {
	     case 1 :
	    	 System.out.println("Enter Roll number : ");
	    	 int m_rollNo = sc.nextInt();
	    	 System.out.println("ENter Name : ");
	    	 String m_name  = sc.next();
	    	 System.out.println("Enter marks : ");
	    	 float m_marks = sc.nextFloat();
	    	 s= new Student(m_rollNo ,m_name ,m_marks);
	    	 break;
	    	 
	     case 2:
	    	s.display();
	    	  break;
	     case 3:
	    	 System.exit(0);
	    	 break;
	    	 
	    default :
	    	System.out.println("Wrong choice");
	     
	     
	     }	
	}
	
	}
}
