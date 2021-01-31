public class Main {
    public static void main(String[] args) {
        Dog Barbos = new Dog("Барбос", "Черный", 5);
        Dog Tuz = new Dog("Тузка","Бежевый", 3);
        Cat Fluff = new Cat ("Пушок", "Белый", 8);
        Cat Scherlock = new Cat("Шерлок", "Серый", 4);


        Barbos.Run(100);
        Tuz.Run(1000);
        Fluff.Run(50);
        Scherlock.Run(400);
        Barbos.Swim(20);
        Tuz.Swim(5);
        Fluff.Swim(5);
        Scherlock.Swim(3);

        System.out.println("Всего кошек:" + Cat.getCountCat());
        System.out.println("Всего собак: " + Dog.getCountDog());
        System.out.println("Всего животных: " + Animal.getCountAnimal());
    }


}
