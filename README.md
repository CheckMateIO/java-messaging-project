## CheckMate's Java Engineer Coding Challenge

One of the coolest parts of CheckMate's product is a direct messaging platform that lets guests and hotels communicate with each other via SMS and email.  Today we're going to build a simplified messaging program that will let a guest message a hotel directly. This will simulate a single hotel employee SMSing with a single guest.

### Features / Assumptions:
* When you visit the application you should be prompted for a (required) hotel user screen name and the "guest" mobile phone number.  There is no signup/login requirement.
* The chat interface should show messages from the hotel on the right side and messages from the "guest" on the left side very similar to iMessage or FB Messenger or… pretty much any chat client.
* Each message should indicate who sent the message and when it was sent.
* There should be a UI element at the bottom of the chat interface to send a new message to the guest.
* The UI is pretty much up to you! This is not a front-end challenge so it is not expected to be amazing; functional is fine.

### Phase One (15-20 minutes)
We'd like you to first whiteboard the layout/design that you think you'll build.

### Phase Two (2 hours)
Start building!  We'll let you choose how to build it.  Ensure you allocate time for testing edge-cases such as:
* Long messages from guests are split up by Twilio and delivered in an indeterminate order. We need these messages to be reconstructed into a single message with the proper ordering.

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
