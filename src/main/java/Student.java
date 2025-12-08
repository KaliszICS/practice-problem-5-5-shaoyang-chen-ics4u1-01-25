public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private int studentNumber;
    public Student(String name, int age, int studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getStudentNumber() {
        return studentNumber;
    }
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    @Override
    public String toString() {
        return "N:" + this.name + " A:" + this.age + " SN:" + this.studentNumber;
    }
    @Override
    public int compareTo(Student given) {
        return this.studentNumber - given.studentNumber;
    }
}
