package 조별과제220320;

public class 매출 {
	// 1. 필드
		private int 매출금액;
		private String 날짜;
		private String 월;
		private String 연도;

		// 2. 생성자
		
		public 매출() { }		// 깡통생성자
		
		// 컨트롤러.저장, 로딩 메서드가 사용할 풀 생성자
		public 매출(int 매출금액, String 날짜, String 월,String 연도) {	
			this.매출금액 = 매출금액;
			this.날짜 = 날짜;
			this.월 = 월;
			this.연도 = 연도;
		}

		// 컨트롤러.매출출력 메서드에서 리턴값 객체화용으로 쓸 생성자
		public 매출(int 매출금액, String 날짜) {
			this.매출금액 = 매출금액;
			this.날짜 = 날짜;
		}

		// 3. 메서드
		public int get매출금액() {
			return 매출금액;
		}

		public void set매출금액(int 매출금액) {
			this.매출금액 = 매출금액;
		}

		public String get연도() {
			return 연도;
		}

		public void set연도(String 연도) {
			this.연도 = 연도;
		}

		public String get월() {
			return 월;
		}

		public void set월(String 월) {
			this.월 = 월;
		}
		
		public String get날짜() {
			return 날짜;
		}

		public void set날짜(String 날짜) {
			this.날짜 = 날짜;
		}

}
