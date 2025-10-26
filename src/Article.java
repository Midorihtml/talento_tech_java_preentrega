abstract class Article {
    protected static int autoIncrement = 0;
    protected int id;
    protected String name;
    protected double price;
    protected String category;

    public Article(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
        autoIncrement++;
        this.id = autoIncrement;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public abstract double calculateDiscount();
}
