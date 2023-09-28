package finalTask;

public abstract class Animal {
    private String name;
    public Animal(String name1) {
        name = name1;
    }
    public abstract String makeVoice();

    @Override
    public String toString() {
        return "name='" + name + '\'';
    }
}
