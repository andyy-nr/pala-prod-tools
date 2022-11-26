/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Andrea Nunez
 */
public class CourseTask {

    private int CourseID;
    private int TaskID;

    public CourseTask(int CourseID, int TaskID) {
        this.CourseID = CourseID;
        this.TaskID = TaskID;
    }

    public CourseTask() {
    }

    public int getCourseID() {
        return CourseID;
    }

    public void setCourseID(int CourseID) {
        this.CourseID = CourseID;
    }

    public int getTaskID() {
        return TaskID;
    }

    public void setTaskID(int TaskID) {
        this.TaskID = TaskID;
    }

}
