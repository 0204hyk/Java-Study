package school;

import java.util.Random;

public class Programming extends Subject {
	
	int kor;
	int eng;
	int math;
	int programmingLanguage;
	int operatingSystem;
	int dataStructure;
	
	public Programming() {
		kor = ran.nextInt(101);
		eng = ran.nextInt(101);
		math = ran.nextInt(101);
		programmingLanguage = ran.nextInt(101);
		operatingSystem = ran.nextInt(101);
		dataStructure = ran.nextInt(101);
	}
	
	public Programming(int kor, int eng, int math, int programmingLanguage, int operatingSystem, int dataStructure) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.programmingLanguage = programmingLanguage;
		this.operatingSystem = operatingSystem;
		this.dataStructure = dataStructure;
	}
	
	@Override
	public int getTotal() {
		return kor + eng + math + programmingLanguage + operatingSystem + dataStructure;
	}

	@Override
	public double getAvg() {
		return getTotal() / 6.0;
	}
	
	@Override
	public char getGrade() {
		double avg = getAvg();
		if (avg >= 90) {
			return 'A';
		} else if (avg >= 80) {
			return 'B';
		} else if (avg >= 70) {
			return 'C';
		} else if (avg >= 60) {
			return 'D';
		} else {
			return 'F';
		}
	}
	
	@Override
	public String[] getSubjectNames() {
		return new String[] {"국어", "영어", "수학", "프로그래밍 언어", "운영체제", "자료구조"};
	}
	
	@Override
	public int[] getSubjectScores() {
		return new int[] {kor, eng, math, programmingLanguage, operatingSystem, dataStructure};
	}
	
	@Override
	public String className() {
		return "프로그래밍";
	}
	
}
