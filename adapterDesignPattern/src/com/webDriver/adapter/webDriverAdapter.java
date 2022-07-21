
package com.webDriver.adapter;

/**This is the Adapter class
 *
 * @author APAEKSHIT
 */
public class webDriverAdapter implements webDriver{
    FirefoxDriver f ;
    
    public webDriverAdapter(FirefoxDriver fc){
       this.f = fc;
       
    }

    @Override
    public void getElements() {
            f.findElement();
    }

    @Override
    public void setElements() {
        f.clickElements();
    }
    
}
