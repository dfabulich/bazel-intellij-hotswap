public class X {
	public static void main(String[] args) throws Exception {
		new X()._main(args);
	}

	void _main(String[] args) throws Exception {
		while (true) {
			Thread.sleep(1000L);
			log();
		}
	}

	void log() {
		System.out.println("hello");
	}
}