public class ArithmeticCalculator {

    private int x1, x2;

    public ArithmeticCalculator(int x1, int x2) {
        this.x2 = x2;
        this.x1 = x1;
    }

    public void calculate(Operations type){

    switch (type){
    case ADD -> System.out.println(x1+x2);
    case MULTIPLY -> System.out.println(x1*x2);
    case SUBTRACT -> System.out.println(x1-x2);
        default -> System.out.println("NOT");
    }

    }
}
