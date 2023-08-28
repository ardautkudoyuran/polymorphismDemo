package polymorphismDemo;

import java.security.PublicKey;

public class CustomerManager {
	private BaseLogger logger = new BaseLogger();
	public CustomerManager(BaseLogger baseLogger) {
		this.logger = baseLogger;
			
	}
	public void add(String message) {
		this.logger.Log(message);
	}

}
