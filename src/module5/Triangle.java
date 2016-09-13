package module5;

public class Triangle {

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
//        changeViewState("hiding");
    }

    private void changeViewState(String message) {
       String hiding = "hiding";
        String showing = "showing";

        if (message.equals(showing) && isShowing || message.equals(hiding) && !isShowing) {
            System.out.println("Sorry, this triangle is" + message + "now");
        } else {
            System.out.println(showing  + "Triangle");
            if(!isShowing)
            isShowing = true;
        }

    }

    public boolean isShowing() {
        return isShowing;
    }
}

