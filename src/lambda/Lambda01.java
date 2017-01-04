package lambda;

import java.util.Arrays;

public class Lambda01 {

	public static void main(String[] args) {
		// Thread - traditional
		/*new Thread(new Runnable(){
			@Override
			public void run(){
				System.out.println("Hello World.");
			}
		}).start();*/
		
		// Thread - lambda Expression
		new Thread(()->{
			System.out.println("Hello World.");
		}).start();
		
		//Stream API
		Arrays.asList(1,2,3).stream().forEach(System.out::println); // 1,2,3
		Arrays.asList(1,2,3).stream().map(i->i*i).forEach(System.out::println); // 1,2,3

	}

}
