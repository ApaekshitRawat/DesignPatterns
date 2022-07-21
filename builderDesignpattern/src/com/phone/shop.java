
package com.phone;

/** Main method to use the builder functions to set and get the required.
 * @author APAEKSHIT
 */
public class shop {
    public static void main(String[] args) {
        phone p =  new phoneBuilder().setBattery(3000).setProcessor("Snapgragon").setRam(8).setOs("android").getPhone();
        System.out.println(p);
    }
}
