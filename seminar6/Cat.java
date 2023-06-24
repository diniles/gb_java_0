package seminar6;

import java.util.Objects;

public class Cat {

    private String name;
    private int appetite;
    private int satiety;

    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        int realSatiety = (10 - satiety);
        int needFood = realSatiety * 10;
        int foodOnPlate = plate.getFood();
        if (needFood <= foodOnPlate) {
            plate.decreaseFood(needFood);
            satiety += needFood / 10;
        } else {
            plate.decreaseFood(foodOnPlate);
            satiety += foodOnPlate / 10;
        }
    }

    @Override
    public String toString() {
        return name + " [" + appetite + "], " + "satiety?" + satiety;
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
