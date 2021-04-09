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


//        Date date = new Date();



        List<Flight> term = new ArrayList<>();
        for (Terminal terminal1 : d )

            term.addAll
                        (terminal1.getFlights());



        term.stream()
//             .filter(flight -> flight.getDate().after())

              .forEach(System.out::println);

        System.out.println("__________");



        for(Flight flight : term)

        {
            System.out.print(flight.getAircraft()+" ");
            System.out.println(flight);
        }



    }

}

