
package com.phone;

/**Builder pattern aims to separate the construction of a complex object from
 * its representation so that the same construction process can create different
 * representations. 
 * It is used to construct a complex object step by step and the final step will 
 * return the object.
 * The parameters to the constructor are reduced and are provided in highly 
 * readable method calls.
 * Builder design pattern also helps in minimizing the number of parameters in the
 * constructor and thus there is no need to pass in null for optional parameters to the constructor.
 * @author APAEKSHIT
 */
public class phoneBuilder {
     private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

    public phoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public phoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public phoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public phoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public phoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }
    public phone getPhone(){
        return new phone(os, ram, processor, screenSize, battery);
    }
}
