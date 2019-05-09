package testPjt;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
// 		기존 방법 
//		TransportationWalk transportationWalk = new TransportationWalk();
//		transportationWalk.move();
		
		// spring container 생성 
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		//	container로부터 객체를 가져옴 
		TransportationWalk transportationWalk = ctx.getBean("tWalk", TransportationWalk.class);
		transportationWalk.move();
		
		// 닫아주기 
		ctx.close();
	}
}
