package dependencyinjection;

public class MyDIApllication implements Consumer{
	private MessageService service;
	
	public MyDIApllication(MessageService svc) {
		this.service = svc;
	}
	

	@Override
	public void processMessages(String msg, String rec) {
		this.service.sendMessage(msg, rec);
		
	}
}
