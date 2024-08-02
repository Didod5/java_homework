import model.Kotik;

public class application {
    public static void main(String[] args){
        Kotik Ku = new Kotik(7, 3, "Ku", "maw");
        
        Kotik Ti = new Kotik();
        Ti.setName("Ti");
        Ti.setMeow("miu");
        Ti.setPrettines(7);
        Ti.setWeight(2);

        String ti_meow = Ti.getMeow();
        String ku_meow = Ku.getMeow();

        if(ti_meow.equals(ku_meow)){
            System.out.println(String.format("%s и %s мяукуют одинаково", Ti.getName(), Ku.getName()));
        } else {
            System.out.println(String.format("%s и %s мяукуют НЕ одинаково", Ti.getName(), Ku.getName()));
        }

        Ku.liveAnotherDay();    
        Kotik.countCats();
    }
}
