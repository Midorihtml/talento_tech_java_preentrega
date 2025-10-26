import java.util.ArrayList;

public class Products implements ICrud<Product> {
    private final ArrayList<Product> products = new ArrayList<>();

    public Products() {
        this.create(new Product("Laptop", 1200.00, "computers"));
        this.create(new Product("Smartphone", 800.00, "electronics"));
    }

    public ArrayList<Product> getAll() {
        return this.products;
    }

    public Product getById(int id) {
        return this.products.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public void create(Product product) {
        this.products.add(product);
    }

    public void update(Product product) {
        int index = this.products.indexOf(product);
        this.products.set(index, product);
    }

    public void delete(Product product) {
        this.products.remove(product);
    }
}
