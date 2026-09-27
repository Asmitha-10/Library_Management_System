public class Members {
    int memID;
    String memName;
    long phNo;

    Members(int memID, String memName, long phNo) {
        this.memID = memID;
        this.memName = memName;
        this.phNo = phNo;
    }

    int getmemID() {
        return memID;
    }

    String getmemName() {
        return memName;
    }

    long getphNo() {
        return phNo;
    }
}
