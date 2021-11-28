package strategy;

public abstract class CompresseTemplate {

    public void compresser(int [] data){
        op1();
        System.out.println("the main algorithme");
        op2();
    }

    public abstract void op1();
    public abstract void op2();
}
