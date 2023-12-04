import java.util.HashSet;
import java.util.Set;

public class CartApp {
    public static void main(String[] args) {
        // 상품 목록 생성
        Set<Product> products = new HashSet<>();
        // TODO: 상품 클래스를 생성하여 상품목록에 넣는다.

        Product apple = new Product(1, "사과", 1000);
        Product banana = new Product(2, "바나나", 4500);
        Product car = new Product(3, "자동차", 10000000);

        products.add(apple);
        products.add(banana);
        products.add(car);

        // 상품 목록 확인
        System.out.println("고유한 상품 목록:");
        for (Product product : products) {
            System.out.println(product.getName() + " : " + product.getPrice());
        }

        // 장바구니 생성
        Cart myCart = new Cart();

        // TODO: 상품을 장바구니에 추가
        System.out.println("TODO: 상품을 장바구니에 추가");

        myCart.addProduct(apple, 2);
        myCart.addProduct(car, 1);

        myCart.showItems();

        // TODO: 상품을 장바구니에서 제거
        System.out.println("TODO: 상품을 장바구니에서 제거");

        myCart.removeProduct(apple, 1);
        // TODO: 장바구니에 현재 담긴 상품들을 출력 (상품이름, 각 상품의 갯수)
        myCart.showItems();

    }
}