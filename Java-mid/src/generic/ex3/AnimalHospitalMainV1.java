package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();
        // 개 병원에 고양이 전달 가능한 문제

        dogHospital.set(dog);
        // 고양이 타입 반환 가능한 문제
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);

    }
}
