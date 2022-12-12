package ie.atu;

import com.sun.jdi.InvalidTypeException;
import javax.naming.InvalidNameException;

public class TrawlerApp {

    public static void main(String[] args) throws InvalidNameException, InvalidTypeException {

        //if used scanner could have while loop and not print try/catch several times like needed with manual inputs
        try {
            Trawler trawler1 = new Trawler("Fair Maiden", "Freezer", "10121415161");
            System.out.println(trawler1.toString());
        } catch (InvalidNameException e) {
            System.out.println("Name of trawler invalid. Min 7 - Max 24 characters.");

        } catch (InvalidTypeException e1) {
            System.out.println("Type of trawler invalid. Try Freezer, Outrigger, Stern");

        } catch (NumberFormatException e2) {
            System.out.println("TransponderID invalid. 11 digits required.");
        }

        //does the same as the first, except handles a transponderID error
        try {
            Trawler trawler2 = new Trawler("Fair Maiden", "Stern", "123");
            System.out.println(trawler2.toString());
        } catch (InvalidNameException e) {
            System.out.println("Name of trawler invalid. Min 7 - Max 24 characters.\n");

        } catch (InvalidTypeException e1) {
            System.out.println("Type of trawler invalid. Try Freezer, Outrigger, Stern\n");

        } catch (NumberFormatException e2) {
            System.out.println("TransponderID invalid. 11 digits required.\n");
        }

        //handles a type error with trawlertype
        try {
            Trawler trawler3 = new Trawler("Fair Maiden", "boat", "12345678910");
            System.out.println(trawler3.toString());
        } catch (InvalidNameException e) {
            System.out.println("Name of trawler invalid. Min 7 - Max 24 characters.");

        } catch (InvalidTypeException e1) {
            System.out.println("Type of trawler invalid. Try Freezer, Outrigger, Stern");

        } catch (NumberFormatException e2) {
            System.out.println("TransponderID invalid. 11 digits required.");
        }

    }
}
