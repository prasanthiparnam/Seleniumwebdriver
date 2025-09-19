package demoexample;

public class MainFunctionality {

	public static void main(String[] args) {
		Login l1 = new Login();
		Srt s1 = new Srt();
		SrfChild s2 = new SrfChild();
		
		l1.loginMethod();
		System.out.println(s1.srtMethod());
		s2.srfParent();
		s2.srfChildMethod();
		

	}

}
