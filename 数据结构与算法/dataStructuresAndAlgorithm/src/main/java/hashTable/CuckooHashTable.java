package hashTable;

import hashTable.hashFamily.IHashFamily;
import utils.PrimeUtil;

import java.util.Random;

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
     * 插入元素
     * @param t
     * @return
     */
    public boolean insert (T t) {

        //判断是否包含该元素
        if (contains(t)) {

            return false;
        }

        //当装填因子大于MAX_LOAD时先扩容
        if (currentSize >= hashTable.length * MAX_LOAD) {

            expand();
        }

        return insertHelper(t);
    }

    /**
     * 判断hashtable中是否包含t
     * @param t
     * @return
     */
    public boolean contains (T t) {

        return findPos(t) != -1;
    }

    /**
     * 移除t
     * @param t
     * @return
     */
    public boolean remove (T t) {

        int pos = findPos(t);

        if (pos != -1) {

            hashTable[pos] = null;
            currentSize --;
            return true;
        }

        return false;
    }

    /**
     * 添加元素
     * @param t
     * @return
     */
    private boolean insertHelper (T t) {

        int numberOfFunctions = hashFunctions.getNumberOfFunctions();
        //最大插入循环次数
        final int COUNT_INSERT = 100;
        int rehashs = 0;
        Random r = new Random();
        T temp;

        while (true){
            //记录上一次插入的位置
            int lastPos = -1;
            int index;
            for (int i = 0; i < COUNT_INSERT; i++) {

                //查询在表中是否还有对应空位，有的话直接插入
                for (int j = 0; j < numberOfFunctions; j++) {

                    index = hashFunctions.hash(t, i);
                    T t1 = hashTable[index];

                    if (t1 == null) {

                        t1 = t;
                        currentSize ++;
                        return true;
                    }
                }

                //没有空位的情况下，随机选择hash函数对其中值进行替换，当index和之前的index相同时重选
                int j = 0;
                do {

                    index = myHash(t, r.nextInt(numberOfFunctions));
                } while (index != lastPos && j++ < 5);

                temp = hashTable[index];
                hashTable[index] = t;
                t = temp;
            }

            //超过最大循环次数，对表进行扩容处理
            if (++rehashs > ALLOWED_REHASHES) {
                expand();
                rehashs = 0;
            } else {
                rehash();
            }
        }
    }

    /**
     * 找到t所在位置
     * 存在返回所在位置
     * 不存在返回-1
     * @param t
     * @return
     */
    private int findPos (T t) {

        int l = hashFunctions.getNumberOfFunctions();

        for (int i = 0; i < l; i++) {

            if (t.equals(hashTable[myHash(t, i)])) {

                return i;
            }
        }

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

    /**
     * 返回第which函数计算的t的hash值
     * @param t
     * @param which
     * @return
     */
    private int myHash (T t, int which) {

        int hash = hashFunctions.hash(t, which);

        int hashCode = hash % hashTable.length;

        if (hashCode < 0) {

            hashCode += hashTable.length;
        }

        return hashCode;
    }

    /**
     * 对hash表进行完全扩容
     */
    private void expand() {
        rehash ((int) (hashTable.length/MAX_LOAD));
    }

    /**
     * 对hash表进行小幅度再散列
     */
    private void rehash() {
        rehash (hashTable.length + 1);
    }

    /**
     * 对hash表进行指定扩展后容量的再散列
     */
    private void rehash(int size) {

        T[] old = hashTable;
        hashTable = (T[]) new Object[PrimeUtil.nextPrime(size)];

        for (int i = 0; i < old.length; i++) {

            insert(old[i]);
        }
    }
}
