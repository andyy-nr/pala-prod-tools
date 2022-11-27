package entities;

import java.util.Date;

/**
 * @author lopez
 * @version 1.0
 * @created 17-nov.-2022 17:35:44
 */
public class Task {

    private int taskId;
    private int studentId;
    private String description;
    private StatusTask status;

    public Task() {

    }

    public Task(String description, int taskId) {
        this.description = description;
        this.taskId = taskId;
    }

    public Task(int taskId, int studentId, String description, StatusTask status) {
        this.taskId = taskId;
        this.studentId = studentId;
        this.description = description;
        this.status = status;
    }
    

    public Task(int id, String description, StatusTask status) {
        this.studentId = id;
        this.status = status;
        this.description = description;

    }
    

    public Task(String description, StatusTask status) {
        this.description = description;
        this.status = status;
    }

    public Task(StatusTask status) {
        this.status = status;
        
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

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

}//end Task
