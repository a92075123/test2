package javaExercise;

public class polymorphic {
    public static void main(String[] args) {

//          Animal pig = new pig("小豬");
//          Master david = new Master("wei");
//          Food food =new Food("米飯");
//          david.feed(pig,food);
//          food.setFood("蘋果");
//          david.feed(pig,food);
            //pig2引用了Animel跟Pig兩個類別，所以兩邊的方法都可以使用
            //假設兩個類別都有一樣的方法，先以子類別為優先(例如:先看Pig有沒有這個方法，沒有的話向父類別找)
            //如果屬性或方法被設置private則無法被使用
            Animal pig = new Pig("小豬");

            Pig pig2 = (Pig) pig;

              pig2.eat();
              pig2.drink();
            System.out.println(pig2);
            System.out.println(pig);

    }


}
