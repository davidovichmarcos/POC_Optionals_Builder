
public class Location {
    private Integer id;
    private String name;
    private City city;

    public Location() {

    }

    public Location(Integer id, String name, City city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
