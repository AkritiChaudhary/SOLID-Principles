/* 4) Interface Segregation Principle
Do not force any client to implement an interface which is irrelevant to them */
//code Violating this rule
interface PollingData
{
    public String centre() ;
    public String nearbyConstituency();
    public int noOfVolunteers();
    public String hometown();
    public String party();
    public boolean criminalRecord();
    
}

class VoterDetails implements PollingData
{
        public String centre()
        {
          return "ABCSchool";
        }
        public String hometown()
        {
          return "Bareily";
        }
        public String nearbyConstituency()
        {
          return "mahim";
        }
        public int noOfVolunteers()
        {
          return 0;
        }
        public String party()
        {
          return "NA";
        }
        public boolean criminalRecord()
        {
          return false;
        }
        
        
}
