import java.util.*;
class main
{
	public static void main(String[] args) {
	    
		System.out.println("Main Menu");
		System.out.println("==========");
		System.out.println("1.Add Videos");
		System.out.println("2.Check out Video");
		System.out.println("3.Return Video");
		System.out.println("4.Recieve Rating");
		System.out.println("5.Exit");
		System.out.println("Enter your choice(1...5):");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		 
		switch(choice){
		    case 1:
		        System.out.println("Enter the Video you want to Add:");
		        String name=sc.next();
		        System.out.println("Video " +name+ " added Successfully "  );
		break;
		case 2:
		     System.out.println("Enter the Video you want to Check out:");
		        String Name=sc.next();
		    System.out.println("Video " +Name+ "Checked Out Successfully");
		    break;
		    case 3:
		         System.out.println("Enter the Video you want to Return:");
		         String r=sc.next();
		        System.out.println("Video " +r+ " Returned Successfully"); 
		        break;
		        case 4:
		         System.out.println("Enter the Video you want to Rate:");
		         String vi=sc.next();
		         System.out.println("Enter the Rating(0-10):");
		         int d=sc.nextInt();
		         if(d>10)
		         System.out.println("Invalid Rating");
		         else
		       System.out.println("Successfully Rated " +d+ " Star to " +vi); 
		        break;
		        case 5:
		            System.out.println("Thanks for Visiting");
		            
		}   
	}
}