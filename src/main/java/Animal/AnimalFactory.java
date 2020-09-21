package Animal;

public interface AnimalFactory <A extends Animal>{
    A create(String name, String voice);
}
