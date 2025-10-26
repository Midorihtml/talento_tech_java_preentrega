import java.util.ArrayList;

public interface ICrud<T> {
    ArrayList<T> getAll();
    T getById(int id);
    void create(T t);
    void update(T t);
    void delete(T t);
}
