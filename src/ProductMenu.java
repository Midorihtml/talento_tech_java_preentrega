import java.util.ArrayList;

public class ProductMenu extends Menu {
    public ProductMenu(){
        this.title = "Menú Productos";
        this.options.add(new Option("Agregar Producto", ()->{
            System.out.println("Agregar Producto");
            return null;
        }));
        this.options.add(new Option("Eliminar Producto", ()->{
            System.out.println("Eliminar Producto");
            return null;
        }));
        this.options.add(new Option("Listar Productos", ()->{
            System.out.println("Listar Productos");
            return null;
        }));
    }
}
