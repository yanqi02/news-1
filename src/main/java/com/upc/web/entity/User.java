package com.upc.web.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    private int id;
    private String username;
    private String passward;
    private Integer vip;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "USERNAME")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "PASSWARD")
    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }

    @Basic
    @Column(name = "VIP")
    public Integer getVip() {
        return vip;
    }

    public void setVip(Integer vip) {
        this.vip = vip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass ( ) != o.getClass ( )) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (username != null ? !username.equals (user.username) : user.username != null) return false;
        if (passward != null ? !passward.equals (user.passward) : user.passward != null) return false;
        if (vip != null ? !vip.equals (user.vip) : user.vip != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode ( ) : 0);
        result = 31 * result + (passward != null ? passward.hashCode ( ) : 0);
        result = 31 * result + (vip != null ? vip.hashCode ( ) : 0);
        return result;
    }
}
