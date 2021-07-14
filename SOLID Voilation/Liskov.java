/*Rule violating code
3)Liskov’s Substitution Principle
        Derived or child classes must be substitutable for their base or parent classes */
class NationalParty
{
    public int experience()
    {
        return 25;
    }
    public String chairperson()
    {
        return "Head of the party";
    
    }
    public int noOfMembers()
    {
        return 100;
    }
    public String moto()
    {
        return "Inspiring is the goal";
    }
    public int powerYears()
    {
        return 10;
    }


}
class RegionalParty extends NationalParty
{
    public int noOfMembers()
    {
        throw new AssertionError("Regional cannot act as National");
    }
}