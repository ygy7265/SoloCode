package ch01.sec06;



public class baekjoon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//산술연산자 연습
//		int sum , mi , mul , divi, result;
//		int x=1;			int num = 2;		int p = 4;		int pp = 8;		int pos = 6;
//		int y=2;			int num2 = 3;		int l = 5;		int pa = 4;		int postion = 4;
//		sum = x+y;			mi = num2 - 1;		mul = 4*5;		divi = pp/pa;	result = 6%4;
//		System.out.println("sum = " + sum + "  mi = " + mi + "  mul = " + mul + "  divi = " + divi + "  result =" + result);
		
		//증감연산자 연습
//		int num1 = 1;
//		System.out.println(num1);
//		num1++;
//		System.out.println(num1);
//		num1--;
//		System.out.println(num1);
//		
		
		//복합연산자 연습
//		int n = 4;
//		int sum = 2;
//		sum += n ;
//		System.out.println(sum);
//		sum -= n;
//		System.out.println(sum);
//		sum *= n;
//		System.out.println(sum);
//		sum /= n;
//		System.out.println(sum);
//		//반복문 안에서 응용가능
//		for(n = 0; n < 5; n ++) {
//			sum += n;		
//		}
//		System.out.println(sum);
		
//		//비교연산자 연습
//		int x = 3;
//		int y = 4;
//		
//		boolean tt = x < y;
//		System.out.println(tt);
//		boolean tt1 = x > y;
//		System.out.println(tt1);
//		boolean tt2 = x <= y;
//		System.out.println(tt2);
//		boolean tt3 = x >= y;
//		System.out.println(tt3);
//		boolean tt4 = x == y;
//		System.out.println(tt4);
//		
		
		//논리 연산자
//		int num1 = 3;
//		int num2 = 4;
//		
//		boolean sum2 = (num1 > 2)  && (num2 < 4);
//		System.out.println(sum2);
//		boolean sum3 = (num1 > 1)  && (num2 < 4);
//		System.out.println(sum3);
//		boolean sum4 = (num1 > 2)  || (num2 < 4);
//		System.out.println(sum4);
//		boolean sum5 = (num1 > 1)  || (num2 < 4);
//		System.out.println(sum5);
//		
//		
//		int num = 5;
//		if(num <3) {
//			System.out.println("숫자가 3보다 작습니다");
//		}else if(num<4) {
//			System.out.println("숫자가 4 보다 작습니다");
//		}else {
//			System.out.println("숫자가 4보다 큽니다");
//		}
		
//		int por = 10;
//		switch(por){
//			case 2:{
//				System.out.println("2입니다");
//				break;
//			}
//			case 4:{
//				System.out.println("4입니다");
//				break;
//			}
//			case 6:{
//				System.out.println("6입니다");
//				break;
//			}
//			case 8:{
//				System.out.println("8입니다");
//				break;
//			}
//			case 10:{
//				System.out.println("10입니다");
//				break;
//				
//			}
//		int sum = 0;
//		for (int i = 0; i <=10; i++) {
//			sum += i;
//		
//		}
//		System.out.println("1부터 10까지 의 합 =" + sum);
//		
//		int sum2 = 0;
//		int result = 0;
//		while(sum2 < 10) {
//			
//			if(sum2  > 4) {
//				break;
//				
//			}
//			sum2++;
//			
//		}
//		System.out.println("총합"+sum2);
//		
		int i = 0;
		do {
			i += 1; 
			i++;
			
		}while(i < 12 );
		
		System.out.println(i);
	}

}
