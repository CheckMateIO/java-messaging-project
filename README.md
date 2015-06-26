# CheckMate's Java Engineer Coding Challenge

One of the coolest parts of CheckMate's product is a direct messaging platform that lets guests and hotels communicate with each other via SMS and email.  Today we're going to build a simplified messaging program that will let a guest message a hotel directly. This will simulate a single hotel employee SMSing with a single guest.

### Features / Assumptions:
* When you visit the application you should be prompted for a (required) hotel user screen name and the "guest" mobile phone number.  There is no signup/login requirement.
* The chat interface should show messages from the hotel on the right side and messages from the "guest" on the left side very similar to iMessage or FB Messenger or… pretty much any chat client.
* Each message should indicate who sent the message and when it was sent.
* There should be a UI element at the bottom of the chat interface to send a new message to the guest.
* Stretch goal: The incoming messages from the guest should show up live in the chat interface without requiring a refresh of the page.
* The UI is pretty much up to you! This is not a front-end challenge so it is not expected to be amazing; functional is fine.

#### Phase One (15-20 minutes)
We'd like you to first whiteboard the layout/design that you think you'll build.

#### Phase Two (2 hours)
Start building!  We'll let you choose how to build it.  Ensure you allocate time for testing edge-cases such as:
* Long messages from guests are split up by Twilio and delivered in an indeterminate order. We need these messages to be reconstructed into a single message with the proper ordering.

#### Retrospective (20-30 minutes)
Let's talk about what you built and how you got there.

## SMS Messaging

You will use the Twilio API (and their Java library) to enable outbound/inbound
SMS messaging with guests. This project is configured using Maven and includes
the Twilio Java library already. API credentials will be provided to you as
needed.

[Twilio Java SMS Messaging Quickstart](https://www.twilio.com/docs/quickstart/java/sms)

## Instructions

### Running the application locally

You can run the application locally but Twilio will not be able to send SMS messages to your system.

1. Fork this repository in github.
2. Clone your fork.
3. Install the Heroku toolbelt: https://devcenter.heroku.com/articles/getting-started-with-java#set-up
4. If Maven is not installed, `brew install maven`. If homebrew is not installed - install it.
5. Run `mvn clean install`
6. Configure ENV variables.
  1. Create a .env file in the project root.
  2. Add `TWILIO_ACCOUNT_SID=[account sid]`
  3. Add `TWILIO_AUTH_TOKEN=[auth token]`
  4. Save the file.
7. Run `foreman start web`
8. Your app will now be running at [http://localhost:5000](http://localhost:5000).

### Running on Heroku

To enable easier end-to-end testing of the application on a public server that Twilio can access we will deploy to Heroku. You can do that easily by using the deploy button below.

[![Deploy](https://www.herokucdn.com/deploy/button.png)](https://heroku.com/deploy)
