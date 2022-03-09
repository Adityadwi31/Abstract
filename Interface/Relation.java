package Interface;

public interface Relation {

    public abstract boolean isGreater(Object a, Object b);

    public abstract boolean isLess(Object a, Object b);

    public boolean isEqual(Object a, Object b);

}
