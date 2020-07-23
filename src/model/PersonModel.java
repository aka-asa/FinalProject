package model;

import java.util.ArrayList;

public class PersonModel
{
    private long id ;
    private static long idGenerator = 700000;
    private String name;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private static ArrayList <PersonModel> persons = new ArrayList<PersonModel>();

    public PersonModel(String name, String lastName, String username, String password, String email)
    {
        idGenerator++;
        id = idGenerator;
        this.name = name;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public static ArrayList<PersonModel> getPersons()
    {
        return persons;
    }

    public static void setPersons(ArrayList<PersonModel> persons)
    {
        PersonModel.persons = persons;
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
        PersonModel.idGenerator = idGenerator;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }


}
