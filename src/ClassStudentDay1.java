public class ClassStudentDay1 {
    public static void main(String[] args) {

        //Day1 Demo
        System.out.println("This is Day1 of the class");
        Student obj1 = new Student();
        obj1.setName("Amit");
        obj1.setRollno(1);
        obj1.setStandard(10);
        obj1.setMarks(90);

        //print the name
        System.out.println("Student details : ");
        System.out.println("Name : " +obj1.getName());
        System.out.println("Makrs : " +obj1.getMarks());
        System.out.println("Roll No : " +obj1.getRollno());
        System.out.println("Standard : " +obj1.getStandard());
    }
}
