package com.messaging;

import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.MessageFactory;
import com.twilio.sdk.resource.instance.Message;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

public class Example {

  public static void main(String[] args) throws TwilioRestException, IOException {
    MessagingTwilioProperties properties = new MessagingTwilioProperties();
    TwilioRestClient client = new TwilioRestClient(properties.getAccountSid(), properties.getAuthToken());

    List<NameValuePair> params = new ArrayList<NameValuePair>();
    params.add(new BasicNameValuePair("Body", "Jenny please?! I love you <3"));
    params.add(new BasicNameValuePair("To", "+18438604210"));
    params.add(new BasicNameValuePair("From", "+14153001690"));

    MessageFactory messageFactory = client.getAccount().getMessageFactory();
    Message message = messageFactory.create(params);
    System.out.println(message.getSid());
  }
}
