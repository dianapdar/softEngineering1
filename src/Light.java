public class Light implements Device{

    @Override
    public String turnOn(){
        return "Light is ON!";
    }
    @Override
    public String turnOff(){
        return "Light is OFF!";
    }
    @Override
    public void adjust(String action, int value){
        if(action.equals(("brightness"))){
            System.out.println("Brightness adjusted at " + value + "!");
        }
        else return;
    }
}
