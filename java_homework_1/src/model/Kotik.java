package model;

public class Kotik {
    private int prettiness;
    private int weight; 
    private String name;
    private String meow;
    private int satiety = 10;
    private int temp_satiety;
    private String food_name;
    static int classObjects = 0;

    public Kotik(int prettiness, int weight, String name, String meow) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
        classObjects++;
    }

    public Kotik() {
        classObjects++;
    }

    public static void countCats() {
        System.out.println("Популяция котиков равна: " + classObjects);
    }

    public void setPrettines(int prettiness) {
        this.prettiness = prettiness;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public void setTempSatiety(int temp_satiety) {
        this.temp_satiety = temp_satiety;
    }

    public void setFoodName(String food_name) {
        this.food_name = food_name;
    }

    public int getPrettines() {
        return this.prettiness;
    }

    public int getWeight() {
        return this.weight;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getMeow() {
        return this.meow;
    }
    
    public int getSatiety() {
        return this.satiety;
    }

    public int getTempSatiety () {
        return this.temp_satiety;
    }

    public String getFoodname () {
        return this.food_name;
    }

    public boolean play() {
        if (satiety <= 0) {
            System.out.println(this.name + " голоден");
            return false;
        } else {
            System.out.println(this.name + " Kotik играет");
            this.satiety -= Math.random() * 5 + 1;
            return true;
        }
    }   

    public boolean sleep() {
        if (satiety <= 0) {
            System.out.println(this.name + " Kotik голоден");
            return false;
        } else {
            System.out.println(this.name + " Kotik спит");
            this.satiety -= Math.random() * 5 + 1;
            return true;
        }
    }

    public boolean chaseMouse() {
        if (satiety <= 0) {
            System.out.println(this.name + " Kotik голоден");
            return false;
        } else {
            System.out.println(this.name + " играет с мышкой");
            this.satiety -= Math.random() * 5 + 1;
            return true;
        }
    }

    public boolean walk() {
        if (satiety <= 0) {
            System.out.println(" Kotik голоден");
            return false;
        } else {
            System.out.println(this.name + " гуляет");
            this.satiety -= Math.random() * 5 + 1;
            return true;
        }
    }

    public void eat(int num_satiety) {
        this.satiety += num_satiety;
        System.out.println("Котик поел");
    }

    public void eat(int num_satiety, String food_name) {
        this.satiety += num_satiety;
        System.out.println(food_name);
    }

    public void eat() {
        eat(temp_satiety, food_name);
    }

    public void liveAnotherDay() {
        int hour = 0;
        while ( hour < 24) {
            hour++;
            double random_num = Math.random() * 4;
            int num_ops = (int) random_num;
            if (this.satiety <= 0) {
                num_ops = 10;
            }
            switch (num_ops) {
                case 0:
                    play();
                    break;
                case 1:
                    sleep();
                    break;
                case 2:
                    chaseMouse();
                    break;
                case 3:
                    walk();
                    break;
                case 10:
                    eat(18);
                    break;
                default:
                    System.out.println("Error switch");
                    break;
            }
        }
    }
}
