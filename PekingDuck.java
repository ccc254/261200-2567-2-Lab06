public class PekingDuck extends Duck {
    public PekingDuck(String name) {
        super(name);
    }

    @Override
    void clean(Animal animal) {
        System.out.println("I DIE");
    }
}
