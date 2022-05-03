package sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 排序工具类
 */
public class SortUtil {

    /**
     * 合并排序主函数
     */
    public static<T extends Comparable<? super T>>
    void mergeSort (T[] a1, T[] tempArray, int left, int right) {

        if (left < right) {
            int center = (left + right) / 2;
            mergeSort(a1, tempArray, left, center);
            mergeSort(a1, tempArray, center + 1, right);
            merge(a1, tempArray, left, center + 1, right);
        }
    }

    /**
     * 合并前后有序数组
     */
    private static <T extends Comparable<? super T>>
    void merge (T[] a, T[] tempArray, int leftPos, int rightPos, int rightEnd) {
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        //数组总长度
        int numElements = rightEnd - leftPos + 1;

        while (leftPos <= leftEnd && rightPos <= rightEnd) {

            if (a[leftPos].compareTo(a[rightPos]) < 0) {
                tempArray[tmpPos ++] = a[leftPos ++];
            } else {
                tempArray[tmpPos ++] = a[rightPos ++];
            }
        }

        while (leftPos <= leftEnd) {
            tempArray[tmpPos ++] = a[leftPos ++];
        }

        while (rightPos <= rightEnd) {
            tempArray[tmpPos ++] = a[rightPos ++];
        }

        for (int i = 0; i < numElements; i ++, rightEnd --) {
            a[rightEnd] = tempArray[rightEnd];
        }
    }

    /**
     * shell序列的希尔排序实现
     * @param array
     * @param <T>
     */
    public static <T extends Comparable<? super T>> void shellSort (T[] array) {
        if (array == null ||array.length <= 1) {
            return;
        }

        T temp;
        int j;

        for (int h = array.length / 2; h > 0; h /= 2) {

            for (int i = h; i < array.length; i ++) {
                temp = array[i];

                for (j = i; j >= h && temp.compareTo(array[j - h]) < 0; j -= h) {
                    array[j] = array[j - h];
                }

                array [j] = temp;
            }
        }
    }

