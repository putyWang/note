package hashTable.hashFamily.impl;

import hashTable.hashFamily.abstarct.HashFamily;
import utils.PrimeUtil;

public class StringHashFamily<String>
        extends HashFamily<String> {

    @Override
    public int hash(String s, int which) {
        return s.hashCode() * functions[which];
    }
}
