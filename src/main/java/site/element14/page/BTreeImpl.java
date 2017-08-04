package site.element14.page;

import java.util.Random;

/**
 * Created by wfnuser on 2017/8/4.
 */
public class BPlusTree implements BTree {

    // Root node
    protected Node root;

    // Order
    protected int order;

    // Link list header
    protected Node head;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Object get(Comparable key) {
        return this.root.get(Comparable key);
    }

    public void remove(Comparable key) {

    }

    public void insertOrUpdate(Comparable key, Object obj) {

    }

    public BPlusTree(int order) {
        if (order < 3) {
            System.out.println("Order must be greater than 2");
            System.exit(0);
        }
        this.root = new Node(true, true);
        this.order = order;
        this.head = root;
    }

    // Test
    public void main(String[] args) {
        BPlusTree bt = new BPlusTree(4);
        Random random = new Random();
        long current = System.currentTimeMillis();
        for (int j = 0; j < 10000; j++) {
            for (int i = 0; i < 100; i++) {
                int randomNumber = random.nextInt(1000);
                bt.insertOrUpdate(randomNumber, randomNumber);
            }

            for (int i = 0; i < 100; i++) {
                int randomNumber = random.nextInt(1000);
                bt.remove(randomNumber);
            }
        }

        long duration = System.currentTimeMillis() - current;
        System.out.println("time elapsed for duration: " + duration);

        int search = 80;
        System.out.println(bt.get(search));
    }
}
