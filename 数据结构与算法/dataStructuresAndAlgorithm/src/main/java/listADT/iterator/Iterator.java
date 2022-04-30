package listADT.iterator;

/**
 * @description：迭代器接口
 * @modified By：
 * @version: $
 */
public interface Iterator<T> {
    /**
    *@Description: 迭代器hasNext方法
    *@Param:
    *@return:
    */
    boolean hasNext();

    /**
    *@Description: 迭代器next方法
    *@Param:
    *@return:
    */
    T next();

    /**
    *@Description: 迭代器add方法
    *@Param:
    *@return:
    */
    void add(T t);

    /**
    *@Description: 迭代器remove方法
    *@Param:
    *@return:
    */
    void remove();
}
