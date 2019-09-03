//User defined data or template of Student class 
public class Student {
  private int rollNo;   //one cannot access outside the class
  private String name;
  private float marks;
  //declaring a static number
  public static int  Count =2;
  
  //create a public function to access data variable of class ,from outside of this class
  
  public void init() {
	  
	  rollNo =10;
	  name = "Anita";
	  marks = 50.0f;
	  
  }
  
  
public void display()
{
	 System.out.println("Roll is : " + rollNo);
	 System.out.println("Name of the Student is : " + name);
	 System.out.println("obtain Marks  : " + marks);

}


//In this case both side of (name=name ) consider as local variable  both and will get default value
//because name of data member and parameter is same .
//to solve this we use "this" reference of current object , if you don't use this local variable will get default value
//and actual  parameter will get wrong values;


//"this " refer to the current object .


//local variable will get first reference  while assigning value to the variables.

public void withParameter(int rollNo,String name ,float marks)   //here r,N,m are local variable
{
	this.rollNo  = rollNo;
	this.name = name;
    this.marks =marks;

}


// let's create own constructor ,it will get automatic call whenever a object is created .

public Student() {
	
	System.out.println("Constructor is called");
	
}


//with parameter 
//we can create constructor as many as we want ,with different parameter 
//System will directly call constructor according to the parameter number
//this is called constructor overloading 
//overloading is same name function ,with different number of parameter 

public Student(int rollNo,String name ,float marks)
{

	this.rollNo  = rollNo;
	this.name = name;
	this.marks = marks;

}

//if we create a constructor own then complier with not call default constructor


//Now I want to update marks of student , How will i do.

//1. first I will get marks from here 
public float getMarks()
{
  return this.marks;	

}

//Set new updated marks
public void setMarks(float m_marks) {
	this.marks = m_marks;
	
	
}


public void setName(String name) {
	this.name = name; 
	
}

public int getRollNo()
{
	return this.rollNo;

}


public void setRollNo(int n_roll)
{
	this.rollNo = n_roll;

}



//Assign grade to all student using swicth case

public void calculateGrade() {
	//Grade A -> marks 80 and above
	//Grade B = 60<m<80
	//Grade C = 40<m<60
	//grade failed = less than 40;
	if(marks>=80)
	 System.out.println("Grade : A");
	else if(marks>=60 && marks<80)
		System.out.println("Grade is : B");
	else if(marks>=40 && marks<60)
		System.out.println("Grade is : C");
	else 
		System.out.println("Grade is : failed");
	
}

   public static void showCount() {
	   //dispay();
	   System.out.println("Count : " + Count);
   }
}