    /**
     * 插入排序实现
     * @param array
     * @param <T>
     */
    public static <T extends Comparable<? super T>> void insertionSort (T[] array, int left, int right) {
        if (array == null ||array.length <= 1) {
            return;
        }

        T temp;

        for (int i = left; i < right; i ++) {

            for (int j = i + 1; j < right; j++) {
                if (array[j].compareTo(array[i]) < 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    /**
     * 直接使用插入排序的界限
     */
    private static int CUTOFF = 10;

    /**
     * 快速排序的实现
     * @param a
     * @param <T>
     */
    public static <T extends Comparable<? super T>>
    void quicksort(T[] a) {
        quicksort(a, 0, a.length - 1);
    }

    /**
     * 快速排序的实现
     * @param a
     * @param left
     * @param right
     * @param <T>
     */
    public static <T extends Comparable<? super T>>
    void quicksort(T[] a, int left, int right) {
        if (left + CUTOFF < right) {
            T media = median3(a, left, right);

            int start = left;
            int end = right - 1;

            //速度快的核心
            for (;;) {

                while (a[start ++].compareTo(media) <= 0) {}
                while (a[end --].compareTo(media) >= 0) {}

                if (start < end) {
                    swap (a, start ++, end --);
                } else {
                    break;
                }
            }

            swap (a, start, right - 1);


            quicksort(a, left, start - 1);
            quicksort(a, start + 1, right);
        }else {
            insertionSort(a, left, right);
        }
    }

    /**
     * 默认基数排序中桶数组大小
     */
    private final static int BUCKETS = 256;

    /**
     * 基数排序的实现
     * @param arr
     * @param stringLen
     */
    public static void radixSort(String[] arr, int stringLen) {

        //设置桶，其中
        ArrayList<String>[] buckets = new ArrayList[BUCKETS];

        for (int i = 0; i < BUCKETS; i++) {
            buckets[i] = new ArrayList<>();
        }

        //从尾部向前依次添加元素
        for (int pos = stringLen - 1; pos >= 0; pos --) {
            for (String s : arr) {
                buckets[s.charAt(pos)].add(s);
            }

            int idx = 0;
            //按照排序后的顺序重新插入
            for (ArrayList<String> bucket : buckets) {
                for (String s : bucket) {
                    arr[idx ++] = s;
                }

                bucket.clear();
            }
        }
    }

    /**
     * 计数基数排序的实现
     * @param arr
     * @param stringLen
     */
    public static void countingRadixSort(String[] arr, int stringLen) {
        int N = arr.length;
        String[] buffer = new String[N];
        //in代表arr
        String[] in = arr;
        //out代表临时数组buffer
        String[] out = buffer;

        for (int pos = stringLen - 1; pos >= 0; pos --) {
            int[] count = new int[BUCKETS + 1];

            //设置pos位置的count数组
            for (int i = 0; i < N; i++) {
                count[in[i].charAt(pos) + 1] ++;
            }

            //优化count数组
            for (int i = 1; i < BUCKETS; i++) {
                count[i] += count[i - 1];
            }

            //将重新排序
            for (int i = 0; i < N; i++) {
                out[count[in[i].charAt(pos)] ++] = in[i];
            }

            String[] tmp = in;
            in = out;
            out = tmp;
        }

        //如果arr数组是奇数，in是buffer，out是arr，换回来；
        if (stringLen % 2 == 1) {
            for (int i = 0; i < arr.length; i++) {
                out[i] = in[i];
            }
        }
    }

    /**
     * 变长字符串的基数排序的实现
     * @param arr
     * @param maxLen 最长字符串的长度
     */
    public static void LengthenRadixSort (String[] arr, int maxLen) {
        //根据长度设置桶
        ArrayList<String>[] wordsByLength = new ArrayList[maxLen + 1];
        //所使用的桶
        ArrayList<String>[] buckets = new ArrayList[BUCKETS];

        for (int i = 0; i < maxLen + 1; i++) {
            wordsByLength[i] = new ArrayList<>();
        }

        for (int i = 0; i < BUCKETS; i++) {
            buckets[i] = new ArrayList<>();
        }

        //根据字符串长度添加到桶中
        for (String s : arr) {
            wordsByLength[s.length()].add(s);
        }

        //将arr中的数组按字符串长度进行排序
        int idx = 0;
        for (ArrayList<String> wordlist : wordsByLength) {
            for (String s : wordlist) {
                arr[idx ++] = s;
            }
        }

        int startingIndex =  arr.length;

        for (int pos = maxLen - 1; pos >= 0; pos --) {
            startingIndex -= wordsByLength[pos + 1].size();

            for (int i = startingIndex; i < arr.length ; i++) {
                buckets[arr[i].charAt(pos)].add(arr[i]);
            }

            idx = startingIndex;

            for (ArrayList<String> bucket : buckets) {
                for (String s : bucket) {
                    arr[idx ++] = s;
                }

                bucket.clear();
            }
        }
    }

    /**
     * 执行三数中值分割法选择最小值
     * @param a
     * @param left
     * @param right
     * @param <T>
     */
    private static <T extends Comparable<? super T>>
    T median3(T[] a, int left, int right) {

        int middle = (left + right) / 2;

        if (a[middle].compareTo(a[left]) < 0) {
            swap(a, left, middle);
        }

        if (a[right].compareTo(a[left]) < 0) {
            swap(a, left, right);
        }

        if (a[right].compareTo(a[middle]) < 0) {
            swap(a, middle, right);
        }

        //将枢纽元放置在right-1的位置上
        swap(a,middle,right -1);

        return a[right - 1];
    }

    /**
     * 交换两个数组中两位置的元素
     * @param a
     * @param left
     * @param right
     * @param <T>
     */
    private static <T extends Comparable<? super T>>
    void swap(T[] a, int left, int right) {
        T temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }
}
