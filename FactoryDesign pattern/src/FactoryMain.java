
/*
Factory Design Pattern : define an interface or abstract class for creating an 
object but let the subclasses decide which class to instantiate.
*/

import com.Phone.*;

/**
 * So this is the main method which will be running 
 * @author APAEKSHIT
 */
public class FactoryMain {
    public static void main(String[] args) {
        OSfactoryInstances obj = new OSfactoryInstances();
        OS o = obj.getInstance("open");
        o.spec();
    }
    
}
