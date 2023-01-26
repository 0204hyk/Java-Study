package school;

public class Network extends Subject {
	int kor;
	int eng;
	int linux;
	int network;
	int ccna;
	
	public Network() {
		kor = ran.nextInt(101);
		eng = ran.nextInt(101);
		linux = ran.nextInt(101);
		network = ran.nextInt(101);
		ccna = ran.nextInt(101);
	}
	
	public Network(int kor, int eng, int linux, int network, int ccna) {
		this.kor = kor;
		this.eng = eng;
		this.linux = linux;
		this.network = network;
		this.ccna = ccna;
	}
	
	@Override
	public int getTotal() {
		return kor + eng + linux + network + ccna;
	}
	
	@Override
	public double getAvg() {
		return getTotal() / 5.0;
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
		return new String[] {"국어", "영어", "리눅스", "네트워크", "CCNA"};
	}
	
	@Override
	public int[] getSubjectScores() {
		return new int[] {kor, eng, linux, network, ccna};
	}
	
	@Override
	public String className() {
		return "네트워크";
	}
	
}

