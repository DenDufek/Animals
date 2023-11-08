enum Animals {
    DOG(5), CAT(3), ELEPHANT(10), LION(8);

    private int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name() + ", вік: " + age;
    }
}

public class Main {
    public static void main(String[] args) {
        Animals myDog = Animals.DOG;
        Animals myCat = Animals.CAT;

        System.out.println("Моя улюблена тварина: " + myDog);
        System.out.println("Інша тварина: " + myCat);
    }
}
