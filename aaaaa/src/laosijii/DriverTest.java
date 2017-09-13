package laosijii;

import java.util.ArrayList;

public class DriverTest {
	public static void main(String[] args) {
		
		OldDriver od = new OldDriver();
		od.setName("蹇楁澃");
		
		//涓�釜
		//od.setGrilfriend(g);
		
		Gril g1 = new Gril("鏉庡啺鍐�);"
		Gril g2 = new Gril("鑼冨啺鍐�);
		Gril g3 = new Gril("鍐峰啺鍐�);
		Gril g4 = new Gril("濡傝姳");
		
		
		//鏅�鏁扮粍
//		Gril[] grils = {g1,g2,g3,g4};
//		
//		od.setGrilfriends(grils);
		
		//鍔ㄦ�鏁扮粍
		ArrayList gs = new ArrayList();
		gs.add(g4);//娣诲姞
		gs.add(g1);
		gs.add(g2);
		gs.add(g3);
		
		
		od.setGrilfriends(gs);
		
		System.out.println(od);
		
		
		od.sayGoodBye();
		System.out.println(od);
		
		
		
		
		
		
	}

}
