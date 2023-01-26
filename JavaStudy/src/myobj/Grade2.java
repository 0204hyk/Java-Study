package myobj;

public class Grade2 {
	public int kor;
	public int eng;
	public int math;
	
	public Grade2(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	@Override
	public boolean equals(Object obj) {
		// obj라는 객체에는 kor, eng, math가 없으므로 다운캐스팅해서 비교 해야함
		return this.kor == ((Grade2)obj).kor
				&& eng == ((Grade2)obj).eng
				&& math == ((Grade2)obj).math;
	}
}
