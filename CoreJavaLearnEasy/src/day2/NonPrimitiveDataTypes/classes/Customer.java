package day2.NonPrimitiveDataTypes.classes;

public class Customer {
    String customer_name="Avanthi";
    long emplyeeId=1528965l;
    int salary=50000;

    public static void main(String[] args) {
        //object creation for the class
        Customer objCustomer=new Customer();

        //call the method
        objCustomer.getCustomerDetails();
    }

    private void getCustomerDetails() {
        System.out.println("Customer name:" + customer_name);
        System.out.println("Employee Id:" + emplyeeId);
        System.out.println("Salary: " + salary);
    }
}
