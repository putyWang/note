package tree;

/**
 * 平衡
 */
public class AvlBinaryNode <E extends Comparable> {

    //根节点
    private TreeNode<E> root;
    //平衡常数
    private static final int ALLOWED_IMBALANCE = 1;

    public AvlBinaryNode(){}

    /**
     * 寻找最大值
     * @return
     */
    public E findMax(){
        return findMax(root);
    }

    /**
     * 寻找最小值
     * @return
     */
    public E findMin(){
        return findMin(root);
    }

    /**
     * 确认是否包含node
     * @param node
     * @return
     */
    public boolean contains(E node){

        return contains(node, root);
    }

    /**
     * 插入e元素
     * @return
     */
    public void insert(E e){
        root = insert(e, root);
    }

    /**
     * 删除e元素
     * @param e
     */
    public void remove(E e){
        root =  remove(e, root);
    }

    /**
     * 寻找最大值
     * @return
     */
    private E findMax(TreeNode node){
        if (node.right == null)

            return (E)node.e;

        return (E)findMax(node.right);
    }

    /**
     * 寻找最小值
     * @return
     */
    private E findMin(TreeNode node){
        if (node.left == null)

            return (E)node.e;

        return (E)findMax(node.left);
    }

    /**
     * tree是否包含e
     * @param node
     * @param tree
     * @return
     */
    private boolean contains(E node, TreeNode tree){
        if(node == null)

            return false;
        if (node.compareTo(tree.e) == 0)

            return true;
        if (node.compareTo(tree.e) < 0){

            return contains(node, tree.left);
        }else{

            return contains(node, tree.right);
        }
    }

    /**
     * 插入函数递归函数
     * @param e
     * @param tree
     * @return
     */
    private TreeNode<E> insert(E e, TreeNode tree){
        if (tree == null)

            return new TreeNode<>(e);
        int compareResult = e.compareTo(tree.e);
        if (compareResult < 0)

            tree.left = insert (e, tree.left);
        else if (compareResult > 0)

            tree.right = insert (e, tree.right);
        else;

        //调整平衡条件
        return balance(tree);
    }

    /**
     * tree删除节点元素为e的节点
     * @param e
     * @param tree
     * @return
     */
    private TreeNode<E> remove(E e, TreeNode tree){
        if (tree == null)

            return null;
        int compareResult = e.compareTo(tree.e);
        if (compareResult < 0)
            tree.left =  remove (e, tree.left);
        else if (compareResult > 0)
            tree.right = remove (e, tree.right);
        else if (tree.right != null && tree.left != null){
            tree.e = findMin(tree.right);
            tree = remove (e, tree.right);
        }else{
            tree = tree.left == null ? tree.right : tree.left;
        }
        //调整平衡条件
        return balance(tree);
    }

    /**
     * 平衡函数
     * @param treeNode
     * @return
     */
    private TreeNode<E> balance(TreeNode<E> treeNode){
        if (treeNode == null)

            return null;
        if (height (treeNode.left) - height (treeNode.right) > ALLOWED_IMBALANCE){
            if (height(treeNode.left.left) > height(treeNode.left.right))
                treeNode = rotateLeft (treeNode);
            else if (height(treeNode.left.right) > height(treeNode.left.left))
                treeNode = rotateDoubleLeft (treeNode);
        }else if (height (treeNode.right) - height (treeNode.left) > ALLOWED_IMBALANCE){
            if (height(treeNode.right.right) > height(treeNode.right.left))
                treeNode = rotateRight (treeNode);
            else if (height(treeNode.right.left) > height(treeNode.right.right))
                treeNode = rotateDoubleRight (treeNode);
        }

        return treeNode;
    }

    /**
     * 左旋转节点
     * @param k2
     * @return
     */
    private TreeNode<E> rotateLeft (TreeNode<E> k2){
        TreeNode k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        k2.high = Math.max(height(k2.left), height(k2.right));
        k1.high = Math.max(height(k1.left), k2.high);

        return k1;
    }

    /**
     * 双左旋转节点
     * @param k2
     * @return
     */
    private TreeNode<E> rotateDoubleLeft(TreeNode<E> k2){
        k2.left = rotateRight (k2.left);
        return rotateLeft (k2);
    }

    /**
     * 右旋转节点
     * @param treeNode
     * @return
     */
    private TreeNode<E> rotateRight (TreeNode<E> treeNode){
        TreeNode temp = treeNode;
        treeNode = treeNode.right;
        treeNode.left = temp;
        temp.right = null;

        return treeNode;
    }

    /**
     * 双右旋转节点
     * @param k2
     * @return
     */
    private TreeNode<E> rotateDoubleRight(TreeNode<E> k2){
        k2.right = rotateLeft (k2.right);
        return rotateRight (k2);
    }

    /**
     * 获取平衡常数
     * @param treeNode
     * @return
     */
    private int height(TreeNode<E> treeNode){
        return treeNode == null?-1:treeNode.high;
    }
    /**
     * 二叉树节点类
     * @param <E>
     */
    class TreeNode<E>{

        E e;

        TreeNode right;

        TreeNode left;

        /**
         * 两节点高度差
         * -1表示节点为空
         * 0表示节点平衡
         * 1表示节点差距为1
         */
        Integer high;

        public TreeNode(E e) {
            this.e = e;
        }
    }
}
