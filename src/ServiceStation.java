import transport.Transport;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<T extends Transport> {
    public String masterReceiver;

    public ServiceStation(String masterReceiver) {
        this.masterReceiver = masterReceiver;
    }

    private Queue<T> queue = new LinkedList<>();

    public void addACarToTheQueue(T transport) {
        //«добавить авто в очередь»
        queue.offer(transport);
    }


    public void performACarInspection() {
        //«провести техосмотр авто».
        T transport = queue.poll();
        if (transport != null) {
            System.out.println("Транспортное средство- " + transport.getBrand() + ", "
                    + transport.getModel() + " - проходит сервисное обслуживание" + masterReceiver);
            performACarInspection();

        } else {
            System.out.println("Очередь пуста.");
        }

    }

    public int queueSize() {
        return queueSize();
    }


}

