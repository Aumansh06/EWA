import java.util.*;
class driver{
    Scanner scan = new Scanner(System.in);
    int id = scan.nextInt();
    String name = scan.nextLine();
    double rating = scan.nextInt();
    int tripsCompleted = scan.nextInt();
    public test(int id, String name, double rating, int tripsCompleted){
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.tripsCompleted = tripsCompleted;
    }
}
public class test {
    public static void main(String[] args) {
        test d1 = new test(1,"Aumansh",4.5,10);
        test d2 = new test(2,"Aryan",3.5,6);
        test d3 = new test(3,"Aadit",5.0,7);
        test d4 = new test(4,"Varun",2.5,8);

        List<driver> drivers = new ArrayList<>();
        drivers.add(d1);
        drivers.add(d3);
        drivers.add(d3);
        drivers.add(d4);

        collections.sort(drivers, new Comparator<driver>() {
            @Override
            public int compare(driver d1, d2){
                if(d1.rating > d2.rating){
                    return -1;
                }
                else if (d1.rating < d2.rating){
                    return 1;
                }
                else{
                    return d2.tripsCompleted - d1.tripsCompleted;
                }
            }
        });
    }
}

