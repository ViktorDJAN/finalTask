package finalTask;

import java.util.ArrayList;
import java.util.List;

public class Pets {
    List<Animal> pets = new ArrayList<>();

    public Pets() {
        this.pets = pets;
    }

    public List<Animal> getPets() {
        return pets;
    }

    public void setPets(List<Animal> pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "Pets{"+ pets+"}";
    }
}
