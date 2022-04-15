package hashTable.hashFamily.abstarct;

import hashTable.hashFamily.IHashFamily;
import utils.PrimeUtil;

/**
 * HashFamily 抽象类
 */
public abstract class HashFamily<T>
        implements IHashFamily<T> {

        //总的hash函数数量
        public Integer numberOfFunctions;

        //hash函数数组
        public int[] functions;

        public HashFamily(){
                numberOfFunctions = 0;
                functions = new int[DEFAULT_TABLE_SIZE];
        }

        /**
         * 获取对象的hash值
         * @return
         */
        @Override
        public int getNumberOfFunctions() {
            return numberOfFunctions;
        }

        /**
         * 通过numberOf
         */
        @Override
        public void generateNewFunctions() {
                if (getNumberOfFunctions() == 0){
                        functions[0] = 3;
                }else if (getNumberOfFunctions() == functions.length) {
                        int[] temp = new int[functions.length * 2];

                        for (int i = 0; i < functions.length; i++) {
                                temp[i] = functions[i];
                        }
                        functions = temp;
                }

                functions[getNumberOfFunctions ()] = PrimeUtil.nextPrime(functions[getNumberOfFunctions() - 1] + 1);

                numberOfFunctions ++;
        }
}
