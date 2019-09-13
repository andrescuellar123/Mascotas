package model;
import java.util.ArrayList;

public class MayorClass {
private ArrayList<Club> club;


/**
 * @param club
 */
public MayorClass(ArrayList<Club> club) {
	club = new ArrayList<>();
}


//aniadir  y borrar  un club


	/**
 * @return the club
 */
public ArrayList<Club> getClub() {
	return club;
}


/**
 * @param club the club to set
 */
public void setClub(ArrayList<Club> club) {
	this.club = club;
}




/**
* Description este metodo aniade un club
* @param c un club
 
*/
	public void addClub(Club c) throws MyException{
		boolean already = false;
		for(int i=0; i<club.size() && already; i++){
			if(club.get(i).getIdentification().compareTo(c.getIdentification()) == 0){
				already = true;
			}
			else if(already) {
				club.add(c);
			}
			else 
				throw new MyException("Este club ya esta registrado");
		}
		
	}
	
	/**
	* Description este metodo borra un club
	* @param c un club
	 
	*/
	
	
	public void RemoveOwners(Club c) {
		for (int i = 0; i < club.size(); i++) {
			if(club.get(i).getName().equals(c.getName()) && club.get(i).getIdentification().equals(c.getIdentification())) {
				club.remove(i);
			}
		}
	}
	
	
	
	/**
	* Description este metodo organiza a un club

	*/
	
	public void orderClubs() {
		for (int  i= 0;  i< club.size()-1; i++) {
			for (int j = 0; j < club.size()-1-i; j++) {
				if (club.get(j).compareTo(club.get(j+1))>0) {
					Club tmp = club.get(j);
					club.set(j, club.get(j+1));
					club.set(j+1, tmp);
				}
			}
		}
	}
	
	/**
	* Description este metodo organiza a un club por nombre

	*/
	public void organizeClubName() {
		for(int i = 0; i < club.size();i++) {
			for(int j = 0;j<club.size()-1-i;j++) {
				if(club.get(j).compareNameClub(club.get(j+1))>0) {
					Club tmp = club.get(j);
					club.set(j, club.get(j+1));
					club.set(j+1, tmp);
				}
			}
		}
		
	}
	
	/**
	* Description este metodo organiza a un club por id

	*/
	
	public void organizeClubId() {
		for(int i = 0; i < club.size();i++) {
			for(int j = 0;j<club.size()-1-i;j++) {
				if(club.get(j).compareIdClub(club.get(j+1))>0) {
					Club tmp = club.get(j);
					club.set(j, club.get(j+1));
					club.set(j+1, tmp);
				}
			}
		}
		
	}
	/**
	* Description este metodo organiza a un club por tipo de mascota

	*/
	
	public void organizeTypePetClub() {
		for(int i = 0; i < club.size();i++) {
			for(int j = 0;j<club.size()-1-i;j++) {
				if(club.get(j).compareTypePet(club.get(j+1))>0) {
					Club tmp = club.get(j);
					club.set(j, club.get(j+1));
					club.set(j+1, tmp);
				}
			}
		}
		
	}
	
	//ordenamiento burbuja
	
	/**
	* Description este metodo organiza a un club por fecha de creacion

	*/
	public void OrganizeBubbleDateCreationClub() {
		for (int i = 0; i < club.size(); i++) {
			for (int j =1; j >0; j--) {
				if(club.get(j-1).compareDateCreation(club.get(j))>0) {
					Club tmp = club.get(j);
					club.set(j,club.get(j+1));
					club.set(j+1, tmp);
				}
				
			}
		}
	}
	
	
	//busqueda tradicional 
	
	/**
	* Description este metodo busca a un club
	* @param name nombre del club
	* @return String 
	*/
	
	public String TradicionalSearchNameOwner(String name) {
		String response = "No se encontrado el nombre del club";
		for(int i = 0;i<club.size();i++) {
			if(club.get(i).getName().equals(name) ) {
				response = club.get(i).getName() + "es el nombre del club" ;
			}
		}
		
		return response;
	}
	/**
	* Description este metodo busca a un club
	* @param id la identificacion del club
	* @return String 
	*/
	
	public String TradicionalSearchOwner(String id) {
		String response = "No se encontrado la identificacion del club";
		for(int i = 0;i<club.size();i++) {
			if(club.get(i).getIdentification().equals(id) ) {
				response = club.get(i).getIdentification() + "es la identificacion del club" ;
			}
		}
		
		return response;
	}
	/**
	* Description este metodo busca a un club
	* @param dateCreation fecha de creacion
	* @return String 
	*/
	public String TradicionalSearchDateCreationClub(String dateCreation) {
		String response = "No se encontrado la fecha de creacion del club";
		for(int i = 0;i<club.size();i++) {
			if(club.get(i).getDateCrea().equals(dateCreation) ) {
				response = club.get(i).getDateCrea() + "es la fecha de creacion del club" ;
			}
		}
		
		return response;
	}
	/**
	* Description este metodo busca a un club
	* @param typePet tipo de mascota
	* @return String 
	*/

