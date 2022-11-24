package entities;

import java.util.Date;

/**
 * @author lopez
 * @version 1.0
 * @created 17-nov.-2022 17:35:44
 */
public class Task {

    private String description;
    private StatusTask status;
    private int timeLeft;
    private Date vencimiento;

    public Task() {

    }

    public Task(String description, StatusTask status, Date vencimiento, int timeLeft) {
        this.description = description;
        this.status = status;
        this.vencimiento = vencimiento;
        this.timeLeft = timeLeft;
    }

    public void edit() {

    }

    public void delete() {

    }

    public void move() {

    }
    
    public void daysLeft(){
        
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

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

}//end Task
