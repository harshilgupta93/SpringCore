package com.luv2code.spring._003_Dependency_Injection;

public class HappyFortuneSerive implements FortuneService {

	
	
	public HappyFortuneSerive() {
		System.out.println("in no-arg constructor: HappyFortuneSerive()");
	}

	@Override
	public String getFortune() {

		return "Happy Fortune Service.";
	}

}
