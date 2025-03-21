public class SportsCar
{
    private String agent;
    private String damage;
    private int lowPrice;
    private int highPrice;
    private int deductible;
    //Damages + Prices
    private int lowCost[] = {150,100,250,300,100,300,1000,300,2000,1000,500};
    private int highCost[] = {1500,1500,1000,4000,1500,3000,7000,5000,8000,15000,8000};
    private String damages[] = {"Dent","Scratch","Cracked Windshield","Weather Damage","Paint Chip","Bumper Damage","Fender Bender", "Rust","Airbag Deployment","Fire Damage","Electrical System Damage","Totaled"};

    //Constructor
    public SportsCar(String a, String d, int n)
    {
        agent = a;
        damage = d;
        deductible = n;
    }
    
    //Getter
    public String getAgent()
    {
        return agent;
    }
    
    public String getDamage()
    {
        return damage;
    }
    
    //Setter
    public void calculate()
    {
        for (int i = 0; i < damages.length - 1; i++)
        {
            if (damage.equals(damages[i]))
            {
                lowPrice += lowCost[i];
                highPrice += highCost[i];
            }
        }
        /*
        if (damage.equals(damages[0]))
        {
            lowPrice += lowCost[0];
            highPrice += highCost[0];
        }
        else if (damage.equals(damages[1]))
        {
            lowPrice += lowCost[1];
            highPrice += highCost[1];
        }
        else if (damage.equals(damages[2]))
        {
            lowPrice += lowCost[2];
            highPrice += highCost[2];
        }
        else if (damage.equals(damages[3]))
        {
            lowPrice += lowCost[3];
            highPrice += highCost[3];
        }
        else if (damage.equals(damages[4]))
        {
            lowPrice += lowCost[4];
            highPrice += highCost[4];
        }
        else if (damage.equals(damages[5]))
        {
            lowPrice += lowCost[5];
            highPrice += highCost[5];
        }
        else if (damage.equals(damages[6]))
        {
            lowPrice += lowCost[6];
            highPrice += highCost[6];
        }
        else if (damage.equals(damages[7]))
        {
            lowPrice += lowCost[7];
            highPrice += highCost[7];
        }
        else if (damage.equals(damages[8]))
        {
            lowPrice += lowCost[8];
            highPrice += highCost[8];
        }
        else if (damage.equals(damages[9]))
        {
            lowPrice += lowCost[9];
            highPrice += highCost[9];
        }
        else if (damage.equals(damages[10]))
        {
            lowPrice += lowCost[10];
            highPrice += highCost[10];
        }
        */
    }
    
    //toString
    public String toString()
    {
        String info = "Your agent: " + agent + "\nBefore insurance, the price to fix the " + damage + " on your sports car is between $" + lowPrice + " and $" + highPrice + ".\nPrice you pay after insurance: between $" + lowPrice + " and $" + deductible + "\n";
        if (lowPrice >= deductible)
        {
            info = "Your agent: " + agent + "\nBefore insurance, the price to fix the " + damage + " on your sports car is between $" + lowPrice + " and $" + highPrice + ".\nPrice you pay after insurance: $"  + deductible + "\n";
        }
        if (damage.equals(damages[11]))
        {
            info = "Your agent: " + agent + "\nYour sports car is unrepairable. You will get paid your ACV.\n";
        }
        return info;
            
    }
}