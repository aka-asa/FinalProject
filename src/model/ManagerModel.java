package model;

import java.util.ArrayList;

public class ManagerModel extends PersonModel
{
    private long id;
    private static long idGenerator = 200000;
    private String phoneNumber;
    private String address;
    private String securityAnswer;
    private long salary;
    private static ArrayList<ManagerModel> managers = new ArrayList<ManagerModel>();
    private static ArrayList<String> criticsAndSuggestions = new ArrayList<String>();
    private static ArrayList<String> reports = new ArrayList<String>();

    public ManagerModel(String name, String lastName, String username, String password, String email, String address)
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
        ManagerModel.idGenerator = idGenerator;
    }

    public static ArrayList<String> getReports()
    {
        return reports;
    }

    public static void setReports(ArrayList<String> reports)
    {
        ManagerModel.reports = reports;
    }

    public static ArrayList<ManagerModel> getManagers()
    {
        return managers;
    }

    public static void setManagers(ArrayList<ManagerModel> managers)
    {
        ManagerModel.managers = managers;
    }

    public static ArrayList<String> getCriticsAndSuggestions()
    {
        return criticsAndSuggestions;
    }

    public static void setCriticsAndSuggestions(ArrayList<String> criticsAndSuggestions)
    {
        ManagerModel.criticsAndSuggestions = criticsAndSuggestions;
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

