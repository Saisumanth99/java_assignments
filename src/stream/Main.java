package stream;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    List<Student> data;

    void populateList(){

        data = new ArrayList<Student>();

        data.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        data.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        data.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        data.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        data.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        data.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        data.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        data.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        data.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        data.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        data.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        data.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        data.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        data.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        data.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        data.add(new Student(266, "Sanvi Pandey", 17, "Female","Electric", 2019, 72.4));
        data.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
    }

    void getAllDept(){
        Set<String> set = data.stream()
                .map(item -> item.dept)
                .collect(Collectors.toSet());
        System.out.println(set);

    }
    void getDataByEnrolledDate(int date){
        List<String> list = data.stream()
                .filter(item -> item.year>date)
                .map(item -> item.name)
                .collect(Collectors.toList());
        System.out.println(list);
    }
    void getStudentByGender(String gender){
        List<String> list = data.stream()
                .filter(item -> item.gender.equals(gender))
                .map(item -> item.name)
                .collect(Collectors.toList());
        System.out.println(list);
    }
    long getStudentCountByGender(String gender){
        return data.stream()
                .filter(item -> item.gender.equals(gender))
                .count();

    }
    long sumOfAgeByGender(String gender){
        return data.stream()
                .filter(item -> item.gender.equals(gender))
                .map(item -> item.age)
                .reduce(0, Integer::sum);
    }
    void getMaxPercentageStudentDetails(){
        Student student = data.stream().max((item1, item2) -> item1.percentage > item2.percentage ? 1 : -1).get();
        System.out.println("name : "+student.name+", percentage : "+student.percentage);
    }
    void getCountByDept(){
        Map<String, Long> map = data.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.counting()));
        System.out.println("\n");
        for(Map.Entry<String, Long> e :map.entrySet()){
            System.out.println("dept : "+e.getKey()+", count : "+e.getValue());
        }
    }
    void getAveragePercentageByDept(){
        Map<String, Double> map = data.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.averagingDouble(Student::getPercentage)));
        System.out.println("\n");
        for(Map.Entry<String, Double> e :map.entrySet()){
            System.out.println("dept : "+e.getKey()+", avergae percentage : "+e.getValue());
        }
    }
    void getYoungestDetailsByDeptAndGender(String dept, String gender){
        Student student = data.stream()
                .filter(item -> item.dept.equals(dept) && item.gender.equals(gender))
                .min((item1, item2) -> item1.age > item2.age ? 1 : -1).get();
        System.out.println("\n\nname : "+student.name+", age : "+student.age);
    }

    long getStudentCountByDept(String dept){
        return data.stream()
                .filter(item -> item.dept.equals(dept) && (item.gender.equals("Male") || item.gender.equals("Female")))
                .count();
    }

    public static void main(String[] args) {
        Main obj =  new Main();
        obj.populateList();

        obj.getAllDept();
        obj.getDataByEnrolledDate(2018);
        obj.getStudentByGender("Male");

        System.out.println("male count : "+obj.getStudentCountByGender("Male")+" female count : "+obj.getStudentCountByGender("Female"));
        System.out.println("Average of both gender ages are : "+(obj.sumOfAgeByGender("Male") + obj.sumOfAgeByGender("Female"))/2.0);

        obj.getMaxPercentageStudentDetails();
        obj.getCountByDept();
        obj.getAveragePercentageByDept();
        obj.getYoungestDetailsByDeptAndGender("Electronic", "Male");

        System.out.println("\nmale and female in computer science dept : "+obj.getStudentCountByDept("Computer Science"));
    }
}
