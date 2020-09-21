package ETC;

public class Sol5 {
    abstract class Car{
        protected boolean isSedan;
        protected String seats;

        public Car(boolean isSedan, String seats){
            this.isSedan = isSedan;
            this.seats = seats;
        }

        public boolean getIsSedan(){
            return this.isSedan;
        }
        public String getSeats() {
            return this.seats;
        }
        abstract public String getMileage();
        public void printCar(String name){
            String str = "차 이름은"+name+"이고 "+getIsSedan()+"세단이 이기도 하고 아니기도 하며" +
                    "좌석은 "+getSeats()+" 그리고 마일리지는 "+getMileage();
            System.out.println(str);
        }
    }

    class KIA extends Car{
        public String mileage;

        public KIA(String mileage){
            super();
            this.mileage = mileage;
        }

        public KIA(boolean isSedan, String seats, String mileage) {
            super(isSedan, seats);
            this.mileage = mileage;
        }

        @Override
        public String getMileage(){
            return this.mileage;
        }
    }

    public static void main(String[] args) {
        Car kia = new KIA("22");
    }
}
