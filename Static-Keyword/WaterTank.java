class WaterTank {

  // Finish the WaterTank class

  // 1. Create a static variable that takes a value for the waterlevel.
  static int waterLevel;


  // A constructor that initializes the waterlevel variable
    public WaterTank(){
      waterLevel = 100;
    }


  // 2. Create a method called useWater() that uses some water and reduces the waterlevel amount by 10 units. Make it print out the following string: "Water gushes". If there is no water then print out the following string instead: "No water. Please refill" and do not reduce the waterlevel. 
  public void useWater()
  {
    if(waterLevel != 0)
    {
      System.out.println("Water gushes");
      waterLevel = waterLevel - 10;
    }
    else
    {
      System.out.println("No water. Please refill");
    }
  }


  // 3. Create a method called refill() to refill the waterlevel to its maximum amount. Make it print out the following strings: "Watertank is being refilled" and then on the next line: "Watertank is full". 
  public void refill()
  {
    waterLevel = 100;
    System.out.println("Watertank is being refilled");
    System.out.println("Watertank is full");
  }

  // 4. Create a method to print out the waterlevel called printWaterLevel(). Use the following string: "Water level: " and then the waterlevel variable.
  public void printWaterLevel()
  {
    System.out.println("Water level: " + waterLevel);
  }

}