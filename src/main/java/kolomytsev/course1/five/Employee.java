package kolomytsev.course1.five;

public class Employee {
    private String name;
    private String surname;
    private String fullName;
    private int age;
    private String jobTitle;
    private String email;
    private long telephone;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee() {
    }

    public Employee(String name, String surname, String fullName, int age, String jobTitle, String email, long telephone, int salary) {
        this.name = name;
        this.surname = surname;
        this.fullName = fullName;
        this.age = age;
        this.jobTitle = jobTitle;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
    }

    public void informationEmployee(){
        System.out.print(name + " ");
        System.out.print(surname + " ");
        System.out.print(fullName + " ");
        System.out.print(age + " ");
        System.out.print(jobTitle + " ");
        System.out.print(email + " ");
        System.out.print(telephone + " ");
        System.out.print(salary);
    }

    public String info(){
        return String.format("Employee{name=%s, surname=%s, fullName=%s, age=%s, jobTitle=%s, email=%s, telephone=%s, slsry=%s}",name, surname, fullName, age, jobTitle, email,telephone, salary);
    }


}
