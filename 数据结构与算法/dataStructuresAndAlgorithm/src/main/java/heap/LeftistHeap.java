package heap;

import tree.AvlBinaryNode;

public class LeftistHeap<E extends Comparable<? super E>> {

    private HeapNode<E> root;

    /**
     * 与另一科树结合
     * @param heap
     */
    public void merge(LeftistHeap<E> heap) {

        this.root = merge (root, heap.root);

        swap(root);

    }

    public boolean isEmpty() {

        return this.root == null;
    }

    /**
     * 合并两个节点
     * @param node1
     * @param node2
     * @return
     */
    private HeapNode<E> merge(HeapNode<E> node1, HeapNode<E> node2) {

        if (node2 == null) {

            return node1;
        }if (node1 == null) {

            return node2;
        }

        if (node1.e.compareTo(node2.e) < 0) {

            return merge2(node2, node1);
        }else {

            return merge2(node1, node2);
        }
    }

    /**
     * node1 大于node2的交换
     * @param node1
     * @param node2
     */
    private HeapNode<E> merge2(HeapNode<E> node1, HeapNode<E> node2) {

        if (node1.left == null) {

            node1.left = node2;
        }else {
            node1.right = merge(node2, node1.right); 
            node1.npl = Math.min(computeNpl(node1.left), computeNpl(node1.right)) + 1;
        }

        return node1;
    }

    /**
     * 计算节点的零路径长
     * @param node
     * @return
     */
    private int computeNpl(HeapNode<E> node) {

        return node == null ? -1 : node.npl;
    }

    /**
     * 将堆转化为左式堆
     * @param node
     * @return
     */
    private HeapNode<E> swap(HeapNode<E> node) {

        if (node == null) {

            return null;
        }

        if (node.left == null) {

            if (node.right != null) {

                node.left = node.right;

                node.right = null;

                return swap(node.left);
            }else {

                return node;
            }
        }else if (node.right == null) {

            return swap(node.left);
        }else {
            if (computeNpl(node.left) < computeNpl(node.right)) {

                HeapNode<E> temp = node.left;
                node.left = node.right;
                node.right = temp;
            }

            swap(node.left);
            swap(node.right);
            return node;
        }
    }

    /**
     * 左式堆节点类
     * @param <E>
     */
    class HeapNode<E>{

        E e;

        HeapNode<E> right;

        HeapNode<E> left;

        /**
         * 零路径长
         * -1表示节点为空
         */
        Integer npl;

        public HeapNode(E e) {
            this(e, null, null);
        }

        public HeapNode(E e, HeapNode<E> right, HeapNode<E> left) {

            this.e = e;
            this.right = right;
            this.left = left;
            npl = 0;
        }
    }
}
