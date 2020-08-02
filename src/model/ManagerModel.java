package model;

import java.util.ArrayList;

public class ManagerModel extends PersonModel
{
    private String phoneNumber;
    private String address;
    private long salary = 0;
    private static ArrayList<ManagerModel> managers = new ArrayList<ManagerModel>();
    private static ArrayList<String> criticsAndSuggestions = new ArrayList<String>();

    public ManagerModel(String name, String lastName, String username, String password, String email, String address)
    {
        super(name, lastName, username, password, email);
        setId(getId()-500000);
//        this.phoneNumber = phoneNumber;
        this.address = address;
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
}

