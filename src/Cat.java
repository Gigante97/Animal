public class Cat extends Animal{
    private final int MAX_RUN_LENGTH = 200;
    private static int countCat =0;
    Cat(String name, String color, int age) {
        super(name,color,age);
        countCat++;
    }

   @Override
    void Swim(int length) {
        System.out.println(name + " не умеет плавать");
    }

    @Override
    void Run(int length) {
        if (length<MAX_RUN_LENGTH) {
            System.out.println(name + " бежит " + length + " метров");
        }
        else {
            System.out.println(name + " не может бежать " + length + " метров");
        }

    }

    public static int getCountCat (){
        return countCat;
    }
}
