import java.util.ArrayList;
import java.util.List;

public class ElectronicStore extends Subject {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        notifySubscribers();
    }

    @Override
    public String getMessage() {

        if (products.isEmpty()) {
            return "No products available";
        }

        Product latestProduct = products.get(products.size() - 1);

        return "New product available: " + latestProduct.getName() + " for " + latestProduct.getPrice();
    }

}
