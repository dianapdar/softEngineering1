public interface Device {
    String turnOn();
    String turnOff();
    void adjust(String action, int value);
}
