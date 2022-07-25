package tr.com.cakmak.pool.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "friends",schema = "pool")
public class Friends {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "users_id", referencedColumnName = "id")
    private Users users;
    //@ManyToOne
    //Users users;
    //@Column(name = "user_id")
    //private long usersId=users.getId();
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "email",unique = true)
    private String email;
    @Column(name = "phone",unique = true)
    private String phone;
    @Column(name = "degree_of_proximity",nullable = false)
    private String degreeOfProximity;


    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
