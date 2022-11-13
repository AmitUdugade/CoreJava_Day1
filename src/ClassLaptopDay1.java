public class ClassLaptopDay1 {
    public static void main(String[] args) {
        System.out.println("This is Sample Data of Laptop ");
        Laptop obj1 = new Laptop();
        obj1.setCpu("I3");
        obj1.setScreensize(15.6f);
        obj1.setDisplaytype("IPS");
        obj1.setBattery("4Hrs");

        System.out.println("--------------------------------------");
        System.out.println("CPU : " +obj1.getCpu());
        System.out.println("Screen Size : " +obj1.getScreensize());
        System.out.println("Display Type : " +obj1.getDisplaytype());
        System.out.println("Battery : " +obj1.getBattery());

    }
}
