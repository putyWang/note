package listADT;

import listADT.iterator.Iterator;

import java.util.Objects;

/**
 * @description：双向链表
 * @modified By：
 * @version: $
 */
public class LinkList<E extends Object> {
    //头结点
    private Node<E> first;
    //尾节点
    private Node<E> last;
    //LinkList长度
    private int length = 0;

    /**
    *@Description: 无参构造函数
    *@Param:
    *@return:
    */
    public LinkList() {
    }

    /**
    *@Description: 获取尾部元素
    *@Param:
    *@return:
    */
    public E getLast(){
        if (null == last)
            return null;
        return last.e;
    }

    /**
    *@Description: 获取头部元素
    *@Param:
    *@return:
    */
    public E getFirst(){
        if (null == first)
            return null;
        return first.e;
    }

    /**
     *@Description: 向链表添加元素
     *@Param:
     *@return:
     */
    public void add(E e){
        if (null == first){
            first = new Node<E>();
            first.setE(e);
        }else if (null == last){
            last = new Node<E>();
            last.setE(e);
            first.setNext(last);
            last.setPrevious(first);
        }else {
            Node<E> temp = new Node<>();
            temp.setE(e);
            last.setNext(temp);
            temp.setPrevious(last);
            last = temp;
        }

        //LinkList长度+1
        length ++;
    }

    /**
    *@Description: 删除数组中的元素
    *@Param:
    *@return:
    */
    public void remove(int index)
            throws IndexOutOfBoundsException{
        if(index > length - 1 || index < 0)
            throw new IndexOutOfBoundsException(String.valueOf(index));
        else if (index == length - 1){
            if(index == 0)
                first = null;
            else if (index == 1){
                first.setNext(null);
                last = null;
            }else {
                last = last.getPrevious();
                last.setNext(null);
            }
        }else {
            Node<E> node = first;
            for (int i = 0; i <= index; i++) {
                node = node.next;
            }
            node.getPrevious().setNext(node.getNext());
            node.getNext().setPrevious(node.getPrevious());
        }
        //LinkList长度-1
        length --;
    }

    /**
    *@Description: 链表中是否包含某元素
    *@Param:
    *@return:
    */
    public boolean contain(E e){
        //头节点为空时，不包含该节点
        if(null == first)
            return false;

        Node<E> node = first;
        while (null != node.getNext()){
            //判断节点是否为e
            if (node.getE().equals(e))

                return true;
            node = node.getNext();
        }

        //判断点是否为e
        if (node.getE().equals(e))

            return true;

        return false;
    }

    /**
    *@Description: 获取迭代器
    *@Param:
    *@return:
    */
    public LinkIterator iterator(){
        return new LinkIterator();
    }

    /**
    *@Description: 清空LinkList
    *@Param:
    *@return:
    */
    public void clear(){
        if(null == first && null == last){
        }else if (null == last){
            first = null;
        }else {
            first = null;
            last = null;
        }
        length = 0;
    }

    /**
    *@Description: 获取链表长度
    *@Param:
    *@return:
    */
    public int length(){
        return length;
    }

    /**
    *@Description: 判断LinkList是否为空
    *@Param:
    *@return:
    */
    public boolean isEmpty(){
        return null == first && null == last;
    }

    /**
    *@Description: 链表迭代器内部类
    *@Param:
    *@return:
    */
    class LinkIterator
            implements Iterator<E> {

        /**
        *@Description: 当前节点
        *@Param:
        *@return:
        */
        Node<E> temp = LinkList.this.first;

        /**
        *@Description: 是否存在下一节点
        *@Param:
        *@return:
        */
        @Override
        public boolean hasNext() {
            return null != temp.getNext();
        }

        /**
        *@Description: next实现
        *@Param:
        *@return:
        */
        @Override
        public E next() {
            temp = temp.getNext();
            return temp.getE();
        }

        /**
        *@Description: add方法实现
        *@Param:
        *@return:
        */
        @Override
        public void add(E e) {
            Node node = new Node();
            node.setE(e);
            node.setNext(temp.getNext());
            temp.setNext(node);
        }

        /**
        *@Description: remove方法的实现
        *@Param:
        *@return:
        */
        @Override
        public void remove() {
            Node node = temp.getNext();
            temp.getNext().setPrevious(temp.getPrevious());
            temp.getPrevious().setNext(node);
        }
    }

    /**
     * @description：节点类
     * @modified By：
     * @version: $
     */
    class Node<E extends Object>{
        //前一个节点
        private Node<E> previous;
        //后一个节点
        private Node<E> next;
        //存储数据
        private E e;

        public Node getPrevious() {
            return previous;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public E getE() {
            return e;
        }

        public void setE(E e) {
            this.e = e;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Node)) return false;
            Node<?> node = (Node<?>) o;
            return Objects.equals(previous, node.previous) && Objects.equals(next, node.next) && Objects.equals(e, node.e);
        }

        @Override
        public int hashCode() {
            return Objects.hash(previous, next, e);
        }
    }
}


