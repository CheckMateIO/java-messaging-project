## CheckMate's Java Engineer Coding Challenge

One of the coolest parts of CheckMate's product is a direct messaging platform that lets guests and hotels communicate with each other via SMS and email.  Today we're going to build a simplified messaging program that will let a guest message a hotel directly.

### Features / Assumptions:
* There is a single shared channel used by all connected "hotel" users (no rooms or authentication needed).
* When a new user visits the application they should be asked to provide a (required) screen name.  There is no signup/login requirement.
* After providing a screen name, they are dropped into the shared chat room where they can see a list of all active conversations with each conversation's phone number displayed.
* A button is provided somewhere in the UI to start a new conversation with a "guest". This displays a form to collect the guest's mobile phone number so SMS messages can be sent to the guest.
* The chat interface should show messages from the hotel on the right side and messages from the "guest" on the left side very similar to iMessage or FB Messenger or… pretty much any chat client.
* Each message should indicate who sent the message and when it was sent.
* There should be a UI element at the bottom of the chat interface to send a new message to the guest.
* The UI is pretty much up to you! This is not a front-end challenge so it is not expected to be amazing; functional is fine.

### Phase One (15-20 minutes)
We'd like you to first whiteboard the layout/design that you think you'll build.

### Phase Two (2 hours)
Start building!  We'll let you choose how to build it.  Want to use a javascript or css framework? Go for it!

### Retrospective (20-30 minutes)
Let's talk about what you built and how you got there.

### SMS Messaging

We will be using the Twilio API (and their Java library) to enable SMS messaging
with guests. This project is configured using Maven and includes the Twilio
Java library. API credentials will be provided to you when needed.

### Running on Heroku

We will run the application on Heroku so that Twilio can deliver inbound SMS
messages to the server.

[![Deploy](https://www.herokucdn.com/deploy/button.png)](https://heroku.com/deploy)
