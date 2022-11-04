package exception;

public class AutoClosedObj implements AutoCloseable{

	@Override
	public void close() throws Exception {

		System.out.println("close()");
	}

}
