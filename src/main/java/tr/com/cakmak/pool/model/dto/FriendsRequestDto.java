package tr.com.cakmak.pool.model.dto;

import java.io.Serializable;

public class FriendsRequestDto implements Serializable {

    private int userId;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String degreeOfProximity;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDegreeOfProximity() {
        return degreeOfProximity;
    }

    public void setDegreeOfProximity(String degreeOfProximity) {
        this.degreeOfProximity = degreeOfProximity;
    }
}
