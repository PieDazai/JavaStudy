package Pc.Class;

public class Computer {
    final String vendor = "USA";
    final String name = "PC";
    private Processor proc;
    private Corememory memory;
    private Harddisk hdd;
    private Display display;
    private Keyboard keyboard;

    public Computer(Processor proc, Corememory memory, Harddisk hdd, Display display, Keyboard keyboard) {
        this.proc = proc;
        this.memory = memory;
        this.hdd = hdd;
        this.display = display;
        this.keyboard = keyboard;
    }

    public void weightcount (){
        double ves = proc.getWeight()+ memory.getWeight()+hdd.getWeight()+
                display.getWeight()+ keyboard.getWeight();
        System.out.println("All weight: " + ves);
    }

    @Override
    public String toString() {
        return "inform: "+proc+memory+hdd+display+keyboard;
    }
}
