public class Runner
{
    public static void main(String[] args)
    {
       //welcome statement and lists your cars/damages
       System.out.println("Welcome to Jake's Khakilator!\n\nPlease select your car type:\nPickup Truck\nSedan\nSports Car\nSUV\nMinivan\nLuxury Car\nElectric Car\nCrossover\n\nPlease select your damage:\nDent\nScratch\nCracked Windshield\nWeather Damage\nPaint Chip\nBumper Damage\nFender Bender\nRust\nAirbag Deployment\nFire Damage\nElectrical System Damage\nTotaled\n\nPlease enter your deductable:\n");
       
       
       //WHEN RUNNING, INSTANTIATE ex: 
     
       
       Sedan aSedan = new Sedan("Jake","Paint Chip", 250);
       aSedan.calculate();
       System.out.println(aSedan);
       
       
       Sedan bSedan = new Sedan("Jake","Totaled",300);
       bSedan.calculate();
       System.out.println(bSedan);
       
      
       
        /*    //crossover test
       Crossover aCrossover = new Crossover("Jake","Rust",500);
       aCrossover.calculate();
       System.out.println(aCrossover);
       
       //electric car test
       ElectricCar aEC = new ElectricCar("Jake","Rust",500);
       aEC.calculate();
       System.out.println(aEC);
       
       //luxury car test
       LuxuryCar aLC = new LuxuryCar("Jake","Rust",500);
       aLC.calculate();
       System.out.println(aLC);
       
       //minivan test
       Minivan aMinivan = new Minivan("Jake","Rust",500);
       aMinivan.calculate();
       System.out.println(aMinivan);
 
       //pickup truck test
       PickupTruck aTruck = new PickupTruck("Jake","Rust",500);
       aTruck.calculate();
       System.out.println(aTruck);
       
       //sedan test
       Sedan aSedan = new Sedan("Jake","Rust",500);
       aSedan.calculate();
       System.out.println(aSedan);
       
       //sports car test
       SportsCar aSC = new SportsCar("Jake","Rust",500);
       aSC.calculate();
       System.out.println(aSC);
       
       //SUV test
       SUV aSUV = new SUV("Jake","Rust",500);
       aSUV.calculate();
       System.out.println(aSUV);
       
       //totaled test
       PickupTruck tTruck = new PickupTruck("Jake","Totaled",500);
       tTruck.calculate();
       System.out.println(tTruck);
       */
    }
}