
public class Club {
private String identification;
private String name;
private String dateCrea;
private String typePet;

/**
 * @param identification
 * @param name
 * @param dateCrea
 * @param typePet
 */
public Club(String identification, String name, String dateCrea, String typePet) {
	super();
	this.identification = identification;
	this.name = name;
	this.dateCrea = dateCrea;
	this.typePet = typePet;
}
/**
 * @return the identification
 */
public String getIdentification() {
	return identification;
}
/**
 * @param identification the identification to set
 */
public void setIdentification(String identification) {
	this.identification = identification;
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
 * @return the dateCrea
 */
public String getDateCrea() {
	return dateCrea;
}
/**
 * @param dateCrea the dateCrea to set
 */
public void setDateCrea(String dateCrea) {
	this.dateCrea = dateCrea;
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



}
