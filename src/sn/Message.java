package sn;

import java.util.Date;

public class Message {
    private long id;

    private User fromUser;
    private User toUser;

    private String msg;

    private Date dateSent;
    private Date dateRead;

    private boolean isRead;

    private MsgType msgType;

    public Message(User fromUser, User toUser, String msg) {
        this.id = (long) Math.random() * 100;
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.msg = msg;

        this.dateSent = new Date();
        this.dateRead = null;

        this.isRead = false;
    }

    public long getId() {
        return id;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public void setDateRead(Date dateRead) {
        this.dateRead = dateRead;
    }

    public void setMsgType(MsgType msgType) {
        this.msgType = msgType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Message{");
        sb.append("id=").append(id);
        sb.append(", fromUser=").append(fromUser);
        sb.append(", toUser=").append(toUser);
        sb.append(", msg='").append(msg).append('\'');
        sb.append(", dateSent=").append(dateSent);
        sb.append(", dateRead=").append(dateRead);
        sb.append(", isRead=").append(isRead);
        sb.append(", msgType=").append(msgType);
        sb.append('}');
        return sb.toString();
    }
}
