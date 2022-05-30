package com.company.Assignment1;
public class JobDescription {
    //instance variables
    private String location;
    private String company;
    private String skillRequired;
    private int yearsOfExperienceRequired;

    //constructor
    public JobDescription(String newLocation, String newCompany, String skill, int years){
        location = newLocation;
        company = newCompany;
        skillRequired= skill;
        yearsOfExperienceRequired = years;
    }

    //getters
    public String getLocation() {return location;}
    public String getCompany() {return company;}
    public String getSkillRequired() {
        return skillRequired;
    }
    public int getYearsOfExperienceRequired() {
        return yearsOfExperienceRequired;
    }

    //string method
    @Override
    public String toString(){
        return location + " " + company + " " + skillRequired;
    }
}


