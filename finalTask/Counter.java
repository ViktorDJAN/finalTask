package finalTask;

public class Counter {
    int count = 0;

    public void getCounter() {
        System.out.println(count++);
    }

    public void setCount(int count) {
        this.count = count;
    }
}
