package controller;

import model.PersonModel;
import view.PersonView;
import view.TicketView;

public class PersonController implements Showable
{
    private PersonView personView;

    public void show()
    {
        personView = new PersonView();
        for (int i = 0; i< PersonModel.getPersons().size() ; i++)
        {
            personView.getTableView().getItems().add(PersonModel.getPersons().get(i));
        }
        personView.getStage().setTitle("Show Persons");
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
