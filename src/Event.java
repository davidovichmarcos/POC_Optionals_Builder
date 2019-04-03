
import java.util.List;
import java.util.stream.Collectors;

public class Event  {
    private static int id;
    private String name;

    private Location location;

    public Event() {
    }

    public Event(int id, String name, Location location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public static Event getEventById(List<Event> events, Integer id) {
        return  (Event) events.stream()
                .filter( o -> o .getId()== id)
                .collect(Collectors.toList());
    }

    public static Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

}
