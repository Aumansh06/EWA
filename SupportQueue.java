import java.util.LinkedList;

public class SupportQueue {
    LinkedList<String> queue = new LinkedList<>();

    void addCustomer(String name) {
        queue.add(name);
    }

    String serveCustomer() {
        if (queue.size() == 0) {
            return "No customers to serve.";
        }
        return queue.remove(0);
    }

    String peekNextCustomer() {
        if (queue.size() == 0) {
            return "Queue is empty.";
        }
        return queue.get(0);
    }

    void printQueue() {
        System.out.print("Current Queue: ");
        for (int i = 0; i < queue.size(); i++) {
            System.out.print(queue.get(i));
            if (i != queue.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    void reAddCustomerToEnd(String name) {
        queue.add(name);
    }

    void prioritizeCustomer(String name) {
        if (queue.contains(name)) {
            queue.remove(name);
            queue.add(0, name);
        } else {
            System.out.println(name + " not found in queue.");
        }
    }

    public static void main(String[] args) {
        SupportQueue q = new SupportQueue();

        q.addCustomer("Alice");
        q.addCustomer("Bob");
        q.addCustomer("Charlie");
        q.addCustomer("Diana");
        q.addCustomer("Ethan");
        q.addCustomer("Fiona");

        q.printQueue();

        System.out.println("Serving customer: " + q.serveCustomer());
        System.out.println("Serving customer: " + q.serveCustomer());
        System.out.println("Serving customer: " + q.serveCustomer());

        q.printQueue();

        System.out.println("Next customer: " + q.peekNextCustomer());

        q.reAddCustomerToEnd("Bob");
        q.printQueue();

        q.prioritizeCustomer("Ethan");
        q.printQueue();

        q.prioritizeCustomer("George");
    }
}
