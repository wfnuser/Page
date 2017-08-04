package site.element14.page;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by wfnuser on 2017/8/4.
 */
public class Node {
    protected boolean isLeaf;
    protected boolean isRoot;
    protected Node parent;
    protected Node previous;
    protected Node next;
    protected List<Map.Entry<Comparable, Object>> entries;
    protected List<Node> children;

    public Node(boolean isLeaf) {
        this.isLeaf = isLeaf;
        entries = new ArrayList<Map.Entry<Comparable, Object>>();

        if (!isLeaf) {
            children = new ArrayList<Node>();
        }
    }

    public Node(boolean isLeaf, boolean isRoot) {
        this(isLeaf);
        this.isRoot = isRoot;
    }

    public Object get(Comparable key) {
        return null;
    }

}
