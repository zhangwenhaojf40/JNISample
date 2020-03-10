package zz.hao.jni;

public class JNITest {
	static {
		System.loadLibrary("Hello");
	}
 
	public native String test();
 
}