 class CanVote
{
    public void isAllowed(AgeCheck obj,int age)

    {
    
        if (obj.yesNo(age)==true)
        {
            System.out.println("This is Allowed");

        }
        else{
            System.out.println(" Not Allowed");
        }
    }
}    
class AgeCheck
{
    public boolean yesNo(int age)

    {
        if (age>18)
        {
            return true;
        }
        return false;
    }   
}

