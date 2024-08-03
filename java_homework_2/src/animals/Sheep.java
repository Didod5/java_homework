package animals;

public class Sheep extends Herbivore implements Voice, Run {

    @Override
    public void run() {
        System.out.println("Овечка бегает");
    }

    @Override
    public String voice() {
        return "be-e-e";
    }
}
