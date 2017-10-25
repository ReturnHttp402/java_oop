/**
 *
 * @author ReturnHttp402(https://github.com/ReturnHttp402)
 *
 */
public class LancelLannister extends Character {
    private List<String> titles;
    private String nickname;
    private String fullName;
    private String portrayedBy;
    private House house;

    public LancelLannister(House house){
        his.titles = new ArrayList<String>();
        this.generateTitles();
        this.nickname = "";
        this.fullName = "Lancel Lannister";
        this.portrayedBy = "EUGENE SIMON"
        //house might be better assigned if it was passed into the constructor
        //this character, could be from different houses, but only could be currently in a house
        this.house = house;
    }
    private void generateTitles() {
        this.titles.add("A first cousin of Queen Cersei");
        this.titles.add("Oathbreaker");
    }


}