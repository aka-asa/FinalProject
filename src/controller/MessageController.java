package controller;

import view.MessageView;

public class MessageController
{
    private MessageView messageView;

    public MessageController (String message)
    {
        messageView = new MessageView(message);
        messageView.getStage().setTitle("Message");
        messageView.getStage().show();
    }


}
