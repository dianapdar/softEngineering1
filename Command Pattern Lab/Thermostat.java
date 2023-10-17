public class Thermostat implements Device{

    @Override
    public String turnOn(){
        return "Thermostat is ON!";
    }
    @Override
    public String turnOff(){
        return "Thermostat is OFF!";
    }
    @Override
    public void adjust(String action, int value){
        if(action.equals(("temperature"))){
            System.out.println("Temperature is adjusted at " + value + "!");
        }
}
}
