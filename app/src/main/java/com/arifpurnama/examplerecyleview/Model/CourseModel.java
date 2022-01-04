package com.arifpurnama.examplerecyleview.Model;

public class CourseModel {
    private String course_name;
    private int course_rating;
    private int couse_image;

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public int getCourse_rating() {
        return course_rating;
    }

    public void setCourse_rating(int course_rating) {
        this.course_rating = course_rating;
    }

    public int getCouse_image() {
        return couse_image;
    }

    public void setCouse_image(int couse_image) {
        this.couse_image = couse_image;
    }

    public CourseModel(String course_name, int course_rating, int couse_image) {
        this.course_name = course_name;
        this.course_rating = course_rating;
        this.couse_image = couse_image;
    }
}
