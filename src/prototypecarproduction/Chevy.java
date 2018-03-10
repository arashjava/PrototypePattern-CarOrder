/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypecarproduction;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arash
 */
public class Chevy extends Factory{
    private int noOfClones=0;

    public Chevy(String name, String desc) {
        super(name, desc);
    }




 
    @Override
    public Car makeClone() {
         Chevy myCar=null;
        try {
            myCar= (Chevy)super.clone();
            String carName= myCar.getName();
            noOfClones++;
            myCar.setName(carName+noOfClones);
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Chevy.class.getName()).log(Level.SEVERE, null, ex);
        }
        return myCar;   }
}
