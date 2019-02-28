import java.text.DecimalFormat;

public class Samurai
{
    /////////////////////////////////////////////////////
    // Instance variables
    private String name;
    private String birthPlace;
    private int armorStrength;
    private int swordDamage;
    
    /////////////////////////////////////////////////////
    // Constructors
    public Samurai()
    {
        name = "John";
        birthPlace = "North Pole";
        armorStrength = 0;
        swordDamage = 4;
    }
    
    public Samurai(String samName, String birthLoc, int armorLevel, int swordLevel)
    {
        super();
        name = samName;
        birthPlace = birthLoc;
        armorStrength = armorLevel;
        swordDamage = swordLevel;
    }

    ////////////////////////////////////////////////////
    // Getters/Setters
    public String getName() { return name; }
    public String getBirthplace() { return birthPlace; }
    public int getArmorStrength() { return armorStrength; }
    public int getSwordDamage() { return swordDamage; }
    
    public void setName(String samName) { name = samName; }
    public void setBirthplace(String birthLoc) { birthPlace = birthLoc; }
    public void setArmorStrength(int armorLevel) { armorStrength = armorLevel; }
    public void setSwordDamage(int swordLevel) { swordDamage = swordLevel; }

    /////////////////////////////////////////////////////
    // Other methods
    public String toString()
    {
        String str = "";
        str += "Samurai " + name + " (" + getIdString() + ")";
        str += " from " + birthPlace;
        str += " has armor strength of " + armorStrength;
        str += " and sword strength of " + swordDamage;
        
        return str;
    }
    
    /////////////////////////////////////////////////////
    // Overridden methods
    public String getIdString()
    {
        return "0000";
    }

    
    /////////////////////////////////////////////////////
    // Implemented methods
    public String attack1(Samurai myPoorTarget)
    {
        String s = "Crouching Tiger Hidden Dragon Drop Kick";
        // 12 damage
        myPoorTarget.armorStrength -= (12 * swordDamage);
        return s;
    }

    public String attack2(Samurai myPoorTarget)
    {
        String s = "On The Spot Ultimate Slap Slap";
        // 2 damage
        myPoorTarget.armorStrength -= (2 * swordDamage);
        return s;
    }

    public String defend1(Samurai attacker)
    {
        String s = "Classic Crouch & Evade";
        // 10 damage avoided
        armorStrength += 10;
        return s;
    }

    public String defend2(Samurai attacker)
    {
        String s = "Armadillo Block";
        // 8 damage avoided
        armorStrength += 8;
        return s;
    }
}
