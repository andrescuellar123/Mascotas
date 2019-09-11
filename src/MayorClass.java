import java.util.ArrayList;

public class MayorClass {
private ArrayList<Club> club;

/**
 * @param club
 */
public MayorClass(ArrayList<Club> club) {
	club = new ArrayList<>();
}



	public void addOwner(Owner o) throws MyException{
		boolean already = false;
		for(int i=0; i<club.size() && already; i++){
			if(club.get(i).getIdentification().compareTo(o.getIdentification()) == 0){
				already = true;
			}
			else if(already) {
				club.get(i).getOwn().add(o);
			}
			else 
				throw new MyException("Este cliente ya esta registrado");
		}
		
	}
	
	//aniadir  y borrar  un club
	
	
	public void addClub(Club c) {
		club.add(c);
	}
	
	public void RemoveOwners(Club c) {
		for (int i = 0; i < club.size(); i++) {
			if(club.get(i).getName().equals(c.getName()) && club.get(i).getIdentification().equals(c.getIdentification())) {
				club.remove(i);
			}
		}
	}
	// l
	
	
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
	
	public String TradicionalSearchNameClub(String name) {
		String response = "No se encontrado el nombre del club";
		for(int i = 0;i<club.size();i++) {
			if(club.get(i).getName().equals(name) ) {
				response = club.get(i).getName() + "es el nombre del club" ;
			}
		}
		
		return response;
	}
	
	public String TradicionalSearchIdClub(String id) {
		String response = "No se encontrado la identificacion del club";
		for(int i = 0;i<club.size();i++) {
			if(club.get(i).getIdentification().equals(id) ) {
				response = club.get(i).getIdentification() + "es la identificacion del club" ;
			}
		}
		
		return response;
	}
	public String TradicionalSearchDateCreationClub(String dateCreation) {
		String response = "No se encontrado la fecha de creacion del club";
		for(int i = 0;i<club.size();i++) {
			if(club.get(i).getDateCrea().equals(dateCreation) ) {
				response = club.get(i).getDateCrea() + "es la fecha de creacion del club" ;
			}
		}
		
		return response;
	}
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
