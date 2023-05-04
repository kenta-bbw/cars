import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
public class App {
    public static void main(String[] args){
        List<Car> myCars = new ArrayList<>();
        myCars.add(new Car("BMW", 120, 15000,"Red"));
        myCars.add(new Car("Fiat", 90, 7000, "White"));
        myCars.add(new Car("Mercedes", 150, 20000, "Black"));
        myCars.add(new Car("Tesla", 140, 25000,"White"));
        myCars.add(new Car("BMW", 230, 70000, "Chrome"));
        System.out.println(myCars);
    }
}


