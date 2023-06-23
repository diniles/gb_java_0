package seminar6;

import java.util.Objects;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        if (satiety) {
            return;
        }
        satiety = plate.decreaseFood(appetite);
    }

    @Override
    public String toString() {
        return name + " [" + appetite + "], " + "satiety? " + satiety;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj instanceof Cat anotherCat) {
            return name.equals(anotherCat.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
