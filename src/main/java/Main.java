import Animal.Animal;
import Animal.AnimalFactory;
import Animal.AnimalInterface;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        AnimalFactory animal = Animal::new;
        ArrayList<AnimalInterface> animals = new ArrayList<>();
        animals.add(animal.create("Dog","woof"));
        animals.add(animal.create("Cat","meow"));
        animals.add(animal.create("Goose","GAAGA!"));

        System.out.print("Enter name of animal: ");
        String animalName = in.next();
        animals.stream().filter(x -> x.getName().toLowerCase()
                .equals(animalName.toLowerCase()))
                .map(AnimalInterface::getVoice)
                .forEach(System.out::println);
    }
}
