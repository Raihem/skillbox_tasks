import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Airport aero = Airport.getInstance();


        List<Aircraft> c = aero.getAllAircrafts();
        List<Terminal> d = aero.getTerminals();


//        System.out.println(aero.getAllAircrafts());
//        System.out.println(aero.getTerminals());
//        System.out.println(c.size());
//        System.out.println(c.get(401));


        System.out.println(d.size());

        for (Terminal terminal1 : d )
            System.out.println(terminal1.getFlights());



//        Date date = new Date();
//        Aircraft ar1= new Aircraft("Airbus A-320");
//
//        Flight axe = new Flight("800",ARRIVAL,date,ar1);
//
//        System.out.println(axe.getDate());



        List<Flight> term = new ArrayList<>();
        for (Terminal terminal1 : d )
        term.addAll(terminal1.getFlights());

        term
                .forEach(System.out::println);





    }
}

