package tpa.onepam.kingpins.mastery.maven.example;

import org.apache.commons.lang3.StringUtils;

public class Greetings {
	
	public static void main(String arguments[]) {
		if(arguments.length > 0) {
			if(!StringUtils.isEmpty(arguments[0])) {
				System.out.println("Hello " + arguments[0]);
			} else {
				System.out.println("Hello Unknown");
			}
		} else {
			System.out.println("Not Enough Details to Greet");
		}		
	}
}