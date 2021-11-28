package strategy;

public class FilterStrategyImpl implements FilterStrategy {
    @Override
    public int[] filter(int[] data) {
        System.out.println("the first implementation");
        return new int[0];
    }
}
