package com.berti.notes.model;

public class Interview {

    public String name;

    protected String question1;

    public Interview subInterview;

    private boolean fake;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuestion1() {
        return question1;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    public Interview getSubInterview() {
        return subInterview;
    }

    public void setSubInterview(Interview subInterview) {
        this.subInterview = subInterview;
    }

    public boolean isFake() {
        return fake;
    }

    public void setFake(boolean fake) {
        this.fake = fake;
    }
}
