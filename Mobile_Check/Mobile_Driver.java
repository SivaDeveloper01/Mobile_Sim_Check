package Ceo;
import java.util.Scanner;
public class Userinterface1 {
		static Scanner s=new Scanner(System.in);
		static boolean b=true;
		static Mobile mobile=new Mobile("Mi","Black",25000);
		public static void main(String[] args) {
			do
			{
				System.out.println("\t\t\t\"Welcome To Sangeeta Mobile Shop\"\n");
				System.out.println("Select The Input\n");
				System.out.println("1.Insert Sim\n2.Remove Sim\n3.Is Sim Present\n4.Details OF Mobile\n5.Details Of Sim\n6.Exit\n");
				int input=s.nextInt();
				switch (input)//1,2,3,4,5,6
				{
				case 1:{
					//Trying to Inserting the Sim
							System.out.println("\t\t\tPlease Select The Input");
							System.out.println("1.Airtel\n2.Jio\n");
							int select_sim=s.nextInt();
							switch (select_sim)
							{
							case 1:{//User is Trying to Insert Airtel Sim
									 mobile.insertSim1(new Sim("Airtel",1.2,9876543201l));
								break;}
							case 2:{
								//user is Selecting Jio
								mobile.insertSim2(new Sim("Jio",1.5,7019663256l));
								break;}
							
							}
					break;}
				case 2:{
						//User is Removeing the Sim	
							System.out.println("\t\t\tPlease Select The Input");
							System.out.println("1.Airtel\n2.Jio\n");
							int select_sim=s.nextInt();
							switch (select_sim)
							{
							case 1:{
								//Removeing Sim 1(Airtel)
								mobile.removeSim1();
								break;}
							case 2:{
								//Removeing Sim 2(Jio)
								mobile.removeSim2();
								break;}
							
							}
					
					break;}
				case 3:{
					//Is Sim is Present Or Not
							System.out.println("\t\t\tPlease Select The Input");
							System.out.println("1.Airtel\n2.Jio\n");
							int select_sim=s.nextInt();
							switch (select_sim)
							{
							case 1:{
								//Verifying  Sim 1 is Present or Not(Airtel)
								if(mobile.isSim1isPresent()){
									System.out.println("Airtel Sim Is Prsent");
								}else{
									System.out.println("Airtel Sim Is Not Prsent");
								}
								break;}
							case 2:{
														//Verifying  Sim 2 is Present or Not(Airtel)
								if(mobile.isSim2isPresent()){
									System.out.println("Jio Sim Is Prsent");
								}else{
									System.out.println("Jio Sim Is Not Prsent");
								}
								break;}
							}
					
					break;}
				case 4:{
					//details Of Mobile
					mobile.detailsOfMobile();
					break;}
				case 5:{
					//detailsOfSim
					System.out.println("\t\t\tPlease Select The Input");
							System.out.println("1.Airtel\n2.Jio\n");
							int select_sim=s.nextInt();
							switch (select_sim)
							{
							case 1:{
								//User trying to see Sim 1 Details
								if(mobile.isSim1isPresent()){
									mobile.slot1.detailsOfSim();
								}else{
									System.out.println("Can't Display Details Because Sim is Not Present");
								}
								break;}
							case 2:{
								//User trying to see Sim 2 Details
								if(mobile.isSim2isPresent()){
									mobile.slot2.detailsOfSim();
								}else{
									System.out.println("Can't Display Details Because Sim is Not Present");
								}
								break;}
									
							}
						
					break;}
				case 6:{
							b=false;
							System.out.println("\t\t\t*******Thank You*********");
					break;}
				
				
				}
			}
			while (b);
		}
	}
