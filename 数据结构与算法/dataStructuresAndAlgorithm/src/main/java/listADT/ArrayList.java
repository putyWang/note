package listADT;

import com.sun.org.apache.xerces.internal.xs.ItemPSVI;
import listADT.iterator.Iterator;

/**
 * @author ：mmzs
 * @date ：Created in 2022/4/3 21:27
 * @description：数组实现类
 * @modified By：
 * @version: $
 */
public class ArrayList<T extends Number>{
    //定义数组
    private T[] arrayList;
    //数组数据长度
    private int length = 0;
    //数组总长度，初始化为8
    private int count = 8;

    /**
    *@Description: 无参构造函数，使用自带的初始化长度
    *@Param:
    *@return:
    */
    public ArrayList() {
        this.arrayList = (T[])new Object[count];
    }

    /**
    *@Description: 有参构造函数，数组总长度，传入初始化数组长度
    *@Param:
    *@return:
    */
    public ArrayList(int initialCount) {
        this.arrayList = (T[])new Object[initialCount];
    }

    /**
    *@Description: 有参构造函数，传入数组
    *@Param:
    *@return:
    */
    public ArrayList(T[] ts) {
        if (ts.length % 8 == 0)
            arrayList = ts;
        else {
            count = (ts.length / 8 + 1) * 8;
            arrayList = (T[])new Object[count];
            for (int i = 0; i < ts.length; i++) {
                arrayList[i] = ts[i];
            }
        }
        length = ts.length;
    }

    /**
    *@Description: 向数组添加元素
    *@Param:
    *@return:
    */
    public void add(T t){
        insert(length,t);
    }

    /**
    *@Description: 向添加数组
    *@Param:
    *@return:
    */
    public void add(T[] ts){
        for (int i = 0; i < ts.length; i++) {
            add(ts[i]);
        }
    }

    /**
    *@Description: 向数组插入元素
    *@Param:
    *@return:
    */
    public void insert (int i, T t)
            throws ArrayIndexOutOfBoundsException{
        if (i > length)
            throw new ArrayIndexOutOfBoundsException(i);
        else if (length == count){
            count += 8;
            T[] temp = (T[])new Object[count];
            for (int j = 0; j < arrayList.length; j++) {
                temp[j] = arrayList[j];
            }
            arrayList = temp;
        }
        if (i < length) {
            for (int j = i; j < length; j++) {
                arrayList[j + 1] = arrayList[j];
            }
        }
            arrayList[i] = t;
            length ++;
    }

    /**
    *@Description: 删除数组中的元素
    *@Param:
    *@return:
    */
    public void remove (int removeIndex){
        for (int i = removeIndex; i < length - 1; i++) {
            arrayList[i] = arrayList[i + 1];
        }
        length --;
    }

    /**
    *@Description: 数组中是否包含某元素
    *@Param:
    *@return:
    */
    public boolean contain(T t){
        for (int i = 0; i < length; i++) {
            if(t == arrayList[i])
                return true;
        }
        return false;
    }

    /**
    *@Description: 根据内容查找index
    *@Param:
    *@return:
    */
    public int find(T t){
        for (int i = 0; i < length; i++) {
            if(t == arrayList[i])
                return i;
        }
        return -1;
    }

    /**
    *@Description: 清空数组
    *@Param:
    *@return:
    */
    public boolean makeEmpty()
            throws RuntimeException{
        if(length == 0)
            throw new RuntimeException("该数组本身为空");
        else {
            length = 0;
            if(count > 8)
                count = 8;
            arrayList = (T[]) new Object[count];
            return true;
        }
    }

    /**
    *@Description: 判断数组是否为空
    *@Param:
    *@return:
    */
    public boolean isEmpty(){
        return length == 0;
    }

    /**
    *@Description: 将arrayList转换为数组
    *@Param:
    *@return:
    */
    public Object[] toArray(){
        Object[] objects = new Object[length];
        if (length != 0){
            for (int i = 0; i < length; i++) {
                objects[i] = arrayList[i];
            }
        }
        return objects;
    }

    /**
    *@Description: 查询数组长度
    *@Param:
    *@return:
    */
    public int length(){
        return length;
    }

    /**
    *@Description: 寻找下标为index的数据
    *@Param:
    *@return:
    */
    public T findKth(int index)
            throws RuntimeException{
        if(index >= length || index < 0)
            throw new ArrayIndexOutOfBoundsException(index);

        return (T)arrayList[index];
    }

    /**
    *@Description: 输出列表
    *@Param:
    *@return:
    */
    public void printList(){
        for (int i = 0; i < length; i++) {
            System.out.print(arrayList[i] + ",");
        }
    }

    /**
    *@Description: 获取迭代器
    *@Param:
    *@return:
    */
    public Iterator listIterator(){
        return new ListIterator();
    }

    class ListIterator
            implements Iterator<T> {

        /**
        *@Description: 当前位置下标
        *@Param:
        *@return:
        */
        int index;

        /**
        *@Description: hasNext方法的数组实现
        *@Param:
        *@return:
        */
        @Override
        public boolean hasNext () {

            return  index < length - 1;
        }

        /**
         *@Description: hasNext方法的数组实现
         *@Param:
         *@return:
         */
        @Override
        public T next (){

            return ArrayList.this.findKth (index ++);
        }

        /**
         *@Description: hasNext方法的数组实现
         *@Param:
         *@return:
         */
        @Override
        public void add (T t) {

            ArrayList.this.add (t);
        }

        /**
         *@Description: hasNext方法的数组实现
         *@Param:
         *@return:
         */
        @Override
        public void remove () {
            ArrayList.this.remove (index --);
        }
    }
}
