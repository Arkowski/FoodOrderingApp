
public class Order {

    private Integer price = null;
    private String Name = null;

    public Order() {}

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Order(Integer price, String name) {

        this.price = price;
        Name = name;
    }
}
