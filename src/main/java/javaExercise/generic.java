package javaExercise;

import java.util.*;

public class generic {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("王曉明",20));
        students.add(new Student("王大同",21));
        students.add(new Student("張君雅",22));
        //這裡向上轉型，讓iterator擁有了students類型的迭代器
        Iterator<Student> iterator=students.iterator();
        while (iterator.hasNext()){
            //因為這裡使用了泛型是student類型，就無需再向下轉換，就可以給Student類型的變量student值，並輸出name
            Student student =iterator.next();
           System.out.println(student);
        }

        HashMap<String,Student> students2 = new HashMap<String,Student>();
        students2.put("王曉明",new Student("王曉明",20));
        students2.put("王大同",new Student("王大同",21));
        students2.put("張君雅",new Student("張君雅",22));
        Set<Map.Entry<String, Student>> entries = students2.entrySet();
        Iterator<Map.Entry<String, Student>> iterator1 = entries.iterator();
        while (iterator1.hasNext()){
            Map.Entry<String, Student> next = iterator1.next();

            System.out.println(next.getKey()+next.getValue());
        }

    }
}

class Student{
    String name;
    Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}