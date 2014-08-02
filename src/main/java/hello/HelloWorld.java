/**
 * 
 */
package main.java.hello;

import org.joda.time.LocalTime;

/**
 * @author seongjuhyeon
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Greeter greeter = new Greeter();
//        System.out.println(greeter.sayHello());
		
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
	}

}
