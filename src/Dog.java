public class Dog extends Animal{
    private final int MAX_SWIM_LENGTH= 10;
    private final int MAX_RUN_LENGTH = 500;
    private static int countDog =0;
    Dog(String name, String color, int age) {
        super(name, color,age);
        countDog++;
    }
    @Override
    void Swim(int length){
        if (length<MAX_SWIM_LENGTH) {
            System.out.println(name + " плывет " + length + " метров");
        }
        else {
            System.out.println(name + " не может  плыть " + length + " метров");
        }

    }
    @Override
    void Run(int lenght) {
        if (lenght<MAX_RUN_LENGTH) {
            System.out.println(name + " бежит " + lenght + " метров");
        }
        else {
            System.out.println(name + " не может  бежать " + lenght + " метров");
        }
    }

    public static int getCountDog() {
        return countDog;
    }
}
