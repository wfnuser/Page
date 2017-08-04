package site.element14.page;

/**
 * Created by wfnuser on 2017/8/4.
 */
public interface BTree {
    public Object get(Comparable key);

    public void remove(Comparable key);

    public void insertOrUpdate(Comparable key, Object obj);
}
