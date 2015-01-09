package api.application.request;

public enum Status {

    PENDING("Not checked", 0),
    APPROVED("Approved candidate", 1),
    REJECTED("Rejected candidate", -1),
    BLOCKED("Blocked candidate", -2),
    INTERVIEW("Interview appointmet", 2);

    private String message;
    private int status;

    private Status(String message, int status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
