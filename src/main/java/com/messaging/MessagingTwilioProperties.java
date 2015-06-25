package com.messaging;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MessagingTwilioProperties {
  private static final String PROP_FILE_NAME = "config.properties";
  private Properties properties = null;

	private Properties load() throws IOException {
    if (properties != null) {
      return properties;
    }

		properties = new Properties();
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(PROP_FILE_NAME);

		if (inputStream != null) {
			properties.load(inputStream);
		} else {
			throw new FileNotFoundException("property file '" + PROP_FILE_NAME + "' not found in the classpath");
		}

    return properties;
	}

  public String getAuthToken() throws IOException {
    Properties prop = load();
    return prop.getProperty("auth_token");
  }

  public String getAccountSid() throws IOException {
    Properties prop = load();
    return prop.getProperty("account_sid");
  }
}
