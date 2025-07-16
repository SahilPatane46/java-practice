public abstract class Ex1{
    int i;
    public Ex1()
    {

    }
    public Ex1(int i)
    {
        this.i=i;
    }
    public static void main(String [] args)
    {
        System.out.println("Start of main method...");
       // Ex1 ex = new Ex(); //CTE (We cannot instantiate abstract class)
      //REason : There will no dynamic binding
    }
    public abstract void test();
}