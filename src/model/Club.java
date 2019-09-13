package model;
import java.util.ArrayList;

public class Club implements Comparable<Club>  {
private String identification;
private String name;
private String dateCrea;
private String typePet;

//RelationShip
private ArrayList<Owner> own;

/** the constructor
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
	own = new ArrayList<>();
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
@Override
public int compareTo(Club clu) {
	return own.size()-clu.getOwn().size();

}
/**
* Description este metodo compara los nombres
* @param c un club
* @return int 
*/

public int compareNameClub(Club c) {
	
	return name.compareTo(c.getName());
}
/**
* Description este metodo compara los id
* @param c un club
* @return int 
*/
public int compareIdClub(Club c) {
	
	return identification.compareTo(c.getIdentification());
}
/**
* Description este metodo compara las fechas de nacimiento
* @param c un club
* @return int 
*/
public int compareDateCreation(Club c) {
	
	return dateCrea.compareTo(c.getDateCrea());
}
/**
* Description este metodo compara los tipos de mascotas
* @param c un club
* @return int 
*/
public int compareTypePet(Club c) {
	
	return typePet.compareTo(c.getTypePet());
}


//aniadir  y borrar  un cliente
/**
* Description este metodo aniade un duenio
* @param o un duenio
 
*/

public void addOwner(Owner o) throws MyException{
	boolean already = false;
	for(int i=0; i<own.size() && already; i++){
		if(own.get(i).getIdentification().compareTo(o.getIdentification()) == 0){
			already = true;
		}
		else if(already) {
			own.add(o);
		}
		else 
			throw new MyException("Este cliente ya esta registrado");
		}
	}
/**
* Description este metodo borra un duenio
* @param o un duenio
 
*/

public void RemoveOwners(Owner o) {
	for (int i = 0; i < own.size(); i++) {
		if(own.get(i).getName().equals(o.getName()) && own.get(i).getIdentification().equals(o.getIdentification())) {
			own.remove(i);
		}
	}
}
	


/**
* Description este metodo organiza a un duenio por nombre

*/
public void organizeNameOwner() {
	for(int i = 0; i < own.size();i++) {
		for(int j = 0;j<own.size()-1-i;j++) {
			if(own.get(j).compareNameOwner(own.get(j+1))>0) {
				Owner tmp = own.get(j);
				own.set(j, own.get(j+1));
				own.set(j+1, tmp);
			}
		}
	}
	
}
/**
* Description este metodo organiza a un duenio por id

*/

public void organizeIdOwner() {
	for(int i = 0; i < own.size();i++) {
		for(int j = 0;j<own.size()-1-i;j++) {
			if(own.get(j).compareIdentityOwner(own.get(j+1))>0) {
				Owner tmp = own.get(j);
				own.set(j, own.get(j+1));
				own.set(j+1, tmp);
			}
		}
	}
	
}

/**
* Description este metodo organiza a un duenio por apellido

*/
public void organizeLastNameOwner() {
	for(int i = 0; i < own.size();i++) {
		for(int j = 0;j<own.size()-1-i;j++) {
			if(own.get(j).compareLastNameOwner(own.get(j+1))>0) {
				Owner tmp = own.get(j);
				own.set(j, own.get(j+1));
				own.set(j+1, tmp);
			}
		}
	}
	
}
/**
* Description este metodo organiza a un duenio por fecha de nacimiento

*/
public void organizeDateBornOwner() {
	for(int i = 0; i < own.size();i++) {
		for(int j = 0;j<own.size()-1-i;j++) {
			if(own.get(j).compareDateBornOwner(own.get(j+1))>0) {
				Owner tmp = own.get(j);
				own.set(j, own.get(j+1));
				own.set(j+1, tmp);
			}
		}
	}
	
}
/**
* Description este metodo organiza a un duenio por tipo de mascota

*/

public void organizeTypePetOwner() {
	for(int i = 0; i < own.size();i++) {
		for(int j = 0;j<own.size()-1-i;j++) {
			if(own.get(j).compareTypePetOwner(own.get(j+1))>0) {
				Owner tmp = own.get(j);
				own.set(j, own.get(j+1));
				own.set(j+1, tmp);
			}
		}
	}
	
}


//tipos de busqueda para cada atributo de duenio

/**
* Description este metodo busca a un duenio
* @param name nombre del duenio
* @return String 
*/

public String TradicionalSearchName(String name) {
	String response = "No se encontrado el nombre del cliente";
	for(int i = 0;i<own.size();i++) {
		if(own.get(i).getName().equals(name) ) {
			response = own.get(i).getName() + "es el nombre del cliente" ;
		}
	}
	
	return response;
}

/**
* Description este metodo busca a un duenio
* @param id el id del duenio
* @return String 
*/


public String TradicionalSearchId(String id) {
	String response = "No se encontrado la id del cliente";
	int p =0;
	for(int i = 0;i<own.size();i++) {
		if(own.get(i).getIdentification().equals(id) ) {
			response = own.get(i).getIdentification() + "es la id  del cliente" ;
			p++;
		}
		if(p == 1) {
			response = "Hay una o mas clientes con el mismo id ";
		}
	}
	
	return response;
}
/**
* Description este metodo busca a un duenio
* @param lastName apellido del duenio
* @return String 
*/


public String TradicionalSearchLastName(String lastName) {
	String response = "No se encontrado el apellido del cliente";
	for(int i = 0;i<own.size();i++) {
		if(own.get(i).getLastName().equals(lastName) ) {
			response = own.get(i).getLastName() + "es el apellido del cliente" ;
		}
	}
	
	return response;
}
/**
* Description este metodo busca a un duenio
* @param dateBorn fecha de nacimiento del duenio
* @return String 
*/


public String TradicionalSearchDateBorn(String dateBorn) {
	String response = "No se encontrado la fecha de nacimiento del cliente";
	for(int i = 0;i<own.size();i++) {
		if(own.get(i).getDateBorn() == dateBorn) {
			response = own.get(i).getDateBorn() + "es la fecha de nacimiento del cliente" ;
		}

	}
	
	return response;
}
/**
* Description este metodo busca a un duenio
* @param typePet tipo de mascota
* @return String 
*/

public String TradicionalSearchTypePet(String typePet) {
	String response = "No se encontrado el tipo de mascota del cliente";

	for(int i = 0;i<own.size();i++) {
		if(own.get(i).getTypePet().equals(typePet) ) {
			response = own.get(i).getTypePet() + "es el tipo de mascota  del cliente" ;
		
		}

	}
	
	return response;
}


//busqueda binaria

/**
* Description este metodo busca a un duenio
* @param nameO nombre del duenio
* @return boolean 
*/


public boolean BinarySearchNameOwner(String nameO) {
	boolean band = false;
	int l = 0;
	int end=own.size()-1;
	
	
	while(end >= l && !band) {
		int middle = (end + l)/2;
		if(own.get(middle).getName().equals(nameO)) {
			band = true;
		}
		else if(own.get(middle).getName().compareTo(nameO)>0) {
			end = middle - 1;
		}
		else {
			l = middle + 1;
		}
	}
	return band;
}

/**
* Description este metodo busca a un duenio
* @param idO el id del duenio
* @return boolean 
*/

public boolean BinarySearchIdentityOwner(String idO) {
	boolean band = false;
	int l = 0;
	int end=own.size()-1;
	
	
	while(end >= l && !band) {
		int middle = (end + l)/2;
		if(own.get(middle).getIdentification().equals(idO)) {
			band = true;
		}
		else if(own.get(middle).getIdentification().compareTo(idO)>0) {
			end = middle - 1;
		}
		else {
			l = middle + 1;
		}
	}
	return band;
}

/**
* Description este metodo busca a un duenio
* @param lastNameO nombre del duenio
* @return boolean 
*/
public boolean BinarySearchLastNameOwner(String lastNameO) {
	boolean band = false;
	int l = 0;
	int end=own.size()-1;
	
	
	while(end >= l && !band) {
		int middle = (end + l)/2;
		if(own.get(middle).getLastName().equals(lastNameO)) {
			band = true;
		}
		else if(own.get(middle).getLastName().compareTo(lastNameO)>0) {
			end = middle - 1;
		}
		else {
			l = middle + 1;
		}
	}
	return band;
}

/**
* Description este metodo busca a un duenio
* @param bornDateO fecha de nacimiento del duenio
* @return boolean 
*/

public boolean BinarySearchBornDateOwner(String bornDateO) {
	boolean band = false;
	int l = 0;
	int end=own.size()-1;
	
	
	while(end >= l && !band) {
		int middle = (end + l)/2;
		if(own.get(middle).getDateBorn().equals(bornDateO)) {
			band = true;
		}
		else if(own.get(middle).getDateBorn().compareTo(bornDateO)>0) {
			end = middle - 1;
		}
		else {
			l = middle + 1;
		}
	}
	return band;
}


/**
* Description este metodo busca a un duenio
* @param TypePetO tipo de mascota  del duenio
* @return boolean 
*/

public boolean BinarySearchTypePetOwner(String TypePetO) {
	boolean band = false;
	int l = 0;
	int end=own.size()-1;
	
	
	while(end >= l && !band) {
		int middle = (end + l)/2;
		if(own.get(middle).getTypePet().equals(TypePetO)) {
			band = true;
		}
		else if(own.get(middle).getTypePet().compareTo(TypePetO)>0) {
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
	return "Club [identification=" + identification + ", name=" + name + ", dateCrea=" + dateCrea + ", typePet="
			+ typePet + ", own=" + own + "]";
}


}



	

