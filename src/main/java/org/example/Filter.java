package org.example;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();

        int count = 0;

        for (int i : source) {
            if (i > treshold) {
                logger.log("Элемент " + i + " проходит");
                result.add(i);
                count++;
            } else {
                logger.log("Элемент " + i + " непроходит");
            }
        }
        logger.log("Прошло фильтр " + count + " элемента из " + source.size());

        return result;
    }
}

