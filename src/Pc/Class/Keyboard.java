package Pc.Class;

import Pc.Enums.IsPodsvetka;
import Pc.Enums.Typekeyboard;

public class Keyboard {

    private Typekeyboard typekeyboard;
    private  double weight;
    private IsPodsvetka isPodsvetka;

    public Keyboard(Typekeyboard typekeyboard, double weight, IsPodsvetka isPodsvetka) {
        this.typekeyboard = typekeyboard;
        this.weight = weight;
        this.isPodsvetka = isPodsvetka;
    }

    public Typekeyboard getTypekeyboard() {
        return typekeyboard;
    }

    public void setTypekeyboard(Typekeyboard typekeyboard) {
        this.typekeyboard = typekeyboard;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public IsPodsvetka getIsPodsvetka() {
        return isPodsvetka;
    }

    public void setIsPodsvetka(IsPodsvetka isPodsvetka) {
        this.isPodsvetka = isPodsvetka;
    }

    @Override
    public String toString() {
        return "type: "+typekeyboard+ ",veight: "+weight+",svet: "+isPodsvetka+"\n";
    }
}
