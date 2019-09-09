import java.util.ArrayList;

public class MayorClass {
private ArrayList<Club> club;




/**
 * @param club
 */
public MayorClass(ArrayList<Club> club) {
	super();
	this.club = club;
}




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

public int comparateClub(Club c) {
	return c.
}



public void organizeTypePetName() {
	for(int i = 0; i < club.size();i++) {
		for(int j = 0;j<club.size()-1-i;j++) {
			if(club.get(j).compareTypePet(club.get(j+1))>0) {
				Pet tmp = club.get(j);
				club.set(j, club.get(j+1));
				club.set(j+1, tmp);
			}
		}
	}
	
}
}
