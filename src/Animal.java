public abstract class Animal {
    protected String name;
    protected String color;
    protected int age;
    private static int countAnimal=0;
    Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        countAnimal++;
    }

    abstract void Run(int run_length);

    abstract void Swim(int swim_length);

    public static int getCountAnimal() {
        return countAnimal;
    }


}

