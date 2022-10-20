package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }




// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
@Override
public boolean equals(Object o) {  // Two objects are equal if they have the same id.
    if (this == o) return true;
    if (!(o instanceof Job)) return false;
    Job job = (Job) o;
    return getId() == job.getId();
}

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }


    public String toString(Job myJobObject) {
        String nameResult = "";
        String employerResult = "";
        String locationResult = "";
        String positionTypeResult = "";
        String coreCompetencyResult = "";

        if(myJobObject.name.isEmpty()) {
            nameResult = "Data not available";
        }
        else {
            nameResult = myJobObject.name;
        }
        if(myJobObject.employer.toString().isEmpty()) {
            employerResult = "Data not available";
        }
        else {
            employerResult = myJobObject.employer.toString();
        }
        if(myJobObject.location.toString().isEmpty()) {
            locationResult = "Data not available";
        }
        else {
            locationResult = myJobObject.location.toString();
        }
        if(myJobObject.positionType.toString().isEmpty()) {
            positionTypeResult = "Data not available";
        }
        else {
            positionTypeResult = myJobObject.positionType.toString();
        }
        if(myJobObject.coreCompetency.toString().isEmpty()) {
            coreCompetencyResult = "Data not available";
        }
        else {
            coreCompetencyResult = myJobObject.coreCompetency.toString();
        }

        return  "\n" + "ID: " + myJobObject.id +
                "\n" +"Name: " + nameResult +
                "\n"+"Employer: " + employerResult +
                "\n" +"Location: " + locationResult +
                "\n" +"Position Type: " + positionTypeResult +
                "\n" +"Core Competency: " + coreCompetencyResult +
                "\n";

    }

    public String toString() {
        String nameResult = "";
        String employerResult = "";
        String locationResult = "";
        String positionTypeResult = "";
        String coreCompetencyResult = "";

        if(this.name.isEmpty()) {
            nameResult = "Data not available";
        }
        else {
            nameResult = this.name;
        }
        if(this.employer.toString().isEmpty()) {
            employerResult = "Data not available";
        }
        else {
            employerResult = this.employer.toString();
        }
        if(this.location.toString().isEmpty()) {
            locationResult = "Data not available";
        }
        else {
            locationResult = this.location.toString();
        }
        if(this.positionType.toString().isEmpty()) {
            positionTypeResult = "Data not available";
        }
        else {
            positionTypeResult = this.positionType.toString();
        }
        if(this.coreCompetency.toString().isEmpty()) {
            coreCompetencyResult = "Data not available";
        }
        else {
            coreCompetencyResult = this.coreCompetency.toString();
        }
        return  "\n" + "ID: " + this.id +
                "\n" +"Name: " + nameResult +
                "\n"+"Employer: " + employerResult +
                "\n" +"Location: " + locationResult +
                "\n" +"Position Type: " + positionTypeResult +
                "\n" +"Core Competency: " + coreCompetencyResult +
                "\n";

    }


}
