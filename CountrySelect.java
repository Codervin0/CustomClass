public class CountrySelect {
   
   //instance variables
   private String name;
   private int pop;
   private double gdp;
   private boolean countryExists;
   
   //constructers
   public CountrySelect() {
      name = "Albania";
      pop = 8000;
      gdp = 128003776.00;
      countryExists = true;
   }
   public CountrySelect(String name, int pop, double gdp, boolean countryExists) {
      this.name = name;
      this.pop = pop;
      this.gdp = gdp;
      this.countryExists = countryExists;
   }
   //methods
   public void crashTheEconomy() {
      gdp = gdp / 4;
      System.out.println("one dollor from " + name + " is now worth 4 times as much as the market value! the gdp has gone down to " + gdp);
   }
   public void reinvigorateTheEconomy() {
      gdp *= 4;
   }
   public void rebrand() {
      name = "The New and Improved " + name;
      System.out.println("the world welcomes " + name);
   }
   public void enterTheUN() {
      if (countryExists == true) {
         System.out.println("the nation of " + name + " is already a well recogized country part of the UN!");
         } else { System.out.println("the UN welcomes " + name);
               }
   }
   public void sponserTourists() {
      gdp += 100000;
      pop += 100;
      System.out.println("come to " + name + " for tours of exotic locations!");
   }
}
   