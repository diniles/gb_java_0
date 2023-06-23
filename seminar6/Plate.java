package seminar6;

public class Plate {
    private int food;

    public Plate() {
        this(100);
    }

    public Plate(int food) {
        if (food < 0) {
            throw new IllegalArgumentException("food must be positive");
        }
        this.food = food;
    }

    public void increaseFood(int food) {
        if (food > 0) {
            this.food += food;
        }
    }

    public boolean decreaseFood(int food) {
        if (this.food >= food) {
            this.food -= food;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "(" + food + ")";
    }
}
