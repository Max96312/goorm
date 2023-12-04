import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cart;

    public Cart() {
        cart = new HashMap<>();
    }

    public void addProduct(Product product, int cnt) {
        cart.put(product, cart.getOrDefault(product, 0) + cnt);
    }

    public void removeProduct(Product product, int cnt) {
        int currentCnt = cart.getOrDefault(product, 0);
        if (currentCnt > cnt) {
            cart.put(product, currentCnt - cnt);
        } else {
            cart.remove(product);
        }
    }
    public void showItems() {
        for (Map.Entry<Product, Integer> product : cart.entrySet()) {
            System.out.println("상품: " + product.getKey().getName() + ", 수량: " + product.getValue());
        }
    }
}
