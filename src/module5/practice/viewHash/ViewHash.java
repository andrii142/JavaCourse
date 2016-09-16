package module5.practice.viewHash;


import module5.practice.Apple;
import module5.practice.View;

import java.util.Arrays;

/**
 * Created by zetokz on 12.09.16.
 */
public class ViewHash {

    private int currentIndex = 0;
    private View[] views = new View[10];
    private Apple[] apples = new Apple[10];

    public void addView(View view) {
//        if (views != null) {
//            int length = views.length;
//            View[] tempViews = views;
//            views = new View[length + 1];
//            for (int i = 0; i < tempViews.length; i++) {
//                views[i] = tempViews[i];
//            }
//            views[length] = view;
//        }
        views[currentIndex] = view;
        currentIndex++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewHash viewHash = (ViewHash) o;

        if (currentIndex != viewHash.currentIndex) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(views, viewHash.views);
    }

    @Override
    public int hashCode() {
        int result = currentIndex;
        result = 31 * result + Arrays.hashCode(views);
        return result;
    }
}
