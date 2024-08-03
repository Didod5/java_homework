package animals;

public class Duck extends Herbivore implements Fly, Run, Swim, Voice{

    @Override
    public String voice() {
        return "Quack";
    }

    @Override
    public void swim() {
        System.out.println("Утка плавает");
    }

    @Override
    public void run() {
        System.out.println("Утка бегает");
    }

    @Override
    public void fly() {
    System.out.println("Утка летает");
    }
}
