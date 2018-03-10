/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypecarproduction;

import java.util.Scanner;

/**
 *
 * @author arash
 */
public class PrototypeCarProduction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Factory chevy= new Chevy("Camaro", "Works with special engins");
        for (int i=0; i<4; i++){
            chevy.getClone(chevy);
            System.out.println(i+1+" = " + chevy.toString());
        }
        System.out.println("");
        Factory toyota= new Chevy("Camry", "Four door");
        for (int i=0; i<6; i++){
            toyota.getClone(chevy);
            System.out.println(i+1+" = " + toyota.toString());
        }
        
        
        
    }
    
    
}
