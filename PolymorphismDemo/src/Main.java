import java.lang.System.Logger;

public class Main {

	public static void main(String[] args) {
//		BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new EmailLogger(),new DataBaseLogger()}; 
//		for (BaseLogger logger : loggers) {
//			logger.log("Log mesajı");
//		}
		
		CustomerManager customerManager = new CustomerManager(new EmailLogger());
		customerManager.add();

	}

}
