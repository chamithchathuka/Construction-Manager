package lk.nsbm.construction.manager.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UtilCollection {
    public static <E> List<E> makeCollection(Iterable<E> iter) {
        List<E> list = new ArrayList<E>();
        for (E item : iter) {
            list.add(item);
        }
        return list;
    }
}
