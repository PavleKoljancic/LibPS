package lib.etickets.pinuser;

public class PinUser {
    String firstName;
    String lastName;
    public PinUser(String firstName, String lastName, String pIN) {
        this.firstName = firstName;
        this.lastName = lastName;
        PIN = pIN;
    }
    String PIN;

    public PinUser() {}

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPIN() {
        return PIN;
    }
    public void setPIN(String pIN) {
        PIN = pIN;
    }
}
