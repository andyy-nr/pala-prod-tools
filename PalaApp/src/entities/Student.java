  package entities;

/**
 * @author lopez
 * @version 1.0
 * @created 17-nov.-2022 17:35:38
 */
public class Student {

    private int Id;
    private int tabId;
    private int status;
    private String name;
    private String lastNames;
    private String email;
    private String userName;
    private String password;

    public Student() {

    }

    public Student(int Id, int tabId, int status, String name, String lastNames, 
            String email, String userName, String password) {
        this.Id = Id;
        this.tabId = tabId;
        this.status = status;
        this.name = name;
        this.lastNames = lastNames;
        this.email = email;
        this.userName = userName;
        this.password = password;
    }
    
     public Student(int status, String name, String lastNames, 
            String email, String userName, String password) {
        this.status = status;
        this.name = name;
        this.lastNames = lastNames;
        this.email = email;
        this.userName = userName;
        this.password = password;
    }
    
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getTabId() {
        return tabId;
    }

    public void setTabId(int tabId) {
        this.tabId = tabId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    

    public void logOut() {

    }

    public void logIn() {

    }

    public void SignIn() {

    }

    public void close() {

    }

}//end Student
