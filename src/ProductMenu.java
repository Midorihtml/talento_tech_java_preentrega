public class ProductMenu extends Menu {

    private final Products products = new Products();

    public ProductMenu(){
        this.title = "Menú Productos";

        this.options.add(new Option("Listar Productos", this::getProducts));
        this.options.add(new Option("Agregar Producto", this::addProduct));
        this.options.add(new Option("Actualizar Producto", this::updateProduct));
        this.options.add(new Option("Eliminar Producto", this::deleteProduct));
    }

    private Object getProducts(){
        this.scanner.nextLine();

        System.out.println("*** Lista de Productos ***");
        System.out.println("----------------------------");
        this.products.getAll().forEach(System.out::println);
        System.out.println("----------------------------\n");
        return null;
    }

    private Object addProduct(){
        this.scanner.nextLine();

        System.out.println("*** Agregar Nuevo Producto ***");
        System.out.println("-------------------------------");

        System.out.println("Ingrese el nombre del nuevo producto:");
        String name = this.scanner.nextLine();

        System.out.println("Ingrese el precio del nuevo producto:");
        double price = Double.parseDouble(this.scanner.nextLine());

        System.out.println("Ingrese la categoría del nuevo producto:");
        String category = this.scanner.nextLine();

        Product newProduct = new Product(name, price, category);
        this.products.create(newProduct);
        System.out.println("Producto agregado exitosamente.\n");
        return null;
    }

    private Object updateProduct(){
        this.scanner.nextLine();

        System.out.println("*** Actualizar Producto ***");
        System.out.println("---------------------------");

        System.out.println("Ingrese el ID del producto a actualizar:");
        int id = Integer.parseInt(this.scanner.nextLine());
        Product productToUpdate = this.products.getById(id);
        if (productToUpdate == null) {
            System.out.println("Producto no encontrado.\n");
            return null;
        }
        System.out.println("Ingrese el nuevo nombre del producto (actual: " + productToUpdate.getName() + "):");
        String newName = this.scanner.nextLine();
        System.out.println("Ingrese el nuevo precio del producto (actual: " + productToUpdate.getPrice() + "):");
        double newPrice = Double.parseDouble(this.scanner.nextLine());
        System.out.println("Ingrese la nueva categoría del producto (actual: " + productToUpdate.getCategory() + "):");
        String newCategory = this.scanner.nextLine();

        productToUpdate.name = newName;
        productToUpdate.price = newPrice;
        productToUpdate.category = newCategory;

        this.products.update(productToUpdate);

        System.out.println("Producto actualizado exitosamente.\n");
        return null;
    }

    private Object deleteProduct(){
        System.out.println("*** Eliminar Producto ***");
        System.out.println("-------------------------");
        this.scanner.nextLine();

        System.out.println("Ingrese el ID del producto a eliminar:");
        int id = Integer.parseInt(this.scanner.nextLine());
        Product productToDelete = this.products.getById(id);
        if (productToDelete == null) {
            System.out.println("Producto no encontrado.\n");
        }
        this.products.delete(productToDelete);
        System.out.println("Producto eliminado exitosamente.\n");
        return null;
    }
}