	public String TradicionalSearchTypePetClub(String typePet) {
		String response = "No se encontrado tipo de mascota  del club";
		for(int i = 0;i<club.size();i++) {
			if(club.get(i).getTypePet().equals(typePet) ) {
				response = club.get(i).getTypePet() + "es el tipo de mascota del club" ;
			}
		}
		
		return response;
	}
	
	//busqueda binaria
	
	/**
	* Description este metodo busca a un club
	* @param name nombre del club
	* @return boolean 
	*/
	
	public boolean BinarySearchNameClub(String name) {
		boolean band = false;
		int l = 0;
		int end=club.size()-1;
		
		
		while(end >= l && !band) {
			int middle = (end + l)/2;
			if(club.get(middle).getName().equals(name)) {
				band = true;
			}
			else if(club.get(middle).getName().compareTo(name)>0) {
				end = middle - 1;
			}
			else {
				l = middle + 1;
			}
		}
		return band;
	}
	
	/**
	* Description este metodo busca a un club
	* @param id el id del club
	* @return boolean 
	*/
	public boolean BinarySearchIdClub(String id) {
		boolean band = false;
		int l = 0;
		int end=club.size()-1;
		
		
		while(end >= l && !band) {
			int middle = (end + l)/2;
			if(club.get(middle).getIdentification().equals(id)) {
				band = true;
			}
			else if(club.get(middle).getIdentification().compareTo(id)>0) {
				end = middle - 1;
			}
			else {
				l = middle + 1;
			}
		}
		return band;
	}
	
	/**
	* Description este metodo busca a un club
	* @param dateCreation fecha de creacion del club
	* @return boolean 
	*/
	public boolean BinarySearchDateCreationClub(String dateCreation) {
		boolean band = false;
		int l = 0;
		int end=club.size()-1;
		
		
		while(end >= l && !band) {
			int middle = (end + l)/2;
			if(club.get(middle).getDateCrea().equals(dateCreation)) {
				band = true;
			}
			else if(club.get(middle).getDateCrea().compareTo(dateCreation)>0) {
				end = middle - 1;
			}
			else {
				l = middle + 1;
			}
		}
		return band;
	}
	
	/**
	* Description este metodo busca a un club
	* @param typePet tipo de mascota del club
	* @return boolean 
	*/
	public boolean BinarySearchDateTypePetClub(String typePet) {
		boolean band = false;
		int l = 0;
		int end=club.size()-1;
		
		
		while(end >= l && !band) {
			int middle = (end + l)/2;
			if(club.get(middle).getTypePet().equals(typePet)) {
				band = true;
			}
			else if(club.get(middle).getTypePet().compareTo(typePet)>0) {
				end = middle - 1;
			}
			else {
				l = middle + 1;
			}
		}
		return band;
	}



	@Override
	public String toString() {
		return "MayorClass [club=" + club + "]";
	}
	
	

	
	//responsabities club
	

	

public String TradicionalSearchNamePet(String name) {
	String response = " no se encontro la mascota";
	int p = 0;
	boolean encontro = false;
	for(int i = 0;i<club.size() && encontro == true ;i++) {
		if(club.get(i).TradicionalSearchNamePet(name).equals(name) ) {
			encontro = true;
			response = "se encontro ";
			p++;
		}
		else if(p == 1) {
			response = "Hay una o mas mascotas con el mismo nombre ";
		}
		
	}

	return response;

}


public String TradicionalSearchIdPet(String id) {
	String response = " no se encontro la mascota";
	int p = 0;
	boolean encontro = false;
	for(int i = 0;i<club.size() && encontro == true ;i++) {
		if(club.get(i).TradicionalSearchIdPet(id).equals(id) ) {
			encontro = true;
			response = "se encontro ";
			p++;
		}
		else if(p == 1) {
			response = "Hay una o mas mascotas con el mismo id ";
		}
		
	}

	return response;

}

public String TradicionalSearchBornPet(String BornPet) {
	String response = " no se encontro la mascota";
	int p = 0;
	boolean encontro = false;
	for(int i = 0;i<club.size() && encontro == true ;i++) {
		if(club.get(i).TradicionalSearchIdPet(BornPet).equals(BornPet) ) {
			encontro = true;
			response = "se encontro ";
			p++;
		}
		else if(p == 1) {
			response = "Hay una o mas mascotas con el mismo fecha de naciemiento ";
		}
		
	}

	return response;

}

public String TradicionalSearchTypePetPet(String TypePet) {
	String response = " No se encontrado el nombre de la mascota";
	
	for(int i = 0;i<club.size();i++) {
		if(club.get(i).TradicionalSearchDateBornPet(TypePet).equals(TypePet) ) {
			response = club.get(i).getTypePet() + "es el tipo de la mascota" ;
		
		}

	}

	return response;
	

}



