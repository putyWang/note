package stackADT;

import listADT.LinkList;

/**
 * @description：利用链表进行栈的简单实现
 * @modified By：
 * @version: $
 */
public class StackADT<E extends Object> {
    //栈的链表对象
    private LinkList<E> list;

    //栈深度
    private Integer high;

    public StackADT(){
        this.list = new LinkList<>();
        high = 0;
    }
    /**
    *@Description:实现push方法
    *@Param:
    *@return:
    */
    public void push(E e){
        this.add(e);
        high ++;
    }

    /**
    *@Description: 获取栈深度
    *@Param:
    *@return:
    */
    public Integer getHigh(){
        return high;
    }

    /**
    *@Description: 实现pop方法
    *@Param:
    *@return:
    */
    public E pop(){
        if (null == this.getLast())
            throw new RuntimeException("弹栈失败：栈为空");

        E last = this.getLast();
        this.removeLast();
        high --;

        return last;
    }

    /**
    *@Description: 实现top方法
    *@Param:
    *@return:
    */
    public E top(){
        if (null == this.getLast())
            throw new RuntimeException("弹栈失败：栈为空");

        return this.getLast();
    }

    /**
    *@Description:获取链表尾部元素
    *@Param:
    *@return:
    */
    private E getLast(){
        if (null != list.getLast()){
            return list.getLast();
        }else if (null != list.getFirst())
            return list.getFirst();
        return null;
    }

    /**
    *@Description: 向链表中添加元素
    *@Param:
    *@return:
    */
    private void add(E e){
        list.add (e);
    }

    /**
    *@Description: 删除listLink中的尾部元素
    *@Param:
    *@return:
    */
    private void removeLast(){
        list.remove (list.length() - 1);
    }

}
