package day200401;

public class CellPhoneEx {
	public static void main(String[] args) {
		DmbCellPhone dcp = new DmbCellPhone("갤럭시20", "레드", 0);
		dcp.powerOn(); // 부모님 메서드
		dcp.bell(); // 부모님 메서드
		dcp.sendVoice("여보세요?"); // 부모님 메서드
		dcp.receiveVoice("택배입니다."); // 부모님 메서드
		dcp.sendVoice("집 앞에 놓아주세요."); // 부모님 메서드
		dcp.receiveVoice("알겠습니다."); // 부모님 메서드
		dcp.hangUp(); // 부모님 메서드
		dcp.turnOnDmb(); // 자신의 메서드
		dcp.setChannel(100); // 자신의 메서드
		dcp.trunOffDmb(); // 자신의 메서드
		dcp.powerOff(); // 부모님 메서드
		
		CellPhone cp = new CellPhone();
		cp.powerOn();
//		cp.turnOnDmb(); // 부모님의 객체는 자식의 인스턴스를 호출할 수 없다.
		cp.powerOff();
	}
}
