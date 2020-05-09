public class BackgroundCalculator
{
    private int solution;
    private int x;
    private int y;

    public int calculator(int x,int y)
    {
        this.x=x;
        this.y=y;
        return 0;
    }

    public int add()
    {
       return x + y;
    }
    public int subtract()
    {
       return x - y;
    }
    public int multiply()
    {    
       return x * y;
    }
    public int divide()
    {
       solution = x / y;
       return solution;
    }

}