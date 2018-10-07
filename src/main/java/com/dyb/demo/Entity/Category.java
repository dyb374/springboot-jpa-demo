package com.dyb.demo.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "category")
public class Category implements Serializable {
    private static final long serialVersionUID = 8655851615465363473L;
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "num")
    private Integer num11;/*对应dao中自动生成的字段*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum11() {
        return num11;
    }

    public void setNum11(Integer num11) {
        this.num11 = num11;
    }

    public Category() {
    }
}
