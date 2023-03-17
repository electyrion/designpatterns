# test

Commonly used in mobile apps development

## Model

Holds all the data, state, and logic of the application.

## View

Displays the data to the user. The view is responsible for displaying the data (the model) and routing user commands (events) to the appropriate controller method. The view is not responsible for any of the application logic. It is only responsible for displaying the data and routing user commands to the controller.
    Gives user a presentation of the model.

## Presenter

The presenter is responsible for handling user input and performing interactions on the data (model) and the view. It receives user input from the view and then performs interactions on the model and the view. The presenter is the only part of the application that is allowed to `directly access the model`. The presenter is also the only part of the application that is allowed to directly access the view.
