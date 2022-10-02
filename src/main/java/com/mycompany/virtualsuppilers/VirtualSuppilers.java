/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.virtualsuppilers;

/**
 *
 * @author marissalubow
 */
import java.util.Scanner;
import java.util.Date; 
import java.util.concurrent.TimeUnit;
public class VirtualSuppilers{

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    String Uone = "pdavoren";
    String Utwo = "rkeneddy";
    String Uthree= "pdouglas";
    String Pone = "123";
    String Ptwo = "689";
    String Pthree = "421";
    String Username ;
    String Password  ;
    int attempts = 0;  
    boolean validlogin = false;
    System.out.println("Welcome to Virtual Suppliers");
    System.out.println("please log in:");
    System.out.println("if you'd like to continue as a guest please enter guest for user and pass:");
    
    
    while (validlogin=true) {
    	while(attempts<=3) {
    	System.out.println("username: ");
    	Username = input.next();
    	
    	System.out.println("password: ");
    	Password = input.next();
    	
    if(Username.equals(Uone) && Password.equals(Pone)) { 
        System.out.println("Login is correct welcome "+Username);
        attempts+=4;
        validlogin=false;
    }else if(Username.equals(Utwo) && Password.equals(Ptwo)) { 
        System.out.println("Login is correct welcome "+Username);
    	attempts+=4;
    	validlogin=false;
    }else if(Username.equals(Uthree) && Password.equals(Pthree)) { 
        System.out.println("Login is correct welcome "+Username);
        attempts+=4;
        validlogin=false;
    }else if(Username.equals("guest") && Password.equals("guest")) { 
    	System.out.println("Login is correct welcome geust member\n\n");
    	attempts+=4;
    	validlogin=false;
	}else {  
    	System.out.println("wrong username or password");
    	validlogin = true;
    	attempts+=1;
    	if(attempts>3) {
        	System.out.println("number of login attempts exceeded, failure to login results in self detonation");
    		System.exit(5);
        	
    	}
	}
    
    }
    	
   // if(attempts>3) {
    	
    //System.exit(5);
   // }
    int shopping;
	String Drywall;
	String Lumber;
	String Aluminum;
	String Steel;
	String Tiles;
	String Sand;
	String Gravel;
	String Bricks;
	
	
    float QDrywall =0 ;
	float QLumber=0;
	float QAluminum=0;
	float QSteel=0;
	float QTiles=0;
	float QSand=0;
	float QGravel=0;
	float QBricks=0;
	
	float PDrywall =0 ;
	float PLumber=0;
	float PAluminum=0;
	float PSteel=0;
	float PTiles=0;
	float PSand=0;
	float PGravel=0;
	float PBricks=0;
	
	
	
	
	
	
	
	
	double totalPrice = 0;
	boolean validchoice = false;
	char moreMaterials = 'X';
	double grandtotal = totalPrice;
    double DPrice = .90;
	char   Discount = 'f';
	Scanner keyboard = new Scanner (System.in);
	int option = 0;
do
{
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
	
	System.out.println(" ");
	
	System.out.println("What would you like to buy today ?");
    System.out.println("\n1.Drywall\n2.Lumber\n3.Aluminum\n4.Steel\n5.Tiles\n6.Sand\n7.Gravel\n8.Bricks");
    System.out.println("please pick an option 1-8 ");
    shopping = input.nextInt();
   

    if (shopping == 1)
    	do
    	{
    			
    	System.out.println("You have chosen Drywall, choose the quality per 50 pounds");
    	System.out.println("1.Low quaility = $7.85, 2.medium quality = $13.65, 3.high quality = $55.98");
    	option = keyboard.nextInt();
    	if (option == 1)
    		{QDrywall+=1;
    		 PDrywall += 7.85;
    		totalPrice += 7.85;
    		validchoice = true;
    		
    		}
    	else if (option == 2)
    		{totalPrice += 13.65;
    		validchoice = true;
    		QDrywall+=1;
    		PDrywall +=13.65;
    		}
    	else if (option == 3)
    		{totalPrice += 55.98;
    		validchoice = true;
    		QDrywall+=1;
    		PDrywall += 55.98;
    		}
    	else 
    		System.out.println("Invalid choice try again.");
    	
}while (!validchoice);
    
  validchoice = false;
  
    if (shopping == 2)
    	do
    	{
    		
    	System.out.println("You have chosen Lumber, choose the quality per 50 pounds");
    	System.out.println("1.Low quaility = $3.28, 2.medium quality = $47.99, 3.high quality = $95.60");
    	option = keyboard.nextInt();
    	if (option == 1)
    		{totalPrice += 3.28;
    		 PLumber += 3.28;
    		 QLumber +=1;
    		validchoice = true;
    		}
    	else if (option == 2)
    		{totalPrice += 47.99;
    		validchoice = true;
    		PLumber += 47.28;
    		QLumber +=1;
    		}
    	else if (option == 3)
    		{totalPrice += 95.60;
    		 PLumber+=95.60;
    		 QLumber +=1;
    		validchoice = true;
    		}
    	else 
    		System.out.println("Invalid choice try again!");
    	
}while (!validchoice);
    
  validchoice = false;
  
    if (shopping == 3)
    	do
    	{
    		
    	System.out.println("You have chosen Aluminum, choose the quality per 50 pounds");
    	System.out.println("1.Low quaility = $22.16, 2.medium quality = $29.74, 3.high quality = $55.68");
    	option = keyboard.nextInt();
    	if (option == 1)
    		{totalPrice += 22.16;
    		PAluminum += 22.16;
    		validchoice = true;
    		QAluminum+=1;
    		}
    	else if (option == 2)
    		{totalPrice += 29.74;
    		 PAluminum += 29.74;
    		 QAluminum+=1;
    		validchoice = true;
    		}
    	else if (option == 3)
    		{totalPrice += 55.68;
    		 PAluminum += 55.68;
    		validchoice = true;
    		QAluminum+=1;
    		}
    	else 
    		System.out.println("Invalid choice try again.");
    	
}while (!validchoice);
    
  validchoice = false;
  
	
    if (shopping == 4)
    	do
    	{
    	
    	System.out.println("You have chosen Steel, choose the quality per 50 pounds");
    	System.out.println("1.Low quaility = $15.55, 2.medium quality = $41.98, 3.high quality = $157.08");
    	option = keyboard.nextInt();
    	if (option == 1)
    		{totalPrice += 15.55;
    		QSteel +=1;	
    		 PSteel += 15.55;
    		validchoice = true;
    		}
    	else if (option == 2)
    		{totalPrice += 41.98;
    		QSteel +=1;	
    		PSteel += 41.98;
    		validchoice = true;
    		}
    	else if (option == 3)
    		{totalPrice += 157.08;
    		PSteel += 157.08;
    		QSteel +=1;	
    		validchoice = true;
    		}
    	else 
    		System.out.println("Invalid choice try again.");
    	
}while (!validchoice);
    
  validchoice = false;
  

    if (shopping == 5)
    	do
    	{
    		
    	System.out.println("You have chosen Tiles, choose the quality per 50 pounds");
    	System.out.println("1.Low quaility = $0.32, 2.medium quality = $27.41, 3.high quality = $85.48");
    	option = keyboard.nextInt();
    	if (option == 1)
    		{totalPrice += 0.32;
    		PTiles += .32;
    		QTiles+=1;
    		validchoice = true;
    		}
    	else if (option == 2)
    		{totalPrice += 27.41;
    		QTiles+=1;
    		PTiles += 27.41;
    		validchoice = true;
    		}
    	else if (option == 3)
    		{totalPrice += 85.48;
    		QTiles+=1;
    		PTiles += 85.48;
    		validchoice = true;
    		}
    	else 
    		System.out.println("Invalid choice try again.");
    	
}while (!validchoice);
    
  validchoice = false;
  

    if (shopping == 6)
    	do
    	{
    	
    	System.out.println("You have chosen Sand, choose the quality per 50 pounds");
    	System.out.println("1.Low quaility = $3.88, 2.medium quality = $3.98, 3.high quality = $4.58");
    	option = keyboard.nextInt();
    	if (option == 1)
    		{totalPrice += 3.88;
    		 PSand += 3.88;
    		 QSand +=1;	
    		validchoice = true;
    		}
    	else if (option == 2)
    		{totalPrice += 3.98;
    		 PSand += 3.98;
    		 QSand +=1;	
    		validchoice = true;
    		}
    	else if (option == 3)
    		{totalPrice += 4.58;
    		QSand +=1;	
    		 PSand += 4.58;
    		validchoice = true;
    		}
    	else 
    		System.out.println("Invalid choice try again.");
    	
}while (!validchoice);
    
  validchoice = false;
  

    if (shopping == 7)
    	do
    	{
    	
    	System.out.println("You have chosen Gravel, choose the quality per 50 pounds");
    	System.out.println("1.Low quaility = $4.48, 2.medium quality = $4.98, 3.high quality = $699.99");
    	option = keyboard.nextInt();
    	if (option == 1)
    		{totalPrice += 4.48;
    		PGravel += 4.48;
    		QGravel+=1;	
    		validchoice = true;
    		}
    	else if (option == 2)
    		{totalPrice += 4.98;
    		PGravel += 4.98;
    		QGravel+=1;	
    		validchoice = true;
    		}
    	else if (option == 3)
    		{totalPrice += 699.99;
    		QGravel+=1;	
    		PGravel += 699.98;
    		validchoice = true;
    		}
    	else 
    		System.out.println("Invalid choice try again.");
    	
}while (!validchoice);
    
  validchoice = false;

  
    if (shopping == 8)
    	do
    	{
    	
    	System.out.println("You have chosen Bricks, choose the quality per 50 pounds");
    	System.out.println("1.Low quaility = $100.00, 2.medium quality = $350.00, 3.high quality = $900.00");
    	option = keyboard.nextInt();
    	if (option == 1)
    		{totalPrice += 100.00;
    		PBricks += 100;
    		QBricks+=1;	
    		validchoice = true;
    		}
    	else if (option == 2)
    		{totalPrice += 350.00;
    		PBricks =+ 350;
    		QBricks+=1;	
    		validchoice = true;
    		}
    	else if (option == 3)
    		{totalPrice += 900.00;
    		PBricks+= 900;
    		QBricks+=1;	
    		validchoice = true;
    		}
    	else 
    		System.out.println("Invalid choice try again.");
    	
}while (!validchoice);
    
  validchoice = false;
  
  grandtotal += totalPrice;
  
		  
  System.out.println("Do you want more materials? (Y/N)");
  moreMaterials = keyboard.next().charAt(0);

	
 }while (moreMaterials == 'Y');
System.out.println();
System.out.println("Would you like to see if you Qualify for our 10% Discount? (Y/N)");
Discount = keyboard.next().charAt(0);
if(Discount == 'Y') {
	totalPrice = DPrice*totalPrice;}
	else {
		System.out.println("OK");
}
		System.out.println("You bought "+QDrywall+" unit(s) of Drywall @ $"+PDrywall);
		
		System.out.println("You bought "+QLumber+" unit(s) of Lumber @ $"+PLumber);
		
		System.out.println("You bought "+QAluminum+" unit(s) of Aluminum @ $"+PAluminum);
		
		System.out.println("You bought "+QSteel+" unit(s) of Steel @ $"+PSteel);
		
		System.out.println("You bought "+QTiles+" unit(s) of Tiles @ $"+PTiles);
		
		System.out.println("You bought "+QSand+" unit(s) of Sand @ $"+PSand);
		
		System.out.println("You bought "+QGravel+" unit(s) of Gravel @ $"+PGravel);
		
		System.out.println("You bought "+QBricks+" unit(s) of Bricks @ $"+PBricks);
		


		System.out.printf("your total will be  $%.2f", totalPrice);
	 }
}

}
	