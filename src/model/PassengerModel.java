package model;

import java.util.ArrayList;

public class PassengerModel extends PersonModel
{
    private long id;
    private static long idGenerator = 8000000;
    private String phoneNumber;
    private long credit = 0;
    private String securityAnswer;
    private ArrayList <TicketModel> tickets = new ArrayList<TicketModel>();
    private static ArrayList<PassengerModel> passengers = new ArrayList<PassengerModel>();

    public PassengerModel(String name, String lastName, String username, String password, String email)
    {
        super(name, lastName, username, password, email);
        idGenerator++;
        id = idGenerator;
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
        PassengerModel.idGenerator = idGenerator;
    }

    public ArrayList<TicketModel> getTickets()
    {
        return tickets;
    }

    public void setTickets(ArrayList<TicketModel> tickets)
    {
        this.tickets = tickets;
    }

    public static ArrayList<PassengerModel> getPassengers ()
        {
            return passengers;
        }

        public static void setPassengers (ArrayList < PassengerModel > passengers)
        {
            PassengerModel.passengers = passengers;
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

        public long getCredit ()
        {
            return credit;
        }

        public void setCredit ( long credit)
        {
            this.credit = credit;
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
