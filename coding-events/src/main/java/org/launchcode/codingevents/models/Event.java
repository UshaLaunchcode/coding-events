package org.launchcode.codingevents.models;
import javax.validation.constraints.*;
import java.util.Objects;

public class Event {

    private int id;
    private static int nextId = 1;

    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @Size(max = 500, message = "Description too long!")
    private String description;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    //Add a field to collect information about where the event will take place. This field should not be null or blank.

    @NotNull(message="Location is required")
    @NotBlank(message="Location is required")
    private String location;

   // Add a field to collect information about whether an attendee must register for the event or not.
   // For the purposes of validation practice, make this field only able to be marked as true.

    @AssertTrue(message="This event must have attendees register.")
    private boolean shouldRegister = true;

    //Add a field to collect information about the number of attendees for the event.
    //Valid values for this field should be any number over zero.
    @NotNull(message = "At least one attendee is required.")
    @Min(value=1, message = "At least one attendee is required.")
    private Integer numOfAttendees;

    @NotNull(message = "Must have # of food courses between 1 and 3")
    @Min(value = 1, message = "Must have # of food courses between 1 and 3")
    @Max(value = 3, message = "Must have # of food courses between 1 and 3")
    private Integer numOfFoodCourses;

    public Event(String name, String description, String contactEmail, String location, Integer numOfAttendees) {
        this();
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
        this.numOfAttendees = numOfAttendees;

    }

    public Event(){
        this.id = nextId;
        nextId++;
    }

    public boolean isShouldRegister() {
        return shouldRegister;
    }

    public void setShouldRegister(boolean shouldRegister) {
        this.shouldRegister = shouldRegister;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getNumOfAttendees() {
        return numOfAttendees;
    }

    public void setNumOfAttendees(Integer numOfAttendees) {
        this.numOfAttendees = numOfAttendees;
    }

    public Integer getNumOfFoodCourses() {
        return numOfFoodCourses;
    }

    public void setNumOfFoodCourses(Integer numOfFoodCourses) {
        this.numOfFoodCourses = numOfFoodCourses;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
