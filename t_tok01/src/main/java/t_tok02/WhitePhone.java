package t_tok02;

//내장
public class WhitePhone implements Phone {
	private Battery battery;
	
	
	public WhitePhone() {
		this.battery = new Battery();
	}


	@Override
	public void show() {

		System.out.println(this.getClass().getSimpleName() + ":" + battery.getName());
		
	}

}
