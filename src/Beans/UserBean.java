package Beans;

public class UserBean {
    private String userID;
    private String firstName;
    private String lastName;
    private String photoUrl;

    public String getUserID() {
        return userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
