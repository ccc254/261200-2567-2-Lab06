public class Duck extends Animal implements Flyable{
    String name;
    public  Duck(String name){
        this.name = name;
    }
    //
    @Override
    void sound() {
        System.out.println("quack quack");
    }

    @Override
    public void fly() {
        System.out.println("prbbb prbbb");
    }

    @Override
    public void glide() {
        System.out.println("hi-yahh");

    }

    void clean(Animal animal){
        System.out.println(this + "is cleaning" + animal);
    }
    //
    public String toString(){
        return "เป็ด:"+ this.name;
    }
}
