//5) Dependency Inversion Principle
//High-level modules/classes should not depend on low-level modules/classes. Both should depend upon abstractions
class CountingMethod
{

    public void technologyUsed(String mode)
    {
        
        if(mode == "Manual"){
            ManualBallot manual=new ManualBallot();
            manual.count();
        }
        else if (mode == "Automatic"){
            EVM electronic=new EVM();
          electronic.count();
        }
    }
}
class ManualBallot
{
    int count(){
        return 10000;
    }
}
class EVM
{
    int count(){
        return 2*5*5;
    }
}
//namimg obects, naming conventions,if else block objects,calling super and sub from main
