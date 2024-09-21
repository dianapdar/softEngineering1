public class Main {
    public static void main(String[] args) {
        Device light = new Light();
        Device thermostat = new Thermostat();
        Device musicPlayer = new MusicPlayer();

        Command turnOnLight = new TurnOnCommand(light);
        System.out.println(turnOnLight.execute());
        Command adjustBrightness = new AdjustCommand(light, "brightness", 50);
        System.out.println(adjustBrightness.execute());
        System.out.println();
        System.out.println("hello");

        Command turnOnThermostat = new TurnOnCommand(thermostat);
        System.out.println(turnOnThermostat.execute());
        Command adjustTemperature = new AdjustCommand(thermostat, "temperature", 22);
        System.out.println(adjustTemperature.execute());
        System.out.println();

        Command turnOnMusicPlayer = new TurnOnCommand(musicPlayer);
        System.out.println(turnOnMusicPlayer.execute());
        Command adjustVolume = new AdjustCommand(musicPlayer, "volume", 70);
        System.out.println(adjustVolume.execute());
        System.out.println();

    }
}
