package animals;

import food.Food;
import food.Meat;

public class Carnivorous extends Animal {
    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println(this.getClass().getSimpleName() + " питается.");
        } else {
            System.out.println(this.getClass().getSimpleName() + " не будет есть это!");
        }
    }
}
