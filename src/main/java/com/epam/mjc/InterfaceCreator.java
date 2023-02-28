package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {
    public static void main(String[] args) {
        System.out.println(new InterfaceCreator().divideBy(3).apply(List.of(3, 6, 9, 12)));
    }

    public Operation<Integer> divideBy(Integer divider) {
        Operation<Integer> op = x -> {
            List<Integer> res = new ArrayList<>();
            for (Integer integer : x) {
                res.add(integer / divider);
            }
            return res;
        };
    return op;
    }
}
