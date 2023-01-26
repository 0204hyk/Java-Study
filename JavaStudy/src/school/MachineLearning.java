package school;

import javax.crypto.Mac;

public class MachineLearning extends Subject {
	int kor;
	int eng;
	int math;
	int statistics;
	int programmingLanguage;
	int nosql;
	
	public MachineLearning() {
		kor = ran.nextInt(101);
		eng = ran.nextInt(101);
		math = ran.nextInt(101);
		statistics = ran.nextInt(101);
		programmingLanguage = ran.nextInt(101);
		nosql = ran.nextInt(101);
	}
	
	public MachineLearning(int kor, int eng, int math, int statistics, int programmingLanguage, int nosql) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.statistics = statistics;
		this.programmingLanguage = programmingLanguage;
		this.nosql = nosql;
	}
	
	@Override
	public int getTotal() {
		return kor + eng + math + statistics + programmingLanguage + nosql;
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
		return new String[] {"국어", "영어", "수학", "통계학", "프로그래밍 언어", "NOSQL"};
	}
	
	@Override
	public int[] getSubjectScores() {
		return new int[] {kor, eng, math, statistics, programmingLanguage, nosql};
	}
	
	@Override
	public String className() {
		return "머신러닝";
	}
}
