public class BookIssue {
    int BookID;
    int MemberID;
    int date;
    int returndate;

    BookIssue(int BookID, int MemberID, int date, int returndate) {
        this.BookID = BookID;
        this.MemberID = MemberID;
        this.date = date;
        this.returndate = returndate;
    }

    int getBookID() {
        return BookID;
    }

    int getMemberID() {
        return MemberID;
    }

    int getdate() {
        return date;
    }

    int returndate() {
        return returndate;
    }

    void setBookID(int BookID) {
        this.BookID = BookID;
    }

    void setMemberID(int MemberID) {
        this.MemberID = MemberID;
    }

    void setDate(String date) {
        this.date = date;
    }
}
