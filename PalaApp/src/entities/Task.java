package entities;

import java.util.Date;

/**
 * @author lopez
 * @version 1.0
 * @created 17-nov.-2022 17:35:44
 */
public class Task {

    private int studentId;
    private String description;
    private StatusTask status;
    private int timeLeft;
    private String dueDate;

    public Task() {

    }

    public Task(int id, String description, StatusTask status) {
        this.studentId = id;
        this.status = status;
        this.description = description;
        
    }

    public Task(String description, StatusTask status, String dueDate) {
        this.description = description;
        this.status = status;
        this.dueDate = dueDate;
    }

    public void edit() {

    }

    public void delete() {

    }

    public void move() {

    }

    public void daysLeft() {
        
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StatusTask getStatus() {
        return status;
    }

    public void setStatus(StatusTask status) {
        this.status = status;
    }

    public int getTimeLeft() {
        return timeLeft;
    }

    public void setTimeLeft(int timeLeft) {
        this.timeLeft = timeLeft;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

}//end Task
