public class Lending {
    private String lendingDate;
    private String returnDate;
    private Book book;
    private User user;

    public String getLenfingDate() {
        return lendingDate;
    }

    public void setLenfingDate(String lenfingDate) {
        this.lendingDate = lenfingDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
}
