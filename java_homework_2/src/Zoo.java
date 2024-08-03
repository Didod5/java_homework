import animals.Animal;
import animals.Duck;
import animals.Fish;
import animals.Hawk;
import animals.Rabbit;
import animals.Sheep;
import animals.Swim;
import animals.Tiger;
import food.Grass;
import food.Meat;

public class Zoo {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        Duck duck = new Duck();
        Rabbit rabbit = new Rabbit();
        Sheep sheep = new Sheep();
        Fish fish = new Fish();
        Hawk hawk = new Hawk();
        Tiger tiger = new Tiger();
        Grass grass = new Grass();
        Meat meat = new Meat();
        Worker worker = new Worker();

        // Кормим животных
        worker.feed(duck, grass);
        worker.feed(sheep, grass);
        worker.feed(rabbit, grass);
        worker.feed(hawk, meat);
        worker.feed(hawk, grass);
        worker.feed(tiger, meat);
        worker.feed(fish, meat);

        // Животные подают голос
        worker.getVoice(duck);
        worker.getVoice(rabbit);
        worker.getVoice(tiger);
        worker.getVoice(sheep);

        // Создаем пруд
        Animal[] pond = {fish, duck, tiger};
        for (Animal animal : pond) {
            if (animal instanceof Swim) {
                ((Swim) animal).swim();
            }
        }
    }
}
