/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypecarproduction;

/**
 *
 * @author arash
 */
public abstract class Factory implements Car{
    private String name;
    private String desc;

    public Factory(String name, String desc) {
        this.name = name;
        this.desc= desc;
    }
    
    
    public Car getClone(Car model){
        return model.makeClone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Factory{" + "name=" + name + ", desc=" + desc + '}';
    }
    
    
}
