public class Dog implements Domesticatable, Tradable{
    private int maxSpeed;

    @Override
    public String sound() {
        return "Meow";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
