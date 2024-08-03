package animals;

public class Hawk extends Carnivorous implements Voice, Fly {

    @Override
    public void fly() {
        System.out.println("Ястреб летает");
    }

    @Override
    public String voice() {
        return "Screech";
    }
}