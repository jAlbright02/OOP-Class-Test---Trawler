package ie.atu;

import com.sun.jdi.InvalidTypeException;

import javax.naming.InvalidNameException;

public class Trawler {

    private String name;

    private String typeTrawler;

    private String transponderID;

    public Trawler(String name, String typeTrawler, String transponderID) throws InvalidNameException, InvalidTypeException {

        setName(name);
        setTypeTrawler(typeTrawler);
        setTransponderID(transponderID);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidNameException {
        if (name.length() < 7 || name.length() > 24) {
            throw new InvalidNameException("Name of trawler invalid: " + name);
        }
        else {
            this.name = name;
        }
    }

    public String getTypeTrawler() {
        return typeTrawler;
    }

    public void setTypeTrawler(String typeTrawler) throws InvalidTypeException {
        if (typeTrawler == "Freezer" || typeTrawler ==  "Stern" || typeTrawler ==  "Outrigger")
        {
            this.typeTrawler = typeTrawler;
        }
        else {
            throw new InvalidTypeException("Type of trawler invalid: " + typeTrawler);
        }
    }

    public String getTransponderID() {
        return transponderID;
    }

    public void setTransponderID(String transponderID) {
        if (transponderID.length() == 11) {
            this.transponderID = transponderID;
        }
        else {
            throw new NumberFormatException("TransponderID invalid: " + transponderID);
        }
    }

    public String toString() {
        return "Trawler name: " + name + "\nTransponder ID: " + transponderID +
                "\nTrawler type: " + typeTrawler;
    }
}

