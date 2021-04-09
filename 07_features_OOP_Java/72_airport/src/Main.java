import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.lang.reflect.Type;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {



    public static void main(String[] args) {

        Airport aero = Airport.getInstance();


        List<Aircraft> c = aero.getAllAircrafts();
        List<Terminal> d = aero.getTerminals();


      System.out.println(aero.getAllAircrafts());
//        System.out.println(aero.getTerminals());
//        System.out.println(c.size());
//        System.out.println(c.get(401));

        System.out.println(d.size());

        for (Terminal terminal1 : d )
            System.out.println(terminal1.getFlights());



        List<Flight> term = new ArrayList<>();
        for (Terminal terminal1 : d )

            term.addAll
                        (terminal1.getFlights());

        term.stream()
//             .filter(flight -> flight.getDate().after()) // need correct date for filter


              .forEach(System.out::println);

        System.out.println("__________");

        Collections.sort(term, (o1,o2)-> o1.getDate().compareTo(o2.getDate()));
        Collections.sort(term, (o1,o2)-> o1.getType().compareTo(o2.getType()));

        for(Flight flight : term)

        {
            System.out.print(flight.getAircraft()+" ");
            System.out.println(flight);

        }

        System.out.println("\n"+"Please, check last flights for your mission.");

    }

}

