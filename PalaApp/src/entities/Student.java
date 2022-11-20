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

    public Student(int Id, int tabId, int status, String name, String lastNames, String email, String userName, String password) {
        this.Id = Id;
        this.tabId = tabId;
        this.status = status;
        this.name = name;
        this.lastNames = lastNames;
        this.email = email;
        this.userName = userName;
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
