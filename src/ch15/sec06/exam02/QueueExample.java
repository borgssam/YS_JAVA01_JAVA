package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> msgQ = new LinkedList<>();
		
		msgQ.offer(new Message("sendMail", "홍길동"));
		msgQ.offer(new Message("sendSMS",  "이순신"));
		msgQ.offer(new Message("sendKaKao","세종대왕"));
		
		while(msgQ.isEmpty() == false) {
			Message msg = msgQ.poll();
			switch(msg.commend) {
			case "sendMail":
				System.out.println(msg.to+"에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(msg.to+"에게 문자을 보냅니다.");
				break;
			case "sendKaKao":
				System.out.println(msg.to+"에게 카톡을 보냅니다.");
				break;
			
			}
			
		}
		
		

	}

}
