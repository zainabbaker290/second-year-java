package com.company.Assignment1;

public class MatchingSystem {

    //instance variables
    public JobDescription[] jobs;
    public Person[] applicants;
    public int numberOfJobs;
    public int numberOfApplicants;
    public int maximumNumberOfJobs;
    public int maximumNumberOfApplicants;

    //constructor for MatchingSystem
    public MatchingSystem(){
        maximumNumberOfApplicants = 6;
        maximumNumberOfJobs = 3;
        jobs = new JobDescription[maximumNumberOfJobs];
        applicants = new Person[maximumNumberOfApplicants];
    }
    /**
     * This method receives as input a job description and adds it as the next
     * element to the job array. If the job array is not full, and the new job is
     * successfully added, an acknowledgement message is printed on the screen
     * along with the total number of jobs in the system.
     *
     * @param jobDesc - job description
     */
    public void addJob(JobDescription jobDesc){
        for (int i = 0; i < jobs.length; i++) {
            if(jobs[i] == null){
                jobs[i] = jobDesc;
                numberOfJobs = i + 1;
                System.out.println("["+ jobs[i] + "] job has been successfully added. " + "Current number of jobs in system = " + numberOfJobs);
                break;
            }
        }
    }

    /**
     * This method receives as input an applicant person profile and adds it as the
     * next element to the applicants array. If the person array is not full and the new
     * Person could be successfully added, an acknowledgement message is printed on
     * the screen along with the total number of applicants in the system.
     *
     * @param personProfile - a person profile
     */
    public void addApplicant(Person personProfile){
        for (int i = 0; i < applicants.length; i++) {
            if(applicants[i] == null ) {
                applicants[i] = personProfile;
                numberOfApplicants= i + 1;
                System.out.println(applicants[i]);
                break;
            }
        }
        System.out.println("person profile is added. There are currently " + numberOfApplicants + " applicants in the system");
    }

    /**
     * This method lists all (job description - applicant) matches.
     * In order for a person to be matched to a job, the following
     * must be satisfied: ( job and person must be in the same city ) AND ( the
     * person's skill must match the skill required by the job ) AND ( the person
     * must meet the minimum years of experience ).
     3
     *
     * @return the total number of suitable assignments
     */
    public int listSuitableAssignments(){
        int count = 0;
        for(int i = 0; i < applicants.length; i++){
            if(applicants[i] != null){
                for(int j = 0; j < jobs.length; j++) {
                    if (jobs[j] != null) {
                        if (applicants[i].getLocation().equals(jobs[j].getLocation())){
                            if (applicants[i].getYearsOfExperience() >= jobs[j].getYearsOfExperienceRequired()){
                                if (applicants[i].getSkill().equals(jobs[j].getSkillRequired())) {
                                    count++;
                                    System.out.println("match found: " + applicants[i] + " " + jobs[j]);
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);return count;
    }


}
