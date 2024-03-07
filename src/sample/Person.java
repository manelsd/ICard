package sample;


import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class Person {

    private String firstName;

    private String email;
    private String address;
    private String birthday;
    private String telephone;
    private String site;
    private String photo;


    public Person(String firstName,  String email, String birthday, String telephone, String site, String adress , String photo) {
        this.firstName = firstName;
        this.email = email;
        this.birthday = birthday;
        this.telephone = telephone;
        this.site = site;
        this.address = adress;
        this.photo = photo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getBirthday() {
        return this.firstName.charAt(0)+ birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", birthday='" + birthday + '\'' +
                ", telephone='" + telephone + '\'' +
                ", site='" + site + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}

