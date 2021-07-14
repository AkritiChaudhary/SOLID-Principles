

interface Voter
{
    public String centre();
    public String hometown();
    
}

interface Candidate
{   
    public String nearbyConstituency();
    public int noOfVolunteers();
    public String party();
    public boolean criminalRecord();
}

class VoterDetails implements Voter
{
    public String centre()
    {
      return "ABCSchool";
    }
    public String hometown()
    {
      return "Bareily";
    }
    
        
}
class CandidateDetails implements Candidate
{
    public String nearbyConstituency()
    {
        return "Mahim";
    }
    public int noOfVolunteers()
    {
        return 20;
    }
    public String party()
    {
        return "BJP";
    }
    public boolean criminalRecord()
    {
        return false;
    }
        
}
