package com.luv2code.spring._019_Qualifier_Annotation_ON_Constructor_DI;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

	public RESTFortuneService() {
		System.out.println(">> inside default constructor: RESTFortuneService()");
	}
	
	@Override
	public String getFortune() {
		return "(RESTFortuneService) Today is your lucky day !";
	}

}
