public class Dolphin implements Tradable, Domesticatable, Drivable{
        private int maxSpeed;

        public Dolphin() {
            this.maxSpeed = 5;
        }

        @Override
        public String sound() {
            return "Ee ee!";
        }

        @Override
        public void upgradeSpeed() {
            this.maxSpeed = this.maxSpeed + 4;
        }

        @Override
        public void downgradeSpeed() {
            this.maxSpeed = this.maxSpeed - 4;
        }

        @Override
        public int getMaxSpeed() {
            return this.maxSpeed;
        }

        @Override
        public int getPrice() {
            return 50;
        }

        @Override
        public String toString(){
            String id = super.toString();
            return id + " (Max speed: " + this.maxSpeed +")";
        }
    }

