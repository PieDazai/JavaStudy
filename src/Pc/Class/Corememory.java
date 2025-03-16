package Pc.Class;

import Pc.Enums.Typememory;

public class Corememory {

    private Typememory typememory;
    private double value;
    private  double weight;

    public Corememory(Typememory typememory, double value, double weight) {
        this.typememory = typememory;
        this.value = value;
        this.weight = weight;
    }

    public Typememory getTypememory() {
        return typememory;
    }

    public void setTypememory(Typememory typememory) {
        this.typememory = typememory;
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
        return "type: "+typememory+ ",value: "+value+",veight: "+weight+"\n";
    }
}
