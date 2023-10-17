public class MusicPlayer implements Device{
    @Override
    public String turnOn(){
        return "Music Player is ON!";
    }
    @Override
    public String turnOff(){
        return "Music Player is OFF!";
    }
    @Override
    public void adjust(String action, int value){
        if(action.equals(("volume"))){
            System.out.println("Volume is adjusted at " + value + "!");
        }
}
}
