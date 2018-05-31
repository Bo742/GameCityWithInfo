package com.company;

public class Count {
    int count;

    public Count(Integer countNew) {
        count = countNew;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount() {
        count = count - 1;
    }
    public void setDefCount(Integer countNew){
        count=countNew;
    }
}
