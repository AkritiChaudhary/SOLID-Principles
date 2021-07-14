
abstract class Election
{
    public char nameOfCandidate;
    public int age;
    public char date;
    abstract void showDetails();
}
class BJP extends Election
{
    public char nameOfCandidate;
    public int age;
    public char date;
    public void showDetails()
    {
        System.out.println("BJP:"+this.nameOfCandidate+" "+this.age );
    }
    
}