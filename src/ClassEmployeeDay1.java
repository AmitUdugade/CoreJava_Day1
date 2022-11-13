public class ClassEmployeeDay1 {
    public static void main(String[] args) {
        System.out.println("This is Sample Data of Employee ");

        Employee obj1 = new Employee();
        obj1.setEmpid(1);
        obj1.setName("Amit Udugade");
        obj1.setDesignation("Software Developer");
        obj1.setPhoneno("8880808880");

        System.out.println("-----------------------------------------------");
        System.out.println("Employee Details");
        System.out.println("ID : " +obj1.getEmpid());
        System.out.println("Name : " +obj1.getName());
        System.out.println("Designation : " +obj1.getDesignation());
        System.out.println("Phone Number : " +obj1.getPhoneno());
    }
}
