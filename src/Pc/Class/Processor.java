package Pc.Class;

import Pc.Enums.CoreCount;
import Pc.Enums.Gerc;
import Pc.Enums.Maker;

public class Processor {

    private Gerc gerc;
    private CoreCount coreCount;
    private Maker maker;
    private  double weight;

    public Processor(Gerc gerc, CoreCount coreCount, Maker maker, double weight) {
        this.gerc = gerc;
        this.coreCount = coreCount;
        this.maker = maker;
        this.weight = weight;
    }

    public Gerc getGerc() {
        return gerc;
    }

    public void setGerc(Gerc gerc) {
        this.gerc = gerc;
    }

    public CoreCount getCoreCount() {
        return coreCount;
    }

    public void setCoreCount(CoreCount coreCount) {
        this.coreCount = coreCount;
    }

    public Maker getMaker() {
        return maker;
    }

    public void setMaker(Maker maker) {
        this.maker = maker;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "gerc: "+gerc+ ",core count: "+coreCount+",veight: "+weight+",maker: "+maker+"\n";
    }
}
