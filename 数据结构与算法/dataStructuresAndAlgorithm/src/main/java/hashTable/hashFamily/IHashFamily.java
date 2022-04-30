package hashTable.hashFamily;

public interface IHashFamily<T> {

    //默认function数组容量
    int DEFAULT_TABLE_SIZE = 10;

    /**
     * 返回对象的hash值
     * @param t key值对象
     * @param which hash函数的位置
     * @return
     */
    int hash(T t, int which);

    int getNumberOfFunctions();

    /**
     * 创建新的hash函数
     */
    void generateNewFunctions();
}
