package javaExercise;

public class Animal {
    public  String name ;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void eat(){
        System.out.println("吃東西");
    }
    public void drink(){
        System.out.println("喝水");
    }
}
