
public class City {
    private Integer id;
    private String name;

    public City(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //Ejemplo Build.
    City build() {
        City c = new City(1,"");
        c.setId(this.id);
        c.setName(this.name);
        return c;
    }
}
