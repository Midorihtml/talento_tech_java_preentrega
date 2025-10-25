public class main {
    public static void main(String[] args) {
        ProductMenu productMenu = new ProductMenu();
        try {
            productMenu.show();
            System.out.println("Goodbye!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
