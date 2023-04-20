public class AadharDetails {
    private String name;
    private long mobileNumber;
    private long aadharnumber;

    public AadharDetails(String name, long mobileNumber, long aadharnumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.aadharnumber = aadharnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public long getAadharnumber() {
        return aadharnumber;
    }

    public void setAadharnumber(long aadharnumber) {
        this.aadharnumber = aadharnumber;
    }
}