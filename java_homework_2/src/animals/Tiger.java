package animals;

public class Tiger extends Carnivorous implements Voice, Run, Swim {

    @Override
    public void swim() {
        System.out.println("Тигр плавает");
    }

    @Override
    public void run() {
        System.out.println("Тигр бежит");
    }

    @Override
    public String voice() {
        return "R-r-roagh";
    }
    
}
