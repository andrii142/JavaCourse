package module7.practice;

import java.util.Comparator;

public class IncreaseOrder implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        //int res = i1 - i2;
        //if(res < 0) return -1;
        //if(res > 0) return 1;
        //if(res == 0) return 0;

        return i1 - i2;
    }
}
