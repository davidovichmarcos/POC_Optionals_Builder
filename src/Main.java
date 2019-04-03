import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static java.util.Comparator.*;

public class Main {


    public static void main(String[] args) {
        List<Event> eventos = asList(new Event(1,"Event1",new Location(1,"Location1",new City(1,"Mar del Plata"))),
                new Event(2,"Event2",new Location(2,"Location2", new City(2,"La Plata"))),
                new Event(3,"Event3",new Location(3,"Location3",new City(3, "Buenos Aires"))),
                new Event(4,"Event4",new Location(4,"Location4",new City(4, "4"))),
                new Event(5,"Event5",new Location(5,"Location5",new City(5, "5"))),
                new Event(6,"Event6",new Location(6,"Location6",new City(6, "6"))),
                new Event(7,"Event7",new Location(7,"Location7",new City(7, "7"))),
                new Event(8,"Event8",new Location(8,"Location8",new City(8, "8"))));

        List<Event> events =  getFirstFiveEventa(eventos);
        List<Event> sorted =  getSortedEvents(eventos);
            for (Event event : sorted) {
            System.out.println("Event: "+event.getId()+" Location: "+event.getLocation().getName()+" City: "+event.getLocation().getCity().getName());
        }
        }

        public static List<Event> getFirstFiveEventa(List<Event> events) {
        return  events.stream()
                .filter(event -> event.getId() < 5)
                .collect(Collectors.toList());
        }
        public static List<Event> getSortedEvents(List<Event> events)
        {
            return events.stream().sorted().collect(Collectors.toList());
        }


}
