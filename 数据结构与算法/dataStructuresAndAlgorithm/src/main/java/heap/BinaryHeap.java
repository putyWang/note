package heap;

import utils.ArrayUtils;

import java.util.Arrays;

/**
 * 二叉堆
 */
public class BinaryHeap <T extends Comparable<? super T>>{

    /**
     * 数据数列
     * 0位置处为空，添加时使用
     */
    private T[] array;

    /**
     * 当前数据个数
     */
    private int currentSize;

    private static final int DEFAULT_TABLE_SIZE = 10;

    /**
     * 构造器
     */
    public BinaryHeap() {
        this(DEFAULT_TABLE_SIZE);
    }

    public BinaryHeap(int size) {
        array = (T[]) new Object[size];
    }

    public BinaryHeap(T[] array) {
        this((array.length + 2) * 11 / 10);
        currentSize = array.length;
        for (int i = 0; i < array.length; i++) {

            insert(array[i]);
        }
    }

    /**
     * 插入t元素
     * 上滤方式添加元素
     * @param t
     */
    public void insert(T t) {

        if (array == null) {

            array = (T[])new Object[DEFAULT_TABLE_SIZE];
        }

        if (currentSize >= array.length) {

            expand();
        }

        int child = ++ currentSize;

        for (array[0] = t; t.compareTo (array[child / 2]) < 0 ; child /= 2) {

            array[child] = array[child / 2];
        }

        array [child] = t;
    }

    /**
     * 寻找最小值
     * @return
     */
    public T findMin() {

        if (isEmpty()) {

            return null;
        }else {

            return array[1];
        }
    }

    /**
     * 删除最小值
     * @return
     */
    public void deleteMin() {

        if (isEmpty()) {
            return;
        }

        array[1] = array[currentSize];
        array[currentSize --] = null;

        percolate();
    }

    /**
     * 判断是否为空
     * @return
     */
    public boolean isEmpty() {

        return currentSize == 0;
    }

    /**
     * 清空表
     */
    public void makeEmpty() {

        doClear();
    }

    /**
     * 对堆扩容
     */
    private void expand() {

        T[] oldArray = array;
        array = (T[]) new Object[oldArray.length * 2 + 1];

        for (int i = 0; i < oldArray.length; i++) {

            array[i] = oldArray[i];
        }
    }

    /**
     * 清空数据
     */
    private void doClear() {

        array = null;
        currentSize = 0;
    }

    /**
     * 将最小值推到根节点
     */
    public void percolate() {
        T temp;
        int child;

        for (int i = 1; i * 2 <= currentSize;i = child) {
            child = i * 2;

            if (child != currentSize && array[child + 1].compareTo(array[child]) < 0) {
                child ++;
            }else if (array[i].compareTo(array[child]) > 0) {

                temp = array[i];
                array[i] = array[child];
                array[child] = temp;
            }else

                break;
        }
    }
}
