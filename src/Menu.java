import java.util.ArrayList;
import java.util.Scanner;

abstract class Menu {
    protected String title;
    protected ArrayList<Option> options = new ArrayList<>();
    protected Scanner scanner = new Scanner(System.in);

    protected String getTitle() {
        return title;
    }

    protected void setTitle(String title) {
        this.title = title;
    }

    protected ArrayList<Option> getOptions() {
        return options;
    }

    protected void setOptions(ArrayList<Option> options) {
        this.options = options;
    }

    public void show() throws Exception {
        System.out.println("***"+this.title+"***");
        System.out.println("--------------------------");

        boolean isSalir = false;
        int optionSelected;

        while(!isSalir){
            for (int index = 0; index < this.options.size(); index++) {
                System.out.println(index + ". " + this.options.get(index).getTitle());
            }
            System.out.println(this.options.size()+". Salir");
            System.out.print("Seleccione una opción: ");
            optionSelected = this.scanner.nextInt();
            if(optionSelected == this.options.size()){
                isSalir = true;
                continue;
            }
            this.options.get(optionSelected).execute();
        }
    }
}
