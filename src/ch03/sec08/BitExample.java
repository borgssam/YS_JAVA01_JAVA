package ch03.sec08;

public class BitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//                   76543210
		byte leds = (byte) 0b10101110;
		
		for(int index = 0;index < 8; index++) {
		byte chk_led = (byte)(1 << index);
	        if( (leds  & chk_led) == chk_led) {
	        	System.out.printf("%d램프가 켜져있습니다.\n", index);
	        } else {
	        	System.out.printf("%d램프가 꺼져있습니다.\n", index);        	
	        }
		}			

	}

}
