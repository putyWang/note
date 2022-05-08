package graph.adjacencyList;

import java.util.LinkedList;

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
    public void topSort ()
            throws Exception{
        LinkedList<Vertex<T>> vertices = copyList();

        for (int i = 0; i < numVertex; i++) {
            Vertex<T> vertex = findNewVertexOfInDegreeZero(vertices);

            if (vertex == null) {
                throw new Exception("该邻接表为圈");
            }

            for (Vertex<T> vertex1 : vertex.outDegreeNode) {
                vertex1.inDegreeNumber --;
            }

            list.remove(vertex);
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
    class Vertex<T> {

        /**
         * 节点数据
         */
        T t;

        /**
         * 节点的入度
         */
        Integer inDegreeNumber;

        /**
         * 出度表
         */
        LinkedList<Vertex<T>> outDegreeNode;

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