	public boolean binarySearchNamePet(String name) {
		boolean band =false;
		for(int i = 0;i<club.size() && band == true ; i++) {
			if(club.get(i).binarySearchNamePet(name)) {
				band=true;
			}
		}
		return band;
	}

	
	public boolean binarySearchIdPet(String id) {
		boolean band =false;
		for(int i = 0;i<club.size() && band == true ; i++) {
			if( club.get(i).binarySearchNamePet(id)) {
				band = true;
			}
		}
		return band;
	}
	
	

	public boolean binSearchBornDatePet(String bornDate) {
		boolean band =false;
		for(int i = 0;i<club.size() && band == true ; i++) {
			if(club.get(i).binarySearchBornDatePet(bornDate)) {
				band = true;
			}
		}
		return band;
	}

	
	public boolean binSearchTypePet(String TypePet) {
		boolean band =false;
		for(int i = 0;i<club.size() && band == true ; i++) {
			if( club.get(i).binarySearchTypePet(TypePet)) {
				band = true;
			}
		}
		return band;
	}
	
	
	//responsabilities Owner

	public String TradicionalSearchNameClub(String name) {
		String response = " No se encontrado el nombre de la mascota";
		int p = 0;
		for(int i = 0;i<club.size();i++) {
			if(club.get(i).TradicionalSearchNamePet(name).equals(name) ) {
				response = club.get(i).getName() + "es el nombre de la mascota" ;
				p++;
			}
			if(p == 1) {
				response = "Hay una o mas mascotas con el mismo nombre ";
			}
		}

		return response;
	}

		public String TradicionalSearchIdClub(String id) {
			String response = " No se encontrado el nombre de la mascota";
			int p = 0;
			for(int i = 0;i<club.size();i++) {
				if(club.get(i).TradicionalSearchIdPet(id).equals(id) ) {
					response = club.get(i).getIdentification() + "es el id de la mascota" ;
					p++;
				}
				if(p == 1) {
					response = "Hay una o mas mascotas con el mismo id ";
				}
			}

			return response;

		}
	
	public String TradicionalSearchLastName(String lastName) {
		String response = "No se encontrado el apellido del cliente";
		boolean p = false;
		for(int i = 0;i<club.size() && p == true;i++) {
			if(club.get(i).TradicionalSearchLastName(lastName).equals(lastName) ) {
				response = "el apellido se encontro" ;
				p = true;
			}
		}
		
		return response;
	}
	
	
	
	public String TradicionalSearchDateBornOwner(String dateBorn) {
		String response = "No se encontrado el apellido del cliente";
		boolean p = false;
		for(int i = 0;i<club.size() && p == true;i++) {
			if(club.get(i).TradicionalSearchDateBorn(dateBorn).equals(dateBorn) ) {
				response = "la fecha de nacimiento se encontro" ;
				p = true;
			}
		}
		
		return response;
	}
	
	public String TradicionalSearchTypePetOwner(String TypePet) {
		String response = "No se encontrado el apellido del cliente";
		boolean p = false;
		for(int i = 0;i<club.size() && p == true;i++) {
			if(club.get(i). TradicionalSearchTypePet(TypePet).equals(TypePet) ) {
				response = "el tipoi de mascota se encontro" ;
				p = true;
			}
		}
		
		return response;
	}
	
	//order responsabilities
	
	public void OrganizeNameP() {
		for (int i = 0; i < club.size(); i++) {
			club.get(i).OrganizeName();
		}
	}
	public void OrganizeGender() {
		for (int i = 0; i < club.size(); i++) {
			club.get(i).OrganizeGender();;
		}
	}
	public void OrganizeIdP() {
		for (int i = 0; i < club.size(); i++) {
			club.get(i).OrganizeId();;
		}
	}

	public void OrganizeTypeP() {
		for (int i = 0; i < club.size(); i++) {
			club.get(i).OrganizeTypePet();
		}
	}
	public void organizeDateBornP() {
		for (int i = 0; i < club.size(); i++) {
			club.get(i).OrganizeBornDate();
		}
	}

	public void OrganizeOwnerNames() {
		for (int i = 0; i < club.size(); i++) {
			club.get(i).organizeLastNameOwner();
		}
	}
	public void OrganizeLastName() {
		for (int i = 0; i < club.size(); i++) {
			club.get(i).organizeLastNameOwner();
		}
	}
	public void OrganizeDateBorn(){
		for (int i = 0; i < club.size(); i++) {
			club.get(i).organizeDateBornOwner();
		}
	}
	public void OrganizeOwnerID(){
		for (int i = 0; i < club.size(); i++) {
			club.get(i).organizeIdOwner();
		}
	}
	public void OrganizeTypePet(){
		for (int i = 0; i < club.size(); i++) {
			club.get(i).organizeTypePetOwner();
		}
	}

	

}
