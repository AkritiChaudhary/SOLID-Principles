 class VotingCheck
{
    public void canVote(int age)
    {
        boolean adult=isAllowed(age);
        if (adult==true)
        {
            System.out.println("Allowed");

        }
        else{
            System.out.println(" Not Allowed");
        }
    }
    public boolean isAllowed(int age)
    {
        if (age>18)
        {
            return true;
        }
        return false;
    }  
    public int checkCenter(String center)
    {
        return 20;
    }    
}