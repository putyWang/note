package hashTable;

import hashTable.hashFamily.IHashFamily;
import utils.PrimeUtil;

/**
 * 布谷鸟散列
 */
public class CuckooHashTable <T> {

    /**
     * 实例化hash函数
     */
    private final IHashFamily<? super T> hashFunctions;

    /**
     * 保存的hash函数的素数
     */
    private final int numHashFunctions;

    /**
     * 维护数组作为存储表
     */
    private T[] hashTable;

    /**
     * 当前表数据数
     */
    private int currentSize;

    /**
     * 最大装填因子
     */
    private static final double MAX_LOAD = 0.4;

    /**
     * 执行再散列的次数
     */
    private static final int ALLOWED_REHASHES = 1;

    /**
     * 初始数组大小（101）
     */
    private static final int DEFAULT_TABLE_SIZE = 101;

    /**
     * 带HashFamilyImpl的构造器
     * @param hf
     */
    public CuckooHashTable(IHashFamily<? super T> hf){
        this (hf, DEFAULT_TABLE_SIZE);
    }

    /**
     * 设置初始数组大小
     * @param hf
     * @param size
     */
    public CuckooHashTable(IHashFamily<? super T> hf, int size){

        allocateArray(size);
        doClear();
        hashFunctions = hf;
        numHashFunctions = hf.getNumberOfFunctions();
    }

    /**
     * 找到t所在位置
     * 存在返回所在位置
     * 不存在返回-1
     * @param t
     * @return
     */
    public int findPos (T t) {

        int index = hashFunctions.hash(t, hashTable.length);

        if (t.equals(hashTable[index])) {
            return index;
        }else
            return -1;
    }

    /**
     * 清空hash数组
     */
    public void makeEmpty() {
        doClear();
    }

    /**
     * 初始化hash数组
     */
    private void doClear() {

        for (int i = 0; i < hashTable.length; i++) {

            hashTable[i] = null;
        }

        currentSize = 0;
    }

    /**
     * 设置hashTable容量
     * @param size
     */
    private void allocateArray (int size) {

        hashTable = (T[]) new Object[size];
    }
}
