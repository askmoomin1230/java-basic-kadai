package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	//自分のじゃんけんを入力するメソッド
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		String s = "";
		while (true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			//入力
			s = scanner.next("p");

			//じゃんけんが正しい手であるかどうか
			if (s.equals("r") || s.equals("s") || s.equals("p")) {
				break;
			} else {
				System.out.println("エラーです。再度入力してください");
			}
		}
		scanner.close();
		return s;
	}

	//対戦相手のじゃんけんの乱数メソッド
	public String getRandom() {
		String[] pcHands = { "r", "s", "p" };
		
		String h =pcHands[(int)Math.floor(Math.random() * 3)];
		return h;
	}

	//じゃんけんを行う
	public void playGame() {
		String c =getMyChoice();
		String r =getRandom();
		HashMap<String, String> play = new HashMap<String, String>();
		play.put("r", "グー");
		play.put("ｓ", "チョキ");
		play.put("p", "パー");
		
		System.out.println(play.get("自分の手は" + c + ",対戦相手の手は" + r));
		
		if((c == "r" && r == "r") || (c == "s" && r == "s")||(c == "p" && r == "p")){
			System.out.println("あいこです");
			
		}
		
		if((c == "r" && r == "s") || (c == "s" && r == "p")||(c == "p" && r == "r")){
			System.out.println("自分の勝ちです");
			
		}
		
		if((c == "r" && r == "ｐ") || (c == "s" && r == "ｒ")||(c == "p" && r == "ｓ")){
			System.out.println("自分の負けです");
			
		}
		
		

	};
}
