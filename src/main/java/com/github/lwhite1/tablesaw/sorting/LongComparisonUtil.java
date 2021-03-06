package com.github.lwhite1.tablesaw.sorting;

/**
 *
 */
public class LongComparisonUtil {

    private static LongComparisonUtil instance = new LongComparisonUtil();

    private LongComparisonUtil() {
    }

    public static LongComparisonUtil getInstance() {
        return instance;
    }

    public int compare(long a, long b) {
        if (a > b)
            return 1;
        if (b > a)
            return -1;
        return 0;
    }
}
