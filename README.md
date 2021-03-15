# coding-events

You should write three sections. 

The first should describe the purpose of the app. 
The application allows users to create, save and edit coding events around town. Users are also able to create categories and tags for the events
for better searching and enhanced detail.

The second should describe the current state of the app. 
Currrently the user is able to save , edit and create events that have various detail.The events are stored in MySQL database, connected through
Hibernate,The styling is created through bootstrap.

The third and final section should describe the future improvements you want to make to the app including your notes about the Person class.
Future improvements include the Person class.Where we want to include a class to capture user information, for storing and relating to proper events.
As well as to remeber the user when they revisit the site.

Proposed Structure:
Fields:
- Name
- Email
- Password
- List Of Events (Event class) : Many to Many
- Favorite Category (EventCategory class) :One to Many
