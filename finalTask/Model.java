package finalTask;

import java.util.Scanner;

public class Model {
    Counter counter = new Counter();
    Pets pets = new Pets();
    Cat cat1 = new Cat("1", "2");
    Dog dog1 = new Dog("", "");
    Hamster hamster1 = new Hamster("", "");
    Horse horse1 = new Horse("", "");
    Donkey donkey1 = new Donkey("", "");
    Camel camel1 = new Camel("", "");
    PackAnimals packAnimals = new PackAnimals();

    public void createAnimal() {
        counter.getCounter();
        pets.getPets().add(cat1);
        System.out.println("Do you want to add a new animal?");
        System.out.println("Enter - 1 if you want to create a cat");
        System.out.println("Enter - 2 if you want to create a dog");
        System.out.println("Enter - 3 if you want to create a hamster");
        System.out.println("Enter - 4 if you want to create a horse");
        System.out.println("Enter - 5 if you want to create a donkey");
        System.out.println("Enter - 6 if you want to create a camel");
        System.out.println("Enter - 7 if you want to see the lists of animals");
        System.out.println("Enter - 8 if you want to see actions of every animal");
        System.out.println("Enter - 00 if you want to stop the program");
        Scanner scanner2 = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            int choose = scanner2.nextInt();
            switch (choose) {
                case 1:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter  a cat's name ");
                    String nameCat = scanner.next();
                    System.out.println("Enter cat's color ");
                    String color = scanner.next();
                    Cat cat = new Cat(nameCat, color);
                    pets.getPets().add(cat);
                    break;
                case 2:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Enter a dog's name ");
                    String nameDog = scanner1.next();
                    System.out.println("Enter dog's breed ");
                    String breed = scanner1.next();
                    Dog dog = new Dog(nameDog, breed);
                    pets.getPets().add(dog);
                    break;
                case 3:
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("Enter a hamster's name ");
                    String nameHamster = scanner3.next();
                    System.out.println("Enter nuts quantity ");
                    String nutsQuantity = scanner3.next();
                    Hamster hamster = new Hamster(nameHamster, nutsQuantity);
                    pets.getPets().add(hamster);
                    break;
                case 4:
                    Scanner scanner4 = new Scanner(System.in);
                    System.out.println("Enter horse's name ");
                    String nameHorse = scanner4.next();
                    System.out.println("Enter lifting weight ");
                    String liftweight = scanner4.next();
                    Horse horse = new Horse(nameHorse, liftweight);
                    packAnimals.getPackAnimals().add(horse);
                    break;
                case 5:
                    Scanner scanner5 = new Scanner(System.in);
                    System.out.println("Enter donkey's name ");
                    String nameDonkey = scanner5.next();
                    System.out.println("Enter size of the load ");
                    String sizeload = scanner5.next();
                    Donkey donkey = new Donkey(nameDonkey, sizeload);
                    packAnimals.getPackAnimals().add(donkey);
                    break;
                case 6:
                    Scanner scanner6 = new Scanner(System.in);
                    System.out.println("Enter camel's name ");
                    String nameCamel = scanner6.next();
                    System.out.println("Enter max temperature that the camel is able to resist ");
                    String temperature = scanner6.next();
                    Camel camel = new Camel(nameCamel, temperature);
                    packAnimals.getPackAnimals().add(camel);
                    break;
                case 7:
                    System.out.println(pets.toString());
                    System.out.println(packAnimals.toString());
                    break;
                case 8:
                    System.out.println("Choose an animal , whose actions you would like to see");
                    System.out.println("Press 1  if you want to consider a cat");
                    System.out.println("Press 2  if you want to consider a dog");
                    System.out.println("Press 3  if you want to consider a hamster");
                    System.out.println("Press 4  if you want to consider a horse");
                    System.out.println("Press 5  if you want to consider a donkey");
                    System.out.println("Press 6  if you want to consider a camel");
                    System.out.println("Press 0  if you want to quit out");
                    boolean flag1 = true;
                    while (flag1) {
                        Scanner sc = new Scanner(System.in);
                        int choose1 = sc.nextInt();
                        switch (choose1) {
                            case 1:
                                cat1.actionsCat();
                                break;
                            case 2:
                                dog1.actionsDog();
                                break;
                            case 3:
                                hamster1.actions();
                                break;
                            case 4:
                                horse1.actions();
                                break;
                            case 5:
                                donkey1.actions();
                                break;
                            case 6:
                                camel1.actions();
                                break;
                            case 0:
                                flag1 = false;
                                break;
                        }
                    }
                case 00:
                    flag = false;
                    break;
            }
        }
    }
}
