import java.util.Objects;

public class Product {
    private String Key;
    private String name;
    private int price;

    public Product(String key, String name, int price) {
        Key = key;
        this.name = name;
        this.price = price;
    }

    public String getKey() {
        return Key;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(Key, product.Key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Key);
    }
}
