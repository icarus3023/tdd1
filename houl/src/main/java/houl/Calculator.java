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
			return "�옒紐삳맂 媛믪쓣 �엯�젰�븯�뀲�뒿�땲�떎.";
		else {
			return "湲덉븸�� $" + money() + " �엯�땲�떎.";
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
			logInfo.info("�벑湲됱쓣 �엯�젰�븯�꽭�슂 : Gold(1), Silver(2) : ");
			cal.grade = gradesc.nextInt();
			logInfo.info("�넻�솕 �떆媛꾩쓣 �쟻�뼱二쇱꽭�슂(遺�) : ");
			cal.time = timesc.nextInt();
			logInfo.info("�쉶�꽑 媛쒖닔瑜� �쟻�뼱二쇱꽭�슂 : ");
			cal.line = linesc.nextInt();
			logInfo.info(cal.result());
			logInfo.info("怨꾩냽 吏꾪뻾�븯�떆寃좎뒿�땲源�?(y/n) : ");
			question = yn.next();
			logInfo.info("\n");
			if ("n".equals(question))
				break;
		}
	}
}