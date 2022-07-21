/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pen.adapter;

/**
 *
 * @author APAEKSHIT
 */
public class penAdapter implements pen{

    pilotPen pp = new pilotPen();
    @Override
    public void write(String str) {
        pp.mark(str);
    }
      
        
    
}
