package genericParadigm;

import java.util.function.Predicate;

class FilterPredicate implements Predicate {

    @Override
    public boolean test(Object o) {
        return false;
    }
}

/**
 * @description：泛型示例类
 * @modified By：
 * @version: $
 */
public class GenericParadigm {
    public static void main(String[] args) {
        computeDays();
    }

    /**
    *@Description:泛型输出执行方法
    *@Param:
    *@return:
    */
    private static void computeDays(){
        Integer[] s = new Integer[3];
        for (int j = 0; j < 3; j++) {
            s[j] = j;
        }
        IntStore<Integer> j = new IntStore<>();
        j.setMax(s);
        GenericParadigm.printInteger(j);
        System.out.println("\n" + findMax(j));
    }

    /**
    *@Description: 输出类对象
    *@Param:
    *@return:
    */
    private static void printInteger(IntStore<? extends Integer> s){
        for (int i = 0; i < s.getMax().length; i++) {
            System.out.print(s.getMax()[i] + " ");
        }
    }

    /**
    *@Description: 寻找数组最大值
    *@Param:
    *@return:
    */
    private static<T extends Comparable> T findMax(IntStore<T> s){
        T max = s.getMax()[0];
        for (T i : s.getMax()) {
            if(max.compareTo(i) == -1)
                max = i;
        }
        return max;
    }
}

/**
 * @description：存储泛型数组类
 * @modified By：
 * @version: $
 */
class IntStore<T extends Object>{
    private T[] max;

    public T[] getMax() {
        return max;
    }

    public void setMax(T[] max) {
        this.max = max;
    }
}
