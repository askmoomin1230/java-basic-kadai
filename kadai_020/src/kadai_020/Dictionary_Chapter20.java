package kadai_020;
import java.util.HashMap;
//import java.util.Map;

public class Dictionary_Chapter20 {
	HashMap<String,String> fruitsDic = new HashMap<String,String>();
	
	
     //追加
	public Dictionary_Chapter20() {
	    fruitsDic.put("apple","りんご");
	    fruitsDic.put("peach","桃");
	    fruitsDic.put("banana","バナナ");
	    fruitsDic.put("lemon","レモン");
	    fruitsDic.put("pear","梨");
	    fruitsDic.put("kiwi","キウイ");
	    fruitsDic.put("strawbery","いちご");
	    fruitsDic.put("grape","ぶどう");
	    fruitsDic.put("muscat","マスカット");
		fruitsDic.put("cherry","さくらんぼ");
		
	}
		
	public  void fruitsDic(String[] words) {
		for(int i = 0; i < words.length; i++) {
		String w = fruitsDic.get(words[i]);
	
	if(w == null) {
		System.out.println(words[i] + "は辞書に存在しません");
	}else {
		System.out.println(words[i] + "の意味は" + w);
		
	}
		}
		
	}
		
		
}
	


