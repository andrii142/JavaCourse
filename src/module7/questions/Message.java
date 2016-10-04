package module7.questions;

import java.util.Comparator;

public class Message implements Comparable<Message> {
    private String msg;
    private String deviceName;

    public Message(String msg, String deviceName) {
        this.msg = msg;
        this.deviceName = deviceName;
    }


    @Override
    public int compareTo(Message message) {
        //use anything you want
        int res = this.getDeviceName().length() - message.getDeviceName().length();

        //TODO equals
        if(res == 0) {
            boolean eqRes = equals(message);

            if(eqRes == true) return 0;

            //TODO;
            else return -1;
        }

        return res;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Message message = (Message) object;

        if (!msg.equals(message.msg)) return false;
        return deviceName.equals(message.deviceName);

    }

    @Override
    public int hashCode() {
        int result = msg.hashCode();
        result = 31 * result + deviceName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Message{" +
                "msg='" + msg + '\'' +
                ", deviceName='" + deviceName + '\'' +
                '}';
    }

    public String getMsg() {
        return msg;
    }

    public String getDeviceName() {
        return deviceName;
    }
}
