package ie.atu;

public class Trawler {

    private String name;

    private String typeTrawler;

    private int transponderID;

    public Trawler(String name, String typeTrawler, int transponderID) {
        this.name = name;
        this.typeTrawler = typeTrawler;
        this.transponderID = transponderID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeTrawler() {
        return typeTrawler;
    }

    public void setTypeTrawler(String typeTrawler) {
        this.typeTrawler = typeTrawler;
    }

    public int getTransponderID() {
        return transponderID;
    }

    public void setTransponderID(int transponderID) {
        this.transponderID = transponderID;
    }

    public String toString() {
        return "Trawler name: " + name + "\nTransponder ID: " + transponderID +
                "\nTrawler type: " + typeTrawler;
    }
}
