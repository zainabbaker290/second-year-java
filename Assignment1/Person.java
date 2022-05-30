package com.company.Assignment1;

import java.util.Objects;

public class Person {
    //enumerator class

    //instance variables
    private String name;
    public Gender gender; //making gender the class type Gender
    private String location;
    private String skill;
    private int yearsOfExperience;

    //constructor
    public Person(String newName,Gender theGender,String newLocation){
        gender = theGender;
        //if gender does not equal any of our set values, it wil equal to other
        if (!theGender.equals(Gender.Male) && !theGender.equals(Gender.Female) &&
                !theGender.equals(Gender.NonBinary)) {
            theGender.equals(Gender.Other);
        }
        name = newName;
        location = newLocation;
    }

    //getters
    public String getName() {
        return name;
    }
    /**
     * This method checks for which enumerated type is the gender.Using switch case to check
     *
     * @param gender - a new skill
     *
     * @return  applicants gender- returns applicants gender in the form of a string so we can print it later on
     */
    public String getGender(Gender gender) {
        String applicants_gender = "";
        switch (gender) {
            case Male -> {
                applicants_gender = "male";
                return applicants_gender;
            }
            case Female -> {
                applicants_gender = "Female";
                return applicants_gender;
            }
            case NonBinary -> {
                applicants_gender = "non binary";
                return applicants_gender;
            }
            case Other -> {
                applicants_gender = "prefer not to say";
                return applicants_gender;
            }
        }
        return applicants_gender;
    }
    public String getLocation() {
        return location;
    }
    public String getSkill() {
        return skill;
    }
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    //methods
    /**
     * This method adds a skill to a person. In this program, a person need not have
     * a skill. A new skill overrides the previous skill.
     *
     * @param newSkill - a new skill
     * @param years - years of experience of the applicant for the given
     * skill. Negative values are not accepted.
     * @param isOutputON - if this parameter is set to true, the added skill
     * is printed on the screen. If not, the new added
     * skill is not printed.
     */
    public void addSkill(String newSkill, int years, boolean isOutputON){
        skill = newSkill;
        yearsOfExperience = years;
       if (isOutputON) {
           System.out.println(name + " has a new skill = " + newSkill + " and the years of experience obtained is " + years);
       }
    }

    //overriding string method
    @Override
    public String toString(){
        return "name: " + getName()+ " gender: " + getGender(gender) + " location: "+ getLocation();
    }

    //equals method
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person p = (Person) obj;
        return (name.equals(p.name) && Objects.equals(getGender(gender), p.getGender(gender)) && location.equals(p.location));
    }

}

