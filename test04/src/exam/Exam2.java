package exam;
//Q2. 구구단을 짝수 단만 출력하도록 프로그램을 만들어 보세요
public class Exam2 {
	public static void main(String[] args) {
		//case 1
		for(int i=2;i<10;i+=2) {					//단(i) : 2, 4, 6, 8
			System.out.println(i+"단");
			for(int j=1;j<10;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}	System.out.println();
		}
		//case 2
		for(int i=1;i<10;i++) {					//단(i) : 2, 4, 6, 8
			if(i % 2 == 1)
				continue;
			System.out.println(i+"단");
			for(int j=1;j<10;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}	System.out.println();
		}
		//case 3
				System.out.print("2단\t\t4단\t\t6단\t\t8단\n");
				for(int i=1;i<10;i++) {					//단(i) : 2, 4, 6, 8
					for(int j=2;j<10;j+=2) {
						System.out.print(j+"*"+i+"="+i*j+"\t");
					}	System.out.println();
				}
	}
}
