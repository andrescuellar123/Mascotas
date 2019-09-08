
public class Pet {
	private static final int MALE = 1;
	private static final int  FEMALE= 2;
	private String id;
	private String name;
	private String dateBorn;
	private int genre;
	private String typePet;
	
	/**
	 * @param identification
	 * @param name
	 * @param dateBorn
	 * @param genre
	 * @param typePet
	 */
	public Pet(String id, String name, String dateBorn, int genre, String typePet) {
		super();
		this.id = id;
		this.name = name;
		this.dateBorn = dateBorn;
		this.genre = genre;
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
	 * @return the genre
	 */
	public int getGenre() {
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(int genre) {
		this.genre = genre;
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
	
	
	
	public int compareNamePet(Pet p) {
		
		return name.compareTo(p.getName());
	}
	
	public int compareIdPet(Pet p) {
		
		return id.compareTo(p.getIdentification());
	}
	
	public int compareGenrePet(Pet p) {
		
		return genre - p.getGenre();
	}
	
	public int compareDateBornPet(Pet p) {
		
		return dateBorn.compareTo(p.getDateBorn());
	}
	
	public int compareTypePet(Pet p) {
		
		return typePet.compareTo(p.getTypePet());
	}
	

}
