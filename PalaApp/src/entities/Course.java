package entities;

import java.util.ArrayList;

/**
 * @author lopez
 * @version 1.0
 * @created 17-nov.-2022 17:35:41
 */
public class Course {

    private String name;
    private int CourseID;
    private ArrayList<Task> tasks;

    public Course() {

    }

    public Course(String name) {
        this.name = name;
    }

    public Course(String name, int ID) {
        this.name = name;
        this.CourseID = ID;
    }

    public Course(String name, ArrayList<Task> tasks) {
        this.name = name;
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public int getID() {
        return CourseID;
    }

    public void setID(int CourseID) {
        this.CourseID = CourseID;
    }

}//end Course
