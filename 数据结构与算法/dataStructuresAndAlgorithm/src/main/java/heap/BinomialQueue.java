package heap;

/**
 * 二项队列的实现
 * @param <T>
 */
public class BinomialQueue
        <T extends Comparable<? super T>> {

    /**
     * 用数组模拟森林，数组下标+1代表存储二项树深度
     */
    private Node<T>[] trees;

    /**
     * 现阶段存储二项树数量
     */
    private int currentSize;

    /**
     * 初始化数组大小
     */
    private static final int DEFAULT_TREES = 1;

    public BinomialQueue() {

        this.trees = new Node[DEFAULT_TREES];
    }

    public BinomialQueue(T t) {
        this();
        trees[0] = new Node(t);
    }

    /**
     * 将多余的函数加入本数组中
     * @param rhs
     */
    public void merge (BinomialQueue<T> rhs) {
        if (isEmpty()) {
            this.trees = rhs.trees;
            this.currentSize = rhs.currentSize;
        }else if (rhs.isEmpty()) {

            return;
        }

        // 合并二项树数量
        int count = 0;
        Node<T>[] trees2 = rhs.trees;

        for (int i = 0; i < trees2.length; i++) {

            Node<T> tNode = trees2[i];
            if (tNode == null) {

                continue;
            }

            if (trees[i] == null) {
                trees[i] = tNode;
            } else {
                Node<T> temp = mergeTwoNode (trees[i], tNode);
                trees[i] = null;

                int j = i + 1;
                while (j < trees2.length && trees[j] != null ) {
                    temp = mergeTwoNode (trees[j], temp);
                    trees[j] = null;
                }

                if (j == trees.length) {
                    expandTheTrees (trees.length * 2);
                }

                trees[j] = temp;
            }

            currentSize ++;
        }
    }

    /**
     * 插入元素
     * @param t
     */
    public void insert (T t) {

        merge(new BinomialQueue<T>(t));
    }

    public T findMin () {
        if (isEmpty()) {

            return null;
        }

        return trees[findMinIndex()].element;
    }
    /**
     * 寻找最小元素
     * @return
     */
    public boolean deleteMin () {

        if (isEmpty()) {

            return true;
        }

        int min = findMinIndex();
        Node<T> node = trees[min];
        trees[min] = null;
        currentSize --;

        if (node == null) {

            return true;
        }

        if (node.firstChild != null) {

            merge (new BinomialQueue(node.firstChild.element));

            if (node.firstChild.nextSibling != null) {

                merge (new BinomialQueue(node.firstChild.nextSibling.element));
            }
        }

        return true;
    }

    /**
     * 判断二项队列是否为空
     * @return
     */
    public boolean isEmpty() {
        return currentSize == 0;
    }

    /**
     * 清空二项队列
     */
    public void makeEmpty() {

        currentSize = 0;
        trees = new Node[0];
    }

    /**
     * 节点合并函数
     * @param node1
     * @param node2
     * @return
     */
    private Node<T> mergeTwoNode (Node<T> node1, Node<T> node2) {
        if (node1.element.compareTo(node2.element) > 0) {
            mergeTwoNode(node2, node1);
        }

        node2.nextSibling = node1.firstChild;
        node1.firstChild = node2;
        return node1;
    }

    /**
     * 寻找最小值所在二项树索引
     * @return
     */
    private int findMinIndex () {
        int min = 0;

        for (int i = 0; i < trees.length; i++) {

            if (trees[min] == null || trees[min].element.compareTo(trees[i].element) > 0) {

                min = i;
            }
        }

        return min;
    }

    /**
     * 对二项队列扩容
     * @param newNumTrees
     */
    private void expandTheTrees(int newNumTrees) {

        Node<T>[] oldTrees = trees;
        trees = new Node[newNumTrees];

        for (int i = 0; i < oldTrees.length; i++) {
            trees[i] = oldTrees[i];
        }
    }

    /**
     * 节点类
     */
    class Node<T> {

        //存储元素
        T element;
        //第一个孩子节点
        Node<T> firstChild;
        //下一个右兄弟节点
        Node<T> nextSibling;

        public Node(T element) {
            this(element, null, null);
        }

        public Node(T element, Node<T> firstChild, Node<T> nextSibling) {
            this.element = element;
            this.firstChild = firstChild;
            this.nextSibling = nextSibling;
        }
    }
}
