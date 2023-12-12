package singletonPatternLab;

public class CentralizedQueuingSystem {
    private static CentralizedQueuingSystem instance;
    private int queueNumber;

    //prevents outside instantiation
    private CentralizedQueuingSystem(){
    }

    //get CentralizedQueuingSystem instance
    public static synchronized CentralizedQueuingSystem getInstance(){
        if(instance == null)
            instance = new CentralizedQueuingSystem();
        return instance;
    }
    public synchronized int getQueueNumber(){
        return queueNumber;
    }
    public synchronized void incrementQueueNumber(){
        queueNumber++;
    }

    public synchronized void resetQueueNumber (int newQueueNumber){
        if (newQueueNumber > 0){
            queueNumber = newQueueNumber;
            System.out.println("Queuing number reset to: " + newQueueNumber);
        }
        else{
            System.out.println("Queue Number invalid.");
        }
    }
}
