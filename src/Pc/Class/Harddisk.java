package Pc.Class;

import Pc.Enums.TypeDisk;

public class Harddisk {
    private TypeDisk type;
    private double value;
    private double weight;

    public Harddisk(TypeDisk type, double value, double weight) {
        this.type = type;
        this.value = value;
        this.weight = weight;
    }

    public TypeDisk getType() {
        return type;
    }

    public void setType(TypeDisk type) {
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "type: "+type+ ",value: "+value+",veight: "+weight+"\n";
    }

}
