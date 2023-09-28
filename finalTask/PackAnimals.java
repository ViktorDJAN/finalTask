package finalTask;

import java.util.ArrayList;
import java.util.List;

public class PackAnimals {
    List<Animal>packAnimals = new ArrayList<>();

    public List<Animal> getPackAnimals() {
        return packAnimals;
    }

    public void setPackAnimals(List<Animal> packAnimals) {
        this.packAnimals = packAnimals;
    }

    public PackAnimals() {
        this.packAnimals = packAnimals;
    }

    @Override
    public String toString() {
        return "PackAnimals{" +
                 packAnimals +
                '}';
    }
}
