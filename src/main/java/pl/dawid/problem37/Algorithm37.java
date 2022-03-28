package pl.dawid.problem37;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Algorithm37 {

    private Algorithm37(){};

    public static <T> Void getSubsets(Set<T> set, Set<Set<T>> subsets){
        List<T> setList = new ArrayList<>(set);
        for (int i = 0; i < setList.size() && setList.size() > 1; ++i){
            List<T> items = new LinkedList<>();
            for(int j = 0; j < setList.size(); ++j){
                if (j != i){
                    items.add(setList.get(j));
                }
            }
            Set<T> subset = new HashSet<>(items);
            subsets.add(subset);
            getSubsets(subset, subsets);
        }
        return null;
    }
}
