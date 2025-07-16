public class Engine{
    String HP;
    double U;
    public void ignition(){
        System.out.println("Engine Started");
    }
    Engine(String HP, Double U){
        this.HP=HP;
        this.U=U;
    }
}