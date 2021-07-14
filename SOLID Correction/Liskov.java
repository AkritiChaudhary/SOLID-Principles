
class RegionalParty
{
    
    public int experience()
    {
        return 2;
    }
    public String chairperson()
    {
        return "Head";
    
    }
    public int noOfMembers()
    {
        return 20;
    }
    public String moto()
    {
        return "New Gen Leaders";
    }
    


}
class NationalParty extends RegionalParty
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



