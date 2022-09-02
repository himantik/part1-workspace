public class TelevsionsClient {

  public static void main(String[] args) {

    Televisions tv1 = new Televisions();
    tv1.brand = "Zenith";
    tv1.volume = 25;


    Televisions tv2 = new Televisions();
    tv2.brand = "RCA";
    tv2.volume = 18;

    tv1.turnOn();
    tv1.turnOff();


    tv2.turnOn();
    tv2.turnOff();
  }
}
