package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 100);

        AnimalMethod.<Dog>checkup(dog);
        AnimalMethod.checkup(cat); //타입 매개변수 추론

        Dog targerDog = new Dog("큰 멍멍이", 200);
        Dog bigger = AnimalMethod.bigger(dog, targerDog);
        System.out.println("bigger = " + bigger);
    }
}
