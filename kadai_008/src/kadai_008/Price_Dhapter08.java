package kadai_008;

public class Price_Dhapter08 {

	public static void main(String[] args) {
		// 年代を表す変数
		int  UserAge = 30;
		
		switch(UserAge) {
		 case 10 -> System.out.println("10代の料金は1000円");
		 case 20 -> System.out.println("20代の料金は2000円");
		 case 30 -> System.out.println("30代の料金は3000円");
		 case 40 -> System.out.println("40代の料金は3000円");
		 case 50 -> System.out.println("50代の料金は4000円");
		 case 60 -> System.out.println("60代の料金は4000円");
		 case 70 -> System.out.println("70代の料金は5000円");
		 case 80 -> System.out.println("80代の料金は5000円");
		 
		 default -> System.out.println("それ以外の年代は500円");
		 
		}

	}

}
