public class Product extends Article{
    public Product(String name, double price, String category) {
        super(name, price, category);
    }

    @Override
    public String toString() {
        return  "Product{" +
                "name='" + name + '\'' +
                ", id=" + this.getId() +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }
}
