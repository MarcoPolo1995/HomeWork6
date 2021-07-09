package HomeWork6;

public class MainClass {
    public static void main(String[] args) {
        Animals animal = new Animals("Cats");
        Cat cat = new Cat("Barsik", 200, false);
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();

        Animals danimal = new Animals("Dogs");
        Dog dog = new Dog("Sharik", 500, 10);
        danimal.animalInfo();
        dog.animalInfo();
        dog.dogInfo();

    }

    }





