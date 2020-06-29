package controller;

import view.PersonView;
import view.TicketView;

public class PersonController implements Showable
{
    private PersonView personView;

    public void show()
    {
        personView = new PersonView();
        personView.getStage().show();
    }

    public PersonView getPersonView()
    {
        return personView;
    }

    public void setPersonView(PersonView personView)
    {
        this.personView = personView;
    }
}
