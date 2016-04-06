package houl;

import java.util.Scanner;
import java.util.logging.Logger;

public class Calculator {
	int grade;
	int time;
	int line;

	public double money() {
		double result = calline() + calminute();
		result = result-(100*result-(int)100*result)/100;
		if (grade == 1) {// gold
			return result;
		} else if (grade == 2) {// silver
			return result;
		}
		return 0;
	}

	public int addminute() {
		if (grade == 1) { // gold
			return time - 1000 >= 0 ? time - 1000 : -1;
		} else if (grade == 2) { // silver
			return time - 500 >= 0 ? time - 500 : -1;
		} else {
			return -100;
		}
	}

	public double calminute() {
		if(grade == 1){ // gold
			return addminute() == -1?  49.95: 49.95 + addminute() * 0.45;
		}
		else if (grade == 2){// silver
			return  addminute() == -1? 29.95: 29.95 + addminute() * 0.54;
		}
		else{return -1;}
	}

	public int addline() {
		if (line - 3 < 0) {
			return -1;
		} else {
			return line - 3;
		}
	}

	public double calline() {
			
			if (line == 1) {
				return 0;}
			if(addline()>=0)
				return (grade==1)? 14.5 * 2 + addline() * 5 :21.5 * 2 + addline() * 5;
			else if(addline()<0)
				return (grade==1)?14.5 * (line - 1):21.5 * (line - 1);
			else
				return -1;
			
		}

	public String result() {
		if (money()<29.95)
			return "잘못된 값을 입력하셨습니다.";
		else {
			return "금액은 $" + money() + " 입니다.";
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 final Logger logInfo = Logger.getLogger(
				    Thread.currentThread().getStackTrace()[0].getClassName() );
		for (;;) {
			Calculator cal = new Calculator();
			Scanner gradesc = new Scanner(System.in);
			Scanner timesc = new Scanner(System.in);
			Scanner linesc = new Scanner(System.in);
			Scanner yn = new Scanner(System.in);
			String question;
			logInfo.info("등급을 입력하세요 : Gold(1), Silver(2) :  ");
			cal.grade = gradesc.nextInt();
			logInfo.info("통화 시간을 적어주세요(분) :  ");
			cal.time = timesc.nextInt();
			logInfo.info("회선 개수를 적어주세요 :  ");
			cal.line = linesc.nextInt();
			logInfo.info(cal.result());
			logInfo.info("계속 진행하시겠습니까?(y/n) : ");
			question = yn.next();
			logInfo.info("\n");
			if ("n".equals(question))
				break;
		}
	}
}