package javaExercise;

public class Master {
    private  String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void feed(Animal animal,Food food){
        System.out.println("主人餵一隻"+animal.getName()+"吃"+food.getFood());
    }
}
