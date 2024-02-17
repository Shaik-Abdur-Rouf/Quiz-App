import java.util.Scanner;
class Student
{
	static
	{
		System.out.println("It is a Quiz application");
	}
	int id;
	void input()
	{
		System.out.println("To start please enter id: ");
		Scanner s=new Scanner(System.in);
		id=s.nextInt();
		//int i=id;
//	    if(i==101||i==103||i==105||i==107||i==109)
//		{
//	    	System.out.println("Welcome, you are a registered member");
//        	System.out.println("************************************************");
//
//		}
//		else
//		{
//		System.out.println("Sorry! you are not registered in the system. Please enter valid id: ");	
//		
//		}
	    
	}
	
}
class Subject
{	
	static int res=0; 
	String subname, ans1, ans2, ans3, ans4, ans5, ans6, ans7, ans8, ans9, ans10, ans11, ans12;
	
	void disp()
	{
		System.out.println("To enter in Bangladesh press b");
		System.out.println("To enter in International Affairs press i");
		Scanner sn=new Scanner(System.in);
		subname=sn.nextLine();
	}
	void qview()
	{
	
		if(subname.equals("b"))
		{	
			System.out.println("Q1: What is the capital of Bangladesh?");
	        System.out.println("A)Comilla B)Chittagong C)Dhaka D)Khulna");
	        Scanner Q1=new Scanner(System.in);
	        ans1=Q1.nextLine();
	        if(ans1.equals("c"))
	        	{
	        		System.out.println("Ans is Correct");
		        	System.out.println("************************************************");

	        		res=res+5;
	        	}
	        else
	        {
	        	System.out.println("Ans is incorrect. Correct ans is: C)Dhaka ");
	        	System.out.println("************************************************");
	        	res=res+0;
	        }
	        
	        System.out.println("Q2: How many districts are in Bangladesh?");
	        System.out.println("A)64 B)65 C)66 D)63");
	        Scanner Q2=new Scanner(System.in);
	        ans2=Q2.nextLine();
	        if(ans2.equals("b"))
	        	{
	        		System.out.println("Ans is Correct");
		        	System.out.println("************************************************");

	        		res=res+5;
	        	}
	        else
	        {
	        	System.out.println("Ans is incorrect. Correct ans is: B)65 ");
	        	System.out.println("************************************************");

	        	res=res+0;
	        }
	        
	        System.out.println("Q3: What is the area of Bangladesh?");
	        System.out.println("A)54,320 sqmi B)55,320 sqmi C)56,320 sqmi D)57,320 sqmi");
	        Scanner Q3=new Scanner(System.in);
	        ans3=Q3.nextLine();
	        if(ans3.equals("d"))
	        	{
	        		System.out.println("Ans is Correct");
		        	System.out.println("************************************************");

	        		res=res+5;
	        	}
	        else
	        {
	        	System.out.println("Ans is incorrect. Correct ans is: D)57,320 sqmi");
	        	System.out.println("************************************************");

	        	res=res+0;
	        }
	        
	        System.out.println("Q4: In highest population Banglades is in number:");
	        System.out.println("A)Seven B)Eight C)Nine D)Ten");
	        Scanner Q4=new Scanner(System.in);
	        ans4=Q4.nextLine();
	        if(ans4.equals("b"))
	        	{
	        		System.out.println("Ans is Correct");
		        	System.out.println("************************************************");

	        		res=res+5;
	        	}
	        else
	        {
	        	System.out.println("Ans is incorrect. Correct ans is: B)Eight");
	        	System.out.println("************************************************");

	        	res=res+0;
	        }
	        
	        System.out.println("Q5: Bangladesh has the ______ largset muslim population");
	        System.out.println("A)Third B)Fourth C)Fifth D)Sixth");
	        Scanner Q5=new Scanner(System.in);
	        ans5=Q5.nextLine();
	        if(ans5.equals("a"))
	        	{
	        		System.out.println("Ans is Correct");
		        	System.out.println("************************************************");

	        		res=res+5;
	        	}
	        else
	        {
	        	System.out.println("Ans is incorrect. Correct ans is: A)Third");
	        	System.out.println("************************************************");

	        	res=res+0;
	        }
	        System.out.println("Total score is: "+res);
		} 
		 //System.out.println("Total score is: "+res);
		else if(subname.equals("i"))
		{
			System.out.println("Q1: What is the capital of Argentina?");
	        System.out.println("A)Tigre B)Buenos Aires C)La Plata D)Ushuaia");
	        Scanner Q6=new Scanner(System.in);
	        ans6=Q6.nextLine();
	        if(ans6.equals("b"))
	        	{
	        		System.out.println("Ans is Correct");
		        	System.out.println("************************************************");

	        		res=res+5;
	        	}
	        else
	        {
	        	System.out.println("Ans is incorrect. Correct ans is: B) Buenos Aires");
	        	System.out.println("************************************************");
	        	res=res+0;
	        }
	        
	        System.out.println("Q2: What is the currency of Argentina?");
	        System.out.println("A)Peso B)Dollar C)Frank D)Pound");
	        Scanner Q7=new Scanner(System.in);
	        ans7=Q7.nextLine();
	        if(ans7.equals("a"))
	        	{
	        		System.out.println("Ans is Correct");
		        	System.out.println("************************************************");

	        		res=res+5;
	        	}
	        else
	        {
	        	System.out.println("Ans is incorrect. Correct ans is: A) Peso");
	        	System.out.println("************************************************");
	        	res=res+0;
	        }
	        
	        System.out.println("Q3: Whisch one is the largest museum in the world?");
	        System.out.println("A)British Museum B)National Museum of China C)Louvre D)State Hermitage Museum");
	        Scanner Q8=new Scanner(System.in);
	        ans8=Q8.nextLine();
	        if(ans8.equals("c"))
	        	{
	        		System.out.println("Ans is Correct");
		        	System.out.println("************************************************");

	        		res=res+5;
	        	}
	        else
	        {
	        	System.out.println("Ans is incorrect. Correct ans is: C)Louvre");
	        	System.out.println("************************************************");
	        	res=res+0;
	        }
	        
	        System.out.println("Q4: Area of Louvre museum?");
	        System.out.println("A)755,000 m2 B)756,000 m2 C)757,000 m2 D)758,000 m2");
	        Scanner Q9=new Scanner(System.in);
	        ans9=Q9.nextLine();
	        if(ans9.equals("d"))
	        	{
	        		System.out.println("Ans is Correct");
		        	System.out.println("************************************************");

	        		res=res+5;
	        	}
	        else
	        {
	        	System.out.println("Ans is incorrect. Correct ans is: D)758,000 m2");
	        	System.out.println("************************************************");
	        	res=res+0;
	        }
	        
	        System.out.println("Q5:Which is the second largest country in the world?");
	        System.out.println("A)Russia B)Canada C)China D)Unites States");
	        Scanner Q10=new Scanner(System.in);
	        ans10=Q10.nextLine();
	        if(ans10.equals("b"))
	        	{
	        		System.out.println("Ans is Correct");
		        	System.out.println("************************************************");

	        		res=res+5;
	        	}
	        else
	        {
	        	System.out.println("Ans is incorrect. Correct ans is: B)Canada");
	        	System.out.println("************************************************");
	        	res=res+0;
	        }
	        
	        System.out.println("Q6:Which is the most spoken language in the world?");
	        System.out.println("A)English B)Spanish C)Arabic D)Chinese");
	        Scanner Q11=new Scanner(System.in);
	        ans11=Q11.nextLine();
	        if(ans11.equals("d"))
	        	{
	        		System.out.println("Ans is Correct");
		        	System.out.println("************************************************");

	        		res=res+5;
	        	}
	        else
	        {
	        	System.out.println("Ans is incorrect. Correct ans is: D)Chinese");
	        	System.out.println("************************************************");
	        	res=res+0;
	        }
	        
	        System.out.println("Q7:Which one is the smallest country?");
	        System.out.println("A)Nauru B)Tuvalu C)San Marino D)Monaco");
	        Scanner Q12=new Scanner(System.in);
	        ans12=Q12.nextLine();
	        if(ans12.equals("d"))
	        	{
	        		System.out.println("Ans is Correct");
		        	System.out.println("************************************************");

	        		res=res+5;
	        	}
	        else
	        {
	        	System.out.println("Ans is incorrect. Correct ans is: D)Monaco");
	        	System.out.println("************************************************");
	        	res=res+0;
	        }
		}
		 System.out.println("Total score is: "+res);
	
	}
	
}
public class Qapp 
{

	public static void main(String[] args) 
	{
		Student st=new Student();
		st.input();
		if(st.id==101||st.id==103||st.id==105||st.id==107||st.id==109)
			{
	    	System.out.println("Welcome, you are a registered member");
        	System.out.println("************************************************");
        	Subject s=new Subject();
    		s.disp();
  		    s.qview();
		 	}
		else
		{
		System.out.println("Sorry! you are not registered in the system.");	
		//st.input();
		}
//		Subject s=new Subject();
//		s.disp();
//		s.qview();
		//System.out.println(st.id);

	}

}
