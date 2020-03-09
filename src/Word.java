public class Word {
    String name;
    int counter;

    public Word() {
    }

    public Word(String name, int counter) {
        this.name = name;
        this.counter = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String toString() {
        return "Word: "+name+" - Counter: "+counter;
    }
}
