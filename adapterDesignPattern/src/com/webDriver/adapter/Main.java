
package com.webDriver.adapter;

/**Main class
 *
 * @author APAEKSHIT
 */
public class Main {
    public static void main(String[] args) {
        ChromeDriver c = new ChromeDriver();
        c.getElements();
        c.setElements();
        
        FirefoxDriver fc = new FirefoxDriver();
        fc.findElement();
        fc.clickElements();
        
        webDriver w = new webDriverAdapter(fc);
        w.getElements();
        w.setElements();    
       
    }
}
