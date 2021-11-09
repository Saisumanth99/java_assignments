package stream;

public class Student {
    int id;
    String name;
    int age;
    String gender;
    String dept;
    int year;
    double percentage;

    public Student(int id, String name, int age, String gender, String dept,int year, double percentage) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dept = dept;
        this.year = year;
        this.percentage = percentage;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDept() {
        return dept;
    }

    public int getYear() {
        return year;
    }

    public double getPercentage() {
        return percentage;
    }
}
