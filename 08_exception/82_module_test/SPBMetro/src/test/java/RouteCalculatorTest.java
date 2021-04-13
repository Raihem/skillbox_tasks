import core.Line;
import core.Station;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class RouteCalculatorTest extends TestCase {

    List<Station> route;

    protected void setUp() throws Exception{

        route = new ArrayList<>();

        Line line1 = new Line(1, "Первая");
        Line line2 = new Line(2, "Втрорая");

        route.add(new Station("Петровская",line1));
        route.add(new Station("Арбузная",line1));
        route.add(new Station("Виноградная",line2));
        route.add(new Station("Яблочная",line2));

    }

    public void testCalculateDuration() {
        double actual = RouteCalculator.calculateDuration(route);
        double expected = 8.5;
        assertEquals(expected, actual);
    }

    public void testGetRouteEmpty() {

        boolean actual =  route.isEmpty() ;
        boolean expected = false;
        assertEquals(expected, actual);
    }

}
