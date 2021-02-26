package t_tok02;

//교체 가능
public class BlackPhone implements Phone{
	private Battery battery;

	public BlackPhone() {
		this.battery = new Battery();
	}

	public BlackPhone(Battery battery) {
		super();
		this.battery = battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	@Override
	public void show() {

		System.out.println(this.getClass().getSimpleName() + ":" + battery.getName());
		
	}
	
	
	
	

}
