package singleton;

public class Singleton {
	private static Singleton sin;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (sin == null) {
			synchronized (Singleton.class) {
				if (sin == null) {
					sin = initializeSingletonInstance();
				}
			}
		}

		return sin;
	}

	private static Singleton initializeSingletonInstance() {
		return new Singleton();
	}

}
