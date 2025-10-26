public class Main {
    public static void main(String[] args) {
        try {
            ProductMenu productMenu = new ProductMenu();
            productMenu.show();
            System.out.println("Goodbye!");
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
