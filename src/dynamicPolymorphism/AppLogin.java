package dynamicPolymorphism;

public class AppLogin extends WebLogin {

	@Override
	public void joinTodayClass() {
		System.out.println("Please scan your face or fingureprint to login");
	}

}
