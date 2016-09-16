package module5.practice;

/**
 * Created by zetokz on 12.09.16.
 */
public final class Triangle extends View {

    private boolean isShowing = false;

    public void show() {
        if (isShowing) {
            System.out.println("Sorry, this triangle is showing now");
        } else {
            System.out.println("Showing Triangle");
            isShowing = true;
        }
//        changeViewState("showing");
    }

    public void hide() {
        if (!isShowing) {
            System.out.println("Sorry, this triangle is not showing now");
        } else {
            System.out.println("Hiding Triangle");
            isShowing = false;
        }
//        changeState(false);
    }

//    private void changeState(boolean show) {
//        if (show == isShowing) {
//            System.out.println("Sorry, this triangle is " + (show ? "" : "not") + " showing now");
//        } else {
//            isShowing = show;
//            System.out.println((show ? "Showing " : "Hiding ") + " Triangle");
//        }
//    }

    private void changeViewState(String message) {
        String hiding = "hiding";
        String showing = "showing";

        if ((message.equals(showing) && isShowing) || (message.equals(hiding) && !isShowing)) {
            System.out.println("Sorry, this triangle is" + message + "now");
        } else {
            System.out.println(showing + "Triangle");
            if (!isShowing)
                isShowing = true;
        }
    }

}
