package Lesson7;

public class Plate {
    private int footCount;
    public Plate(int footCount) {
        this.footCount = footCount;
    }
    public void printInfo() {
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Plate{" +
                "footCount=" + footCount +
                '}';
    }
    public int getFootCount() {
        return footCount;
    }
    public void decreaseFood(int a) {
        footCount -= a;
    }
    public void increaseFood(int a) {
        footCount += a;
    }
}
