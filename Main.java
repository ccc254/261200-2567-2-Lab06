public class Main {
    public static void main(String[] args) {
      //  Animal animal = new Animal(); << error
        Cow cow = new Cow();
        Duck donald = new Duck("Donald");
        Duck daisy = new Duck("Daisy");
        Pig pig = new Pig();
        Owl owl = new Owl();
        cow.sound();
        donald.sound();
        pig.sound();
        owl.sound();
        donald.clean(cow);
        daisy.clean(donald);
        //or Duck fourseasons
        PekingDuck fourseasons = new PekingDuck("4ss");
        fourseasons.clean(daisy);
        fourseasons.fly();

        donald.clean(new Cow());
        donald.clean(new Cow());
        donald.clean(new Cow());
    }
}