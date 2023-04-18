public  abstract class Animal {
    private String name;
    private int age;

    public Animal() {
        this.name = name;
        this.age = age;

    }


    public abstract void makeNoise() ;

    public String setName(String name1) {
        this.name = name1;
        return name;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age1) {
        if (age1 > 0) {
            this.age = age1;
        } else {
            System.out.println("Возраст не может быть меньше нуля");
        }
    }


}
