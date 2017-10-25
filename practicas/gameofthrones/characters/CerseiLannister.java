/**
 *
 * @author ReturnHttp402(https://github.com/ReturnHttp402)
 *
 */
public class CerseiLannister extends Character {

    private List<String> titles;
    private String nickname;
    private String fullName;
    private String portrayedBy;
    private House house;

    public CerseiLannister(House house){
        his.titles = new ArrayList<String>();
        this.generateTitles();
        this.nickname = "Queen of the Seven Kingdoms";
        this.fullName = "Queen Cersei I Lannister";
        this.portrayedBy = "Lena Headey";
        //house might be better assigned if it was passed into the constructor
        //this character, could be from different houses, but only could be currently in a house
        this.house = house;
    }
    private void generateTitles() {
        this.titles.add("Queen of the Andals and the First Men");
        this.titles.add("Protector of the Seven Kingdoms");
        this.titles.add("Lady of the Casterly Rock");
        this.titles.add("Lady Paramount of the Westerlands");
        this.titles.add("Wardeness of the West");
        this.titles.add("Queen Mother");
        this.titles.add("Queen Regent");
        this.titles.add("Queen Consort");
    }
}