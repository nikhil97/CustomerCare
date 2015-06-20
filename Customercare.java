import java.util.*;
public class Customercare {
  
	public static void main(String[] args){
		
		System.out.println("WELCOME TO CUSTOMER CARE\nTo continue in english press 1\nHindi mein jaankari ke liye 2 dabayein");
		
		Scanner userInput = new Scanner(System.in);
		userInput.hasNextInt();
		int choice = userInput.nextInt();
		
			
		if(choice==1)
		{
			do{
			
			System.out.println("To know your bill press 1\nFor porting request press 2\nTo talk to our customer care executive press 3\nTo exit press 0");
			
			userInput.hasNextInt();
			int choice1=userInput.nextInt();
			
			  switch(choice1){
			       
			  case 1:System.out.println("YOUR BILL IS RS.800\nPRESS 9To go back to previous menu press 9\nTo exit press 0  ");
			                userInput.hasNextInt();
			                choice = userInput.nextInt();
			                break;
			  case 2:System.out.println("Your porting request is under process\nTo go back to previous menu press 9\nTo exit press 0");             
			               userInput.hasNextInt();
                          choice = userInput.nextInt();
                               break;
			  case 3:System.out.println("All our executives are busy learning Java. Please try again later\nTo go back to previous menu press 9\nTo exit press 0");
			                 userInput.hasNextInt();
                             choice = userInput.nextInt();
                             break;
			  case 9: choice=9;
			            break;
			            
			  case 0: choice=0;
			            break;
			    }if(choice==0){
					System.out.println("Thank You For Calling Us");
					System.exit(0);}
		}while(choice==9);
			}
		else if(choice==2){
			do{
				System.out.println("Apna Bill Janane Ke Liye 1 Dabayen\nPorting Ke Liye 2 Dabayen\nCustomer care executive Se Baat Karne Ke Liye 3 Dabayen\nBahar Jane Ke Liye 0 Dabayen");
				
				userInput.hasNextInt();
				int choice1=userInput.nextInt();
				
				  switch(choice1){
				       
				  case 1:System.out.println(" Apka Bill  RS.800 Hai\nWapas Pichli Menu Me Jane Ke Liye 9 Dabayen\nBahar Jane Ke Liye 0 Dabayen"  );
				                userInput.hasNextInt();
				                choice = userInput.nextInt();
				                break;
				  case 2:System.out.println("Apki Request Process Me Hai\nWapas Pichli Menu Me Jane Ke Liye 9 Dabayen\nBahar Jane Ke Liye 0 Dabayen");             
				               userInput.hasNextInt();
	                          choice = userInput.nextInt();
	                               break;
				  case 3:System.out.println("Hamare Sabhi Customer Care Executive Java Sikhne Me Busy Hain.Please Thodi Der Baad Koshish Karen\nWapas Pichli Menu Me Jane Ke Liye 9 Dabayen\nBahar Jane Ke Liye 0 Dabayen");			                 userInput.hasNextInt();
	                             choice = userInput.nextInt();
	                             break;
				  case 9: choice=9;
				            break;
				            
				  case 0: choice=0;
				            break;
				    }
			
			if(choice==0){
				System.out.println("Call Karne Ke Liye DhanyaVad");
				System.exit(0);}
		}while(choice==9);
			}
		else 
			System.out.println("Please Select From Either English Or Hindi");
		
		   userInput.close();
		   }
}
   
	

