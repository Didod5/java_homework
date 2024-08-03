package animals;

public class Rabbit extends Herbivore implements Voice, Run {

    @Override
    public void run() {
        System.out.println("Кролик бегает");
    }

    @Override
    public String voice() {
        return "Squeak";
    }
}
