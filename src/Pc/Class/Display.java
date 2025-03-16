package Pc.Class;

import Pc.Enums.Typedisplay;

public class Display {

    private double diagonal, weight;
    private Typedisplay typedisplay;

    public Display(double diagonal, double weight, Typedisplay typedisplay) {
        this.diagonal = diagonal;
        this.weight = weight;
        this.typedisplay = typedisplay;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Typedisplay getTypedisplay() {
        return typedisplay;
    }

    public void setTypedisplay(Typedisplay typedisplay) {
        this.typedisplay = typedisplay;
    }

    @Override
    public String toString() {
        return "type: "+typedisplay+", weight: "+weight+", diagonal: "+diagonal+"\n";
    }
}
