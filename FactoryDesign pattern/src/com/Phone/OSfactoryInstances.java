
package com.Phone;

/**
 * This is the class which will take the input from the clients and mask the process
 * by giving an alias to the concrete class.
 * In other words it is creating the object for our main class as per the user requirements.
 * @author APAEKSHIT
 */
public class OSfactoryInstances {
    public OS getInstance(String str){
        if(str.equals("open")) {
            return new Android();
        } else if(str.equals("secure")){
            return new IOS();
        }
        else {
            return new Windows();
        }
            
        
    }
}
