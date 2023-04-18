import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Animal cat = new Cat();
        cat.setAge(6);
        cat.setName("Bacька");
        System.out.println("Его зовут " + cat.getName() + "  ему " + cat.getAge());
        cat.makeNoise();

        Animal dog = new Dog();
        dog.setAge(3);
        dog.setName("Шарик");
        System.out.println("Его зовут " + dog.getName() + "  ему " + dog.getAge());
        dog.makeNoise();

        Animal rat = new Rat();
        rat.setAge(10);
        rat.setName("Лариск");
        System.out.println("Его зовут " + rat.getName() + "  ему " + rat.getAge());
        rat.makeNoise();

    }
}