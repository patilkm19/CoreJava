import java.util.Scanner;

public class Student {
	
	int id;   //variable declaration
	float sub1, sub2, sub3;
	String name;
	
	public int getId() //getter method 
	{
		return id;
	}
	public void setId(int i)//setter method 
	{
		id = i;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name = n;
	}
	public float getSub1()
	{
		return sub1;
	}
	public void setSub1(float s1)
	{
		sub1 = s1;
	}
	public float getSub2()
	{
		return sub2;
	}
	public void setSub2(float s2)
	{
		sub2 = s2;
	}
	public float getSub3()
	{
		return sub3;
	}
	public void setSub3(float s3)
	{
		sub3 = s3;
	}
	
	
	
	public static void main(String[] args)  //main method
	{
	
		Scanner sc =new Scanner(System.in);
		Student stud = new Student();
		System.out.println("number of records you want to proceed :");
		int r = sc.nextInt();
		
		for (int i=1;i<=r; i++)   
		{
			
		System.out.println("Enter Student Id :");
		int Stud_id= sc.nextInt();
		stud.setId(Stud_id);
		
		System.out.println("Enter Student Name :");
		String Stud_name = sc.next();
		stud.setName(Stud_name);
		
		System.out.println("Enter Student Marks :"); 
		 float subject1 = sc.nextFloat(); 
		 float subject2 = sc.nextFloat(); 
		 float subject3 = sc.nextFloat();
		 stud.setSub1(subject1);
		 stud.setSub2(subject2);
		 stud.setSub3(subject3);
		 
         float totalMarks = subject1+subject2+subject3;
	     System.out.println("Total Marks = "+totalMarks);
	     
	     float percentage = (totalMarks/300)*100;
	     System.out.println("Percentage  = "+percentage);
	   
	     if(percentage >=80)
	     {
		   System.out.println("Grade = A");
	     }
	     else if(percentage >=70)
	     {
		   System.out.println("Grade = B");
	     }
	     else if(percentage >=60)
	     {
		   System.out.println("Grade = C");
		   
	     }
	     else if(percentage >=40)
	     {
		   System.out.println("Grade = D");
	     }
	     else
	     {
		   System.out.println("Grade = Fail");
	     }

	   
		}
		
	}

		
}
	


