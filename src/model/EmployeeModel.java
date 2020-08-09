package model;

import java.util.ArrayList;

public class EmployeeModel extends PersonModel
{
    private long id;
    private static long idGenerator = 300000;
    private String phoneNumber;
    private String address;
    private String securityAnswer;
    private long salary;
    private static ArrayList<EmployeeModel> employees = new ArrayList<EmployeeModel>();

    public EmployeeModel(String name, String lastName, String username, String password, String email, String address)
    {
        super(name, lastName, username, password, email);
        idGenerator++;
        this.id = idGenerator;
        this.address = address;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public static long getIdGenerator()
    {
        return idGenerator;
    }

    public static void setIdGenerator(long idGenerator)
    {
        EmployeeModel.idGenerator = idGenerator;
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

    public String getSecurityAnswer()
    {
        return securityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer)
    {
        this.securityAnswer = securityAnswer;
    }
}

