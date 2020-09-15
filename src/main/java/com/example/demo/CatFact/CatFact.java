package com.example.demo.CatFact;
import java.util.Date;

public class CatFact implements Comparable<CatFact> {




    private String text;
    private Date createdAt;



    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        text = text;
    }


    @Override
    public String toString() {
        return "text{" +
                "text='" + text + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }


    public CatFact(String text) {

        this.text = text;
    }


    @Override
    public int compareTo(CatFact o) {
        if (getCreatedAt().compareTo(this.createdAt) > 0){
            return 1;
        }
        if (getCreatedAt().compareTo(this.createdAt) < 0) {
            return -1;
        }
        return 0;
    }
}
