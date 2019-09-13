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
 * @return the pets
 */
public ArrayList<Pet> getPets() {
	return pets;
}


/**
 * @param pets the pets to set
 */
public void setPets(ArrayList<Pet> pets) {
	this.pets = pets;
}


/**
 * @return the own
 */
public ArrayList<Owner> getOwn() {
	return own;
}


/**
 * @param own the own to set
 */
public void setOwn(ArrayList<Owner> own) {
	this.own = own;
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
	
	public String TradicionalSearchNameClub(String name) {
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
	
	public String TradicionalSearchIdClub(String id) {
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
	

	
	
	

	

    

	
	
	


}
