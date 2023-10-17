public class TurnOffCommand implements Command {
    private Device device;

    public TurnOffCommand(Device device) {
        this.device = device;
    }

    @Override
    public String execute() {
        device.turnOff();
        return null;
    }
}
