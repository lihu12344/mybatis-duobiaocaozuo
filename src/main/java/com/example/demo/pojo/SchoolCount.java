package com.example.demo.pojo;

import java.util.Objects;

public class SchoolCount {

    private String schoolName;
    private Integer count;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SchoolCount)) return false;
        SchoolCount that = (SchoolCount) o;
        return Objects.equals(getSchoolName(), that.getSchoolName()) &&
                Objects.equals(getCount(), that.getCount());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSchoolName(), getCount());
    }
}
