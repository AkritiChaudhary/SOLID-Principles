//Code which Violates 2) Open/Close Principle
//software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification

class BJP
{
    public char nameOfCandidate;
    public int age;
    public char date;
}

class Congress
{
    public char nameOfCandidate;
    public int age;
    public char date;
}

class TotalInformation
{
    public void BJPDetails(BJP b)
    {
        System.out.println("BJP:"+b.nameOfCandidate+" "+b.age );
    }
    public void CongressDetails(Congress c)
    {
        System.out.println("Congress:"+c.nameOfCandidate+" "+c.age );
    }
}

