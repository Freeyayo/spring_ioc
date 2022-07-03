package com.spring.aop;

import org.springframework.stereotype.Component;

//?理解：用了@Component，并且implement了对应的Cal之后，这个Bean就是对应的Cal的Bean了
@Component
public class CalImpl implements Cal {

	public int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public int sub(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}

	public int mul(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}

	public int div(int num1, int num2) {
		int result = num1 / num2;
		return result;
	}

}
