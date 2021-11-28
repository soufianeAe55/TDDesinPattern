import strategy.CompresseTemplate;
import strategy.FilterStrategy;

public class Framework extends CompresseTemplate {
    private FilterStrategy fs;

    public void filter(int [] data){
            fs.filter(data);
    }

    public void compresser(int [] data){
       super.compresser(data);
    }

    public void appliquerFilter(String name, int [] data) {

        try {
            Class fil=Class.forName("strategy."+name);
            FilterStrategy temp=(FilterStrategy)fil.newInstance();
            this.fs = temp;
            filter(data);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void op1() {
        System.out.println("operation 1");
    }

    @Override
    public void op2() {
        System.out.println("operation 2");
    }
}
