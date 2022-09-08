public class TelevsionClient {

  public static void main(String[] args) {

    Television tv1 = new Television();
    tv1.setBrand("Zenith");
    tv1.setVolume(125);


    Television tv2 = new Television();
    tv2.brand = "RCA";
    tv2.volume = 18;

    tv1.turnOn();
    tv1.turnOff();
    System.out.println();
    System.out.printf("television instance created", Television.getInstanceCount());

    tv2.turnOn();
    tv2.turnOff();
    System.out.printf("television instance created", Television.getInstanceCount());

    System.out.println(tv1);
    System.out.println(tv1);
    System.out.println(tv2);

    Television tv3 = new Television(brand "LG" , volume 55);
    System.out.println(tv3);
    System.out.printf("television instance created", Television.getInstanceCount());
  }
}
