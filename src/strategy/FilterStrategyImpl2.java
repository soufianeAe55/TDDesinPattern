package strategy;

public class FilterStrategyImpl2 implements FilterStrategy {
    @Override
    public int[] filter(int[] data) {
        System.out.println("the second implementation");
        return new int[0];
    }
}
