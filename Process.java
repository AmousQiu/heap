public class Process {
    private int id;
    private int timeReqd;
    private int priority;
    private int timeArrival;

    public Process(int id, int timeReqd, int priority, int timeArrival) {
        this.id = id;
        this.timeReqd = timeReqd;
        this.priority = priority;
        this.timeArrival = timeArrival;
    }

    public int getTimeReqd() {
        return timeReqd;
    }

    public void setTimeReqd(int timeReqd) {
        this.timeReqd = timeReqd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getTimeArrival() {
        return timeArrival;
    }

    public void setTimeArrival(int timeArrival) {
        this.timeArrival = timeArrival;
    }
}
