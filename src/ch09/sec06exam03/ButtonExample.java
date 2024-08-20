package ch09.sec06exam03;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btnOk = new Button();
		
		class OkListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("OK버튼이 눌렸습니다.");
			}
		}
		Button.ClickListener _listener = new OkListener();
		btnOk.setClickListener( _listener );
		
		btnOk.click();
		
		//--------------------
		Button btnCancel = new Button();
		
		class CancelListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("CANCEL 버튼이 눌렸습니다.");
			}
		}
		_listener = new CancelListener();
		btnCancel.setClickListener( _listener );		
		btnCancel.click();
		
		
		

	}

}
