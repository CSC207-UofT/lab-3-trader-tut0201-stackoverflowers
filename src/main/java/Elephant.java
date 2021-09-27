public class Elephant implements Tradable, Domesticatable, Drivable {

    private int maxSpeed;

    public Elephant() {
        this.maxSpeed = 2;
    }

    @Override
    public String sound() {
        return "OOOOH!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 12;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}


