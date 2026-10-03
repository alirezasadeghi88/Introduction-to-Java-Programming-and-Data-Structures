import java.util.Collection;

public interface MyList<E> extends Collection<E> {

    public void add(int index, E e);
}
