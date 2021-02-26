import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapDicEx {
	
	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();
		
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		Set<String> keys = dic.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			String value = dic.get(key);
			System.out.println("(" + key + "," + value + ")");
		}
		
		Scanner sc = new Scanner(System.in);
//		for(int i = 0; i<dic.size(); i ++) {
//			System.out.println("찾고 싳은 단어 : ");
//			String eng= sc.next();
//			System.out.println(dic.get(eng));
//		}
		
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();
		
		javaScore.put("일영재", 100);
		javaScore.put("삼재", 50);
		javaScore.put("오영재", 91);
		javaScore.put("팔영재", 40);
		
		System.out.println("HashMap의 요소 개수 : "+ javaScore.size());
		
		Set<String> keyss = javaScore.keySet();
		
		Iterator<String> it2 = keyss.iterator();
		
		while(it2.hasNext()){
			String name = it2.next();
			int score = javaScore.get(name);
			if(score>90) {
				System.out.println("90 이상 " + name + " : " + score);
			} 
		}
		
	}

}
