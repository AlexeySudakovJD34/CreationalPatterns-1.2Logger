package org.example;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        int counter = 0;
        logger.log("Запускаем фильтрацию...");
        for (int number : source) {
            if (number < threshold) {
                logger.log("Элемент <" + number + "> не проходит");
            } else {
                logger.log("Элемент <" + number + "> проходит");
                result.add(number);
            }
        }
        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());
        return result;
    }
}
