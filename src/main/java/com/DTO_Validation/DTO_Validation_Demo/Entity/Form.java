package com.DTO_Validation.DTO_Validation_Demo.Entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Form {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int f_id;
    @NotBlank(message = "Empty name Can not inserted")
    @NotNull
    @NotEmpty
    @Size(min = 4, message = "User Name Should have at least 4 characters")
    private String name;
    @Email(message = "Enter a Valid Email")
    @NotBlank
    private String email;
    @Digits(fraction = 0, integer = 10)
    private int phone;
    @NotBlank
    @Size(min = 8, max = 16, message = "Password should Atleast 8 Characters")
    private String password;

    public Form() {
    }

    public Form(int f_id, String name, String email, int phone, String password) {
        this.f_id = f_id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public int getF_id() {
        return f_id;
    }

    public void setF_id(int f_id) {
        this.f_id = f_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Form{" +
                "f_id=" + f_id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", password='" + password + '\'' +
                '}';
    }
}
