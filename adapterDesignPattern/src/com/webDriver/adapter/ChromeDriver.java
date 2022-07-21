
package com.webDriver.adapter;

/**This is the concrete class for the chrome where the interface method is implemented
 *
 * @author APAEKSHIT
 */
public class ChromeDriver implements webDriver{

    @Override
    public void getElements() {
        System.out.println("Get elements from Chrome driver");
    }

    @Override
    public void setElements() {
        System.out.println("Set elements from Chrome driver");
    }
    
}
