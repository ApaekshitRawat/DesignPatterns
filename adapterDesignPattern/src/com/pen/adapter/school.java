
package com.pen.adapter;

/**
 *
 * @author APAEKSHIT
 */
public class school {
    public static void main(String[] args) {
        
        
        pen p = new penAdapter();
        assignmentWork aw = new assignmentWork();
        aw.setP(p);
        aw.writeAssignment("So , this is an assignment about studying design patterns");
    }
    
}
