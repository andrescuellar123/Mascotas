import java.io.Serializable;

import java.util.ArrayList;

import java.util.Comparator;


public class Owner implements Serializable, Comparable<Owner>, Comparator<Owner> {
	private String id;
	private String name;
	private String lastName;
	private String dateBorn;
	private String typePet;
	
	//relationShip
	
	private ArrayList<Pet> pets;
	
	/**
	 * @param identification
	 * @param name
	 * @param lastName
	 * @param dateBorn
	 * @param typePet
	 */
	public Owner(String id, String name, String lastName, String dateBorn, String typePet) {
		
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.dateBorn = dateBorn;
		this.typePet = typePet;
		pets = new ArrayList<>();
	}
	
	/**
	 * @return the identification
	 */
	public String getIdentification() {
		return id;
	}
	/**
	 * @param identification the identification to set
	 */
	public void setIdentification(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the dateBorn
	 */
	public String getDateBorn() {
		return dateBorn;
	}
	/**
	 * @param dateBorn the dateBorn to set
	 */
	public void setDateBorn(String dateBorn) {
		this.dateBorn = dateBorn;
	}
	/**
	 * @return the typePet
	 */
	public String getTypePet() {
		return typePet;
	}
	/**
	 * @param typePet the typePet to set
	 */
	public void setTypePet(String typePet) {
		this.typePet = typePet;
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
	
	@Override
	public int compare(Owner o, Owner o1) {
		
		return 0;
	}

	@Override
	public int compareTo(Owner arg0) {
		return pets.size()-arg0.getPets().size();
	}
	
	
	
	public int compareNameOwner(Owner o) {
		
		return name.compareTo(o.getName());
	}
	
	public int compareIdentityOwner(Owner o) {
		
		return id.compareTo(o.getIdentification());
	}
	
	public int compareLastNameOwner(Owner o) {
		
		return lastName.compareTo(o.getLastName());
	}
	
	public int compareDateBornOwner(Owner o) {
		
		return dateBorn.compareTo(o.getDateBorn());
	}
	
	public int compareTypePetOwner(Owner o) {
		
		return typePet.compareTo(o.getTypePet());
	}
	
	//aniadir  y borrar  una mascota
	
	public void addPet(Pet m) throws MyException{
		boolean equal = false;
		for(int i=0; i<pets.size() && !equal; i++){
			if(pets.get(i).compareNamePet(m)==0){
				throw new MyException("La mascota tiene el mismo nombre");
			}else{
				pets.add(m);
			}
		}
	}
	
	public void RemoveOwners(Pet m) {
		for (int i = 0; i < pets.size(); i++) {
			if(pets.get(i).getName().equals(m.getName()) && pets.get(i).getIdentification().equals(m.getIdentification())) {
				pets.remove(i);
			}
		}
	}
	
	public void organizePetName() {
		for(int i = 0; i < pets.size();i++) {
			for(int j = 0;j<pets.size()-1-i;j++) {
				if(pets.get(j).compareNamePet(pets.get(j+1))>0) {
					Pet tmp = pets.get(j);
					pets.set(j, pets.get(j+1));
					pets.set(j+1, tmp);
				}
			}
		}
		
	}
	
	//ordenamiento insercion
	
	public void organizeInsertionPetId() {
		for (int i = 0; i < pets.size()-1; i++) {
			Pet p = pets.get(i);
			int l = i;
			for (int j = i+1; j < pets.size(); j++) {
				if(p.compareIdPet(pets.get(j))>0) {
					p=pets.get(j);
					l=j;
				}
			}
		}
	}
	
	
	public void organizePetGenre() {
		for(int i = 0; i < pets.size();i++) {
			for(int j = 0;j<pets.size()-1-i;j++) {
				if(pets.get(j).compareGenrePet(pets.get(j+1))>0) {
					Pet tmp = pets.get(j);
					pets.set(j, pets.get(j+1));
					pets.set(j+1, tmp);
				}
			}
		}
		
	}
	public void organizePetBornDate() {
		for(int i = 0; i < pets.size();i++) {
			for(int j = 0;j<pets.size()-1-i;j++) {
				if(pets.get(j).compareDateBornPet(pets.get(j+1))>0) {
					Pet tmp = pets.get(j);
					pets.set(j, pets.get(j+1));
					pets.set(j+1, tmp);
				}
			}
		}
		
	}
	public void organizeTypePetName() {
		for(int i = 0; i < pets.size();i++) {
			for(int j = 0;j<pets.size()-1-i;j++) {
				if(pets.get(j).compareTypePet(pets.get(j+1))>0) {
					Pet tmp = pets.get(j);
					pets.set(j, pets.get(j+1));
					pets.set(j+1, tmp);
				}
			}
		}
		
	}
	
	//busqueda tradicional para mascotas
	
	public String TradicionalSearchNamePet(String name) {
		String response = " No se encontrado el nombre de la mascota";
		int p = 0;
		for(int i = 0;i<pets.size();i++) {
			if(pets.get(i).getName().equals(name) ) {
				response = pets.get(i).getName() + "es el nombre de la mascota" ;
				p++;
			}
			if(p == 1) {
				response = "Hay una o mas mascotas con el mismo nombre ";
			}
		}
		
		return response;
	}


	public String TradicionalSearchIdPet(String id) {
		String response = "No se encontrado la id de la mascota";
		int p = 0;
		for(int i = 0;i<pets.size();i++) {
			if(pets.get(i).getIdentification().equals(id) ) {
				response = pets.get(i).getIdentification() + "es la id  de la mascota" ;
				p++;
			}
			if(p == 1) {
				response = "Hay una o mas mascotas con el mismo nombre ";
			}
		}
		
		return response;
	}

	public String TradicionalSearchLastGenre(int genre ) {
		String response = "No se encontrado el sexo de la mascota";
		for(int i = 0;i<pets.size();i++) {
			if(pets.get(i).getGenre()==genre ) {
				response = pets.get(i).getGenre() + "el sexo de la mascota" ;
			}
		}
		
		return response;
	}

	public String TradicionalSearchDateBornPet(String dateBorn) {
		String response = "No se encontrado la fecha de nacimiento de la mascota";
		for(int i = 0;i<pets.size();i++) {
			if(pets.get(i).getDateBorn() == dateBorn) {
				response = pets.get(i).getDateBorn() + "es la fecha de nacimiento de la mascota" ;
			}
		}
		
		return response;
	}

	public String TradicionalSearchTypePet(String typePet) {
		String response = "No se encontrado el tipo de la mascota";
		for(int i = 0;i<pets.size();i++) {
			if(pets.get(i).getTypePet().equals(typePet) ) {
				response = pets.get(i).getTypePet() + "es el tipo de la mascota" ;
			}

		}
		
		return response;
	}
	
	//busqueda binaria
	
	public boolean BinarySearchNamePet(String nameP) {
		boolean band = false;
		int l = 0;
		int end=pets.size()-1;
		
		
		while(end >= l && !band) {
			int middle = (end + l)/2;
			if(pets.get(middle).getName().equals(nameP)) {
				band = true;
			}
			else if(pets.get(middle).getName().compareTo(nameP)>0) {
				end = middle - 1;
			}
			else {
				l = middle + 1;
			}
		}
		return band;
	}

	public boolean BinarySearchIdPet(String idP) {
		boolean band = false;
		int l = 0;
		int end=pets.size()-1;
		
		
		while(end >= l && !band) {
			int middle = (end + l)/2;
			if(pets.get(middle).getIdentification().equals(idP)) {
				band = true;
			}
			else if(pets.get(middle).getIdentification().compareTo(idP)>0) {
				end = middle - 1;
			}
			else {
				l = middle + 1;
			}
		}
		return band;
	}
	
	
	public boolean BinarySearchGenrePet(int genreP) {
		boolean band = false;
		int l = 0;
		int end=pets.size()-1;
		
		
		while(end >= l && !band) {
			int middle = (end + l)/2;
			if( genreP == pets.get(middle).getGenre()  ) {
				band = true;
			}
			else if(genreP < pets.get(middle).getGenre()) {
				end = middle - 1;
			}
			else {
				l = middle + 1;
			}
		}
		return band;
	}
	
	
	public boolean BinarySearchBornDatePet(String bornDateP) {
		boolean band = false;
		int l = 0;
		int end=pets.size()-1;
		
		
		
		while(end >= l && !band) {
			int middle = (end + l)/2;
			if(pets.get(middle).getDateBorn().equals(bornDateP)) {
				band = true;
			}
			else if(pets.get(middle).getDateBorn().compareTo(bornDateP)>0) {
				end = middle - 1;
			}
			else {
				l = middle + 1;
			}
		
		}
		return band;
	}
	
	
		public boolean BinarySearchTypePet(String TypePetP) {
			boolean band = false;
			int l = 0;
			int end=pets.size()-1;
			
			
			
			while(end >= l && !band) {
				int middle = (end + l)/2;
				if(pets.get(middle).getTypePet().equals(TypePetP)) {
					band = true;
				}
				else if(pets.get(middle).getTypePet().compareTo(TypePetP)>0) {
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
			return "Owner [id=" + id + ", name=" + name + ", lastName=" + lastName + ", dateBorn=" + dateBorn
					+ ", typePet=" + typePet + ", pets=" + pets + "]";
		}

		
		

		
		
	
}
