package graph.adjacencyList;

import java.util.*;

/**
 * 邻接表实现
 */
public class AdjacencyList<T> {

    /**
     * 邻接列表节点列表
     */
    private LinkedList<Vertex<T>> list;

    /**
     * 节点个数
     */
    private Integer numVertex;

    public AdjacencyList() {
        list = new LinkedList<>();
        numVertex = 0;
    }

    public AdjacencyList(LinkedList<Vertex<T>> list) {
        this.list = list;

        for (Vertex vertex : list) {
            numVertex ++;
        }
    }

    public void add (Vertex<T> vertex) {
        list.add(vertex);
        numVertex ++;
    }

    /**
     * 拓扑排序
     */
    public List<Vertex<T>> topSort ()
            throws Exception{
        LinkedList<Vertex<T>> vertices = copyList();
        Queue<Vertex<T>> inDegreeZeroList = new ArrayDeque<>();
        List<Vertex<T>> topSortList = new ArrayList<>();
        int count = 0;

        for (Vertex<T> vertex : vertices ) {
            if (vertex.inDegreeNumber == 0) {
                inDegreeZeroList.add(vertex);
            }
        }

        while (! inDegreeZeroList.isEmpty()) {

            Vertex<T> peek = inDegreeZeroList.peek();
            topSortList.add(peek);
            count ++;

            for (Vertex<T> vertex : peek.outDegreeNode) {
                if (-- vertex.inDegreeNumber == 0) {
                    inDegreeZeroList.add(vertex);
                }
            }
        }

        return topSortList;
    }

    /**
     * 广度优先搜索
     */
    public void unweighted (Vertex<T> s) {
        LinkedList<Vertex<T>> vertices = copyList();

        for (Vertex<T> vertex : vertices ) {
            vertex.dist = Integer.MAX_VALUE;
            vertex.know = false;
        }

        s.dist = 0;

        for (int i = 0; i < numVertex; i++) {
            for (Vertex<T> vertex : vertices ) {
                if (!vertex.know && vertex.dist == i) {
                    vertex.know = true;

                    for (Vertex<T> v : vertex.outDegreeNode) {
                        v.dist = i + 1;
                        v.path = vertex;
                    }
                }
            }
        }
    }

    /**
     * 复制图
     * @return
     */
    private LinkedList<Vertex<T>> copyList () {

        LinkedList<Vertex<T>> copyList = new LinkedList<>();
        for (Vertex<T> vertex : list) {
            if (vertex == null) {
                copyList.add(null);
            }

            copyList.add(vertex.copy());
        }

        return copyList;
    }

    /**
     * 寻找入度为0的节点
     * @return
     */
    private Vertex<T> findNewVertexOfInDegreeZero (LinkedList<Vertex<T>> list) {

        for (Vertex<T> vertex : list) {
            if (vertex.inDegreeNumber == 0)
                return vertex;
        }

        return null;
    }


    /**
     * 邻接表节点实现
     */
    static class Vertex<T> {

        /**
         * 节点数据
         */
        T t;

        /**
         * 节点的入度
         */
        Integer inDegreeNumber;

        /**
         * 前一节点
         */
        Vertex<T> path;

        /**
         * 出度表
         */
        LinkedList<Vertex<T>> outDegreeNode;

        /**
         * 标记顶点是否被遍历
         */
        Boolean know;

        /**
         * 与起点距离
         */
        Integer dist;

        public Vertex() {
        }

        public Vertex(T t, Integer inDegreeNumber, LinkedList<Vertex<T>> outDegreeNode) {
            this.t = t;
            this.inDegreeNumber = inDegreeNumber;
            this.outDegreeNode = outDegreeNode;
        }

        Vertex<T> copy () {
            return new Vertex<T>(t,inDegreeNumber,outDegreeNode);
        }
    }
}
