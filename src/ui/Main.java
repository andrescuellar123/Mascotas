package ui;
import java.util.ArrayList;
import java.util.Scanner;
import model.*;

public class Main {
	
	private MayorClass mayor;
	private Club club;
	private Owner own;
	private Scanner reader;
	
	
	public Main(){
		  init();
		  reader = new Scanner(System.in);

		}

	public static void main(String[] args) {
		
		  Main m = new Main();
		  m.showMenu();

	}
	
	
	public void showMenu(){
		  int userImput =0;

		System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println("//////////////////////////1.REGISTRARSE CON SU MASCOTA///////////////////////////////////////");
		System.out.println("//////////////////////////2.REGISTRAR AL DUENIO//////////////////////////////////////////////");
		System.out.println("//////////////////////////3.REGISTRAR AL CLUB////////////////////////////////////////////////");
		System.out.println("//////////////////////////4.ORGANIZAR MASCOTA////////////////////////////////////////////////");
		System.out.println("//////////////////////////6.ORGANIZAR CLIENTE////////////////////////////////////////////////");
		System.out.println("//////////////////////////7.ORGANIZAR CLUBES/////////////////////////////////////////////////");
		System.out.println("//////////////////////////8.BUSCAR MASCOTA///////////////////////////////////////////////////");
		System.out.println("//////////////////////////9.BUSCAR CLIENTE///////////////////////////////////////////////////");
		System.out.println("//////////////////////////10.BUSCAR CLUB/////////////////////////////////////////////////////");
		System.out.println("//////////////////////////11.AGREGAR OTRA MASCOTA////////////////////////////////////////////");
		System.out.println("//////////////////////////12.AGREGAR OTRO CLIENTE////////////////////////////////////////////");
		System.out.println("//////////////////////////13.AGREGAR OTRO CLUB///////////////////////////////////////////////");
		System.out.println("//////////////////////////14.EL COSTO DE SERVICIOS PROMEDIADOS///////////////////////////////");
		System.out.println("//////////////////////////15.EL COSTO TOTAL DE LOS SERVICIOS ////////////////////////////////");
		System.out.println("//////////////////////////16.INGRESAR UN NUEVO SERVICIO//////////////////////////////////////");
		System.out.println("//////////////////////////17.MOSTRAR LA INFO CON FECHA INICIAL Y LA FINAL////////////////////");
		System.out.println("//////////////////////////18.MOSTRAR EL CALCULO DE UNA SEMANA////////////////////////////////");
		System.out.println("//////////////////////////19.SALIR///////////////////////////////////////////////////////////");
		System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////");
  
		
		
		 while(userImput != 19){
			 
			 
		 
			   if(userImput == 1){
			   System.out.println("Digite el nombre de la mascota");
			   String name = reader.nextLine();

			   System.out.println("Digite la identificacion de la mascota");
			   String id = reader.nextLine();
			   reader.nextLine();

			   System.out.println("Digite la fecha de nacimiento de la mascota ");
			   String dateBorn = reader.nextLine();

			   System.out.println("Digite el genero del animal");
			   int genre = reader.nextInt();

			   System.out.println("Digite el genero del animal");
			   String  typePet= reader.nextLine();

			   Pet pets = new Pet( id,  name,  dateBorn,  genre,  typePet);


			   ArrayList<Pet> clientsPets = new ArrayList<Pet>();
		
		
		
		
			   }   else if(userImput == 2){
				   System.out.println("Digite el nombre del duenio");
				   String name = reader.nextLine();

				   System.out.println("Digite la identificacion del duenio");
				   String id = reader.nextLine();
				   reader.nextLine();

				   System.out.println("Digite la fecha de nacimiento del duenio");
				   String dateBorn = reader.nextLine();

				   System.out.println("Digite el apellido del duenio");
				   String lastName = reader.nextLine();

				   System.out.println("Digite el tipo de mascota del duenio");
				   String  typePet= reader.nextLine();

				   Owner own = new Owner(  id,  name,  lastName,  dateBorn,  typePet);


				   ArrayList<Owner> owners = new ArrayList<Owner>();
			
			
			
			
				} else if(userImput == 3){
					   System.out.println("WHAT IS THE CLUB'S NAME?");
					   String name = reader.nextLine();

					   System.out.println("WHAT IS THE CLUB'S ID?");
					   String identification = reader.nextLine();
					   reader.nextLine();

					   System.out.println("WHAT IS THE CREATION DATE?");
					   String dateCrea = reader.nextLine();


					   System.out.println("WRITE TYPE OF PET ");
					   String  typePet= reader.nextLine();

					   Club club = new Club( identification,  name,  dateCrea,  typePet);


					   ArrayList<Owner> clubs = new ArrayList<Owner>();
				
				
				
				
				}else if(userImput == 4) {
			        System.out.println( "HOW DO YOU WANT TO ORGANIZE?");
			        System.out.println( "1. BY TH NAME");
			        System.out.println( "2. BY ID");
			        System.out.println( "3.BY BORNING DATE");
			        System.out.println( "4.BY THE GENDER");
			        
			        int userSel = reader.nextInt();
			        reader.nextLine();

			        
			        if(userSel == 1){
			        		mayor.organizePetName();
				        	System.out.println( mayor.showReportPet());
		
			        }
			        else if(userSel == 2){
		        		mayor.organizeInsertionPetId();
			        	System.out.println( mayor.showReportPet());
	
			        } else if(userSel == 3){
		        		mayor.organizePetBornDate();
			        	System.out.println( mayor.showReportPet());
	
			       } else if(userSel == 4){
		        		mayor.organizePetGenre();
			        	System.out.println( mayor.showReportPet());
	
			       }
			    
			        	
			     
				}else if(userImput == 5) {
			        System.out.println( "HOW DO YOU WANT TO ORGANIZE?");
			        System.out.println( "1. BY TH NAME");
			        System.out.println( "2. BY ID");
			        System.out.println( "3.BY BORNING DATE");
			        System.out.println( "4.BY THE LASTNAME");
			        
			        int userSel = reader.nextInt();
			        reader.nextLine();

			        
			        if(userSel == 1){
			        		mayor.organizeNameOwner();
				        	System.out.println( mayor.showReportOwner());
		
			        }
			        else if(userSel == 2){
		        		mayor.organizeIdOwner();
			        	System.out.println( mayor.showReportOwner());
	
			        } else if(userSel == 3){
		        		mayor.organizeLastNameOwner();
			        	System.out.println( mayor.showReportOwner());
	
			       } else if(userSel == 4){
		        		mayor.organizeDateBornOwner();
			        	System.out.println( mayor.showReportOwner());
	
			       }
			    
			        	
			     
				}else if(userImput == 6) {
			        System.out.println( "HOW DO YOU WANT TO ORGANIZE?");
			        System.out.println( "1. BY TH NAME");
			        System.out.println( "2. BY ID");
			        System.out.println( "3.BY BORNING DATE");
			        System.out.println( "4.BY THE TYPE OF PET");
			        
			        int userSel = reader.nextInt();
			        reader.nextLine();

			        
			        if(userSel == 1){
			        		mayor.organizeClubName();
				        	System.out.println(  mayor.showReportClub());
		
			        }
			        else if(userSel == 2){
		        		mayor.organizeClubId();
			        	System.out.println(  mayor.showReportClub());
	
			        } else if(userSel == 3){
		        		mayor.OrganizeBubbleDateCreationClub();
			        	System.out.println( mayor.showReportClub());
	
			       } else if(userSel == 4){
		        		mayor.organizeTypePetClub();
			        	System.out.println(  mayor.showReportClub());
	
			       }
			    
			        	
			     
				}else if(userImput == 7) {
			        System.out.println( "WHAT ATRIBUTE DO YOU WANT TO SEARCH IN  THE PET?");
			        System.out.println( "1. THE NAME");
			        System.out.println( "2. THE ID");
			        System.out.println( "3. THE BORNING DATE");
			        System.out.println( "4. THE GENDER");
			        
			        int userSel = reader.nextInt();
			        reader.nextLine();

			        
			        if(userSel == 1){
			        	System.out.println( "WRITE THE NAME OF THE PET");
						   String NAME = reader.nextLine();
						   reader.nextLine();
			        	 System.out.println( own.TradicionalSearchNamePet(NAME));
			        } else if(userSel == 2){
			        	System.out.println( "WRITE THE ID OF THE PET");
						   String id = reader.nextLine();
						   reader.nextLine();
			        	 System.out.println( own.TradicionalSearchIdPet(id));
			        } else if(userSel == 3){
			        	System.out.println( "WRITE THE BRNING DATE OF THE PET");
						   String BORN = reader.nextLine();
						   reader.nextLine();
			        	 System.out.println( own.TradicionalSearchDateBornPet(BORN));
			        }else if(userSel == 4){
			        	System.out.println( "WRITE THE BRNING DATE OF THE PET");
						   int GENDER = reader.nextInt();
						   reader.nextInt();
			        	 System.out.println( own.TradicionalSearchLastGenre(GENDER));
			        }
			        
			        
			       
				}else if(userImput == 8) {
			        System.out.println( "WHAT ATRIBUTE DO YOU WANT TO SEARCH IN  THE PET?");
			        System.out.println( "1. THE NAME");
			        System.out.println( "2. THE ID");
			        System.out.println( "3. THE BORNING DATE");
			        System.out.println( "4. THE GENDER");
			        
			        int userSel = reader.nextInt();
			        reader.nextLine();

			        
			        if(userSel == 1){
			        	System.out.println( "WRITE THE NAME OF THE PET");
						   String NAME = reader.nextLine();
						   reader.nextLine();
			        	 System.out.println( club.TradicionalSearchNamePet(NAME));
			        } else if(userSel == 2){
			        	System.out.println( "WRITE THE ID OF THE PET");
						   String id = reader.nextLine();
						   reader.nextLine();
			        	 System.out.println( own.TradicionalSearchIdPet(id));
			        } else if(userSel == 3){
			        	System.out.println( "WRITE THE BRNING DATE OF THE PET");
						   String BORN = reader.nextLine();
						   reader.nextLine();
			        	 System.out.println( own.TradicionalSearchDateBornPet(BORN));
			        }else if(userSel == 4){
			        	System.out.println( "WRITE THE BRNING DATE OF THE PET");
						   int GENDER = reader.nextInt();
						   reader.nextInt();
			        	 System.out.println( own.TradicionalSearchLastGenre(GENDER));
			        	 int i =0;
			        	 mayor.getOwn().get(i).BinarySearchNamePet(id);
			        }
			        
			        
			       
				}
			   
			}
		
	
		 }
	
	
	
}
