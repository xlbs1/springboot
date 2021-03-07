package com.lsh.springboot.model;

import lombok.Data;

@Data
public class Student {
    private Integer sid;

    private String sname;

    private String sage;

    public Student(Integer sid, String sname, String sage) {
        this.sid = sid;
        this.sname = sname;
        this.sage = sage;
    }

    public Student() {
        super();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSage() {
        return sage;
    }

    public void setSage(String sage) {
        this.sage = sage;
    }
}