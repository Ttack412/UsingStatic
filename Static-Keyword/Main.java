class Main {
  public static void main(String[] args) {
    
    // This is the example code that will be used in the test. Complete the WaterTank class. 
    
    WaterTank waterTank = new WaterTank();
    Apartment twothreefour = new Apartment(234, waterTank);

    Apartment onetwothree = new Apartment(123, waterTank);

    twothreefour.useWater();

    onetwothree.useWater();

    waterTank.refill();
    waterTank.printWaterLevel();

    twothreefour.useWater();

  }
}