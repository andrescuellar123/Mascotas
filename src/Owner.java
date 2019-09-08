import java.util.ArrayList;

public class Owner {
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
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.dateBorn = dateBorn;
		this.typePet = typePet;
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
	
	
	public void addPet(Pet m){
		boolean equal = false;
		for(int i=0; i<pets.size() && !equal; i++){
			if(pets.get(i).compareNamePet(m)==0){
				//exception sameObject
			}else{
				pets.add(m);
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
	public void organizePetId() {
		for(int i = 0; i < pets.size();i++) {
			for(int j = 0;j<pets.size()-1-i;j++) {
				if(pets.get(j).compareIdPet(pets.get(j+1))>0) {
					Pet tmp = pets.get(j);
					pets.set(j, pets.get(j+1));
					pets.set(j+1, tmp);
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
	
}
