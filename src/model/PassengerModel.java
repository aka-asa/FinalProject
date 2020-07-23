package model;

import java.util.ArrayList;

public class PassengerModel extends PersonModel
{
    private String phoneNumber;
    private long credit;
    private ArrayList <TicketModel> tickets = new ArrayList<TicketModel>();
    private static ArrayList<PassengerModel> passengers = new ArrayList<PassengerModel>();

    public PassengerModel(String name, String lastName, String username, String password, String email, String phoneNumber, long credit)
    {
        super(name, lastName, username, password, email);
        setId(getId()+7300000);
        this.phoneNumber = phoneNumber;
        this.credit = credit;
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

}
