package model;

import java.util.ArrayList;

public class EmployeeModel extends PersonModel
{
    private String phoneNumber;
    private String address;
    private long salary;
    private static ArrayList<EmployeeModel> employees = new ArrayList<EmployeeModel>();

    public EmployeeModel(String name, String lastName, String username, String password, String email, String address)
    {
        super(name, lastName, username, password, email);
        setId(getId()-400000);
        this.address = address;
    }

    public static ArrayList<EmployeeModel> getEmployees()
    {
        return employees;
    }

    public static void setEmployees(ArrayList<EmployeeModel> employees)
    {
        EmployeeModel.employees = employees;
    }

    public String getPhoneNumber ()
    {
        return phoneNumber;
    }

    public void setPhoneNumber (String phoneNumber)
    {
        if (phoneNumber.charAt(0) == '0')
        {
            phoneNumber = phoneNumber.replaceFirst("0", "98");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public long getSalary()
    {
        return salary;
    }

    public void setSalary(long salary)
    {
        this.salary = salary;
    }
}

