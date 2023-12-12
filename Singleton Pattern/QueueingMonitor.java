package singletonPatternLab;

public class QueuingMonitor {
    public static void main (String[] args){
        CentralizedQueuingSystem queuingSystem = CentralizedQueuingSystem.getInstance();

        //display queue number
        System.out.println("Number: " + queuingSystem.getQueueNumber());

        queuingSystem.incrementQueueNumber();
        System.out.println("New Present Number: " + queuingSystem.getQueueNumber());

        queuingSystem.resetQueueNumber(76);

    }
}
