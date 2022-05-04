package disjointSet;

/**
 * 不相交集类
 */
public class DisjointSet {
    /**
     * 不相交集类森林
     */
    private int[] disjoint;

    public DisjointSet(int numElements) {
        this.disjoint = new int[numElements];

        for (int i = 0; i < numElements; i++) {
            disjoint[i] = -1;
        }
    }

    /**
     * 合并集合方法
     * @param root1
     * @param root2
     */
    public void union(int root1, int root2) {
        disjoint[root2] = root1;
    }

    /**
     * 按高度合并集合方法
     * @param root1
     * @param root2
     */
    public void heightUnion(int root1, int root2) {
        if (disjoint[root1] < disjoint[root2]) {
            heightUnion(root2, root1);

            return;
        } else if (root1 == root2){
            disjoint[root1] --;
        }

        disjoint[root2] = root1;
    }

    /**
     * 寻找x的根节点
     * @param x
     * @return
     */
    public int find(int x) {
        while (disjoint[x] >= 0) {
            x = disjoint[x];
        }

        return x;
    }

    /**
     * 使用路径压缩来寻找x的根节点
     * @param x
     * @return
     */
    public int compressionFind(int x) {
        if (disjoint[x] < 0) {
            return x;
        }

        return disjoint[x] = compressionFind(disjoint[x]);
    }
}
