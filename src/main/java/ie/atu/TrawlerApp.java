package ie.atu;

import com.sun.jdi.InvalidTypeException;
import javax.naming.InvalidNameException;

public class TrawlerApp {

    public static void main(String[] args) throws InvalidNameException, InvalidTypeException {

        Trawler trawler1 = new Trawler("bozo", "freezer", "123");
        System.out.println(trawler1.toString());

    }
}
