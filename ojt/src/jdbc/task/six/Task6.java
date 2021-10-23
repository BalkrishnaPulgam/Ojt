package jdbc.task.six;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		
		

		String fname,lname;
		Scanner input=new Scanner(System.in);
		PhoneDirectory ph=new PhoneDirectory();
		int aCode,number,ch=0;
		
		do{
			System.out.println("Select a choice\n1:Add a new Phonebook entry\n2:Find number\n3:Find name for a number\n4:Display phonebook\n5=Exit\n");
			try {
			ch=input.nextInt();
			}catch(Exception e) {
				System.out.println("Sorry you entered string:program is terminated.");
				break;
			}
			
			switch(ch) {
			case 1:
				System.out.println("Enter the first name: ");
				fname=input.next();
				System.out.println("Emter the last name: ");
				lname=input.next();
				System.out.println("Enter AreaCode");
				aCode=input.nextInt();
				System.out.println("Enter Phone number");
				number=input.nextInt();
				
				if(ph.doEntry(fname, lname, aCode, number)==true)
					System.out.println("Record successfully saved.\n");
				else
					System.out.println("phone number repeated.\n");
				break;
				
			case 2:
				System.out.println("Enter the name");
				fname=input.next();
				boolean bb=true;
				int[] a=ph.findNumber(fname);
				for(int i:a) {
					if(i!=0) {
						System.out.println("firstname:"+fname+"\nNumber:"+i+"\n");
						bb=false;
					}
				}
				if(bb)
					System.out.println("no record found..");
				break;
				
				
			case 3:
				System.out.println("Enter the number for name :");
				number=input.nextInt();
				String ss=ph.findName(number);
				if(ss.length()==0) {
					System.out.println("No record found"+"\n");
					
				}
				else
					System.out.println("Name is : "+ph.findName(number)+"\n");
				break;
				
			case 4:
				ph.display();
				break;
			case 5:
				break;
				
				default:
					System.out.println("Invalid input");
			}
		}while(ch!=0);
			
	}	

}
