
interface Pollcount
{
   public int count();
}
class CountingMethod
{
    public void calculateVotes(Pollcount p)
    {
       p.count();
    }
}
class ManualBallot implements Pollcount
{   
    @Override
    public int count(){
        return 10000;
    }
}
class EVM implements Pollcount
{   @Override
    public int count(){
        return 2*5*5;
    }
}
