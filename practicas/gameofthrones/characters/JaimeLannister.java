/**
 *
 * @author ReturnHttp402(https://github.com/ReturnHttp402)
 *
 */
public class JaimeLannister extends Character {

	private List<String> titles;
	private String nickname;
	private String fullName;
	private String portrayedBy;
	private House house;

	public JaimeLannister(House house){
		his.titles = new ArrayList<String>();
		this.generateTitles();
		this.nickname = "Kingslayer";
		this.fullName = "Jaime Lannister";
		this.portrayedBy = "Nikolaj Coster-Waldau"
		//house might be better assigned if it was passed into the constructor
		//this character, could be from different houses, but only could be currently in a house
		this.house = house;
	}
	private void generateTitles() {
		this.titles.add("Kingslayer");
		this.titles.add("Oathbreaker");
	}

}
