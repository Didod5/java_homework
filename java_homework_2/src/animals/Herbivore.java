package animals;

import food.Food;
import food.Grass;

public class Herbivore extends Animal {
    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println(this.getClass().getSimpleName() + " питается.");
        } else {
            System.out.println(this.getClass().getSimpleName() + " не будет есть это!");
        }
    }
}
