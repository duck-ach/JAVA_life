package ex01.object;

class Calculator {
	int left, right; // this 는 인스턴스 자신을 의미하므로 이 변수를 가리키게 된다. 
	public void setOprands(int left, int right) {
		this.left = left;  // this = Calculator라고 하는 구체적인 클래스에서 만든 인스턴스를 가리키는 것
		this.right = right; // 만약 this.left = this.left라고 써주게 되면 Calculator라는 객체 안에서 어디서든지 접근할 수 있는 값이 된다.
	}
	public void sum() {
		System.out.println(this.left + this.right);
	}
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}


public class Ex04_Object4 {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator(); // 인스턴스 생성
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		c2.setOprands(20, 40);
		c2.sum();
		c2.avg();
		
	}

}
