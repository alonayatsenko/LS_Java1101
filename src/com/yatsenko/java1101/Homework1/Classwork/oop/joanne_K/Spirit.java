package com.yatsenko.java1101.Homework1.Classwork.oop.joanne_K;

public class Spirit {
    /*@javadoc
     *прозрачность
     */
    private float transparency;
    /*@javadoc
     *безтелесность может быть от 0 до 1
     */
    private float incorporeality;
    private Temperament temperament;
    private String name;
    private String location;
    private String description;
    private Sex sex;

    public Spirit (){
    }

    public Spirit(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String changelocation(){
       // return null;
        return "I changed my location";
    }
    public String speak (){
        return "I'm Groot";
    }
    public String think (){
        return "I am Groot";
    }

    public float getTransparency() {
        return transparency;
    }

    public void setTransparency(float transparency) {
        this.transparency = transparency;
    }

    public float getIncorporeality() {
        return incorporeality;
    }

    public void setIncorporeality(float incorporeality) {
        this.incorporeality = incorporeality;
    }

    public Temperament getTemperament() {
        return temperament;
    }

    public void setTemperament(Temperament temperament) {
        this.temperament = temperament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
