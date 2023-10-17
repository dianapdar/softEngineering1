public class AdjustCommand implements Command{
    private Device device;
    private String action;
    private int value;

    public AdjustCommand(Device device, String action, int value) {
        this.device = device;
        this.action = action;
        this.value = value;
    }
    public Device getDevice(){
        return device;
    }
    public void setDevice(Device device){
        this.device =device;
    }
    public String getAction(){
        return action;
    }
    public void setAction(String action){
        this.action =action;
    }
    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value = value;
    }

    @Override
    public String execute() {
       device.adjust(action, value);
        return "Exit";
    }
}
