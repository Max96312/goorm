import  java.util.*;
public class Product {
    private int key;
    private String name;
    private int price;

    public Product(int key, String name, int price) {
        this.key = key;
        this.name = name;
        this.price = price;
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
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return key == product.key;
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}
