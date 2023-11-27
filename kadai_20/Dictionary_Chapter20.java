package kadai_20;
import java.util.HashMap;

public class Dictionary_Chapter20 {

   public static void main(String[] args) {
      HashMap<String,String> wordMap = new HashMap<String,String>();

      wordMap.put("apple","りんご");
      wordMap.put("peach","桃");
      wordMap.put("banana","バナナ");
      wordMap.put("lemon","レモン");
      wordMap.put("pear","梨");
      wordMap.put("kiwi","キウイ");
      wordMap.put("stawberry","いちご");
      wordMap.put("grape","ぶどう");
      wordMap.put("muscat","マスカット");
      wordMap.put("cherry","さくらんぼ");
      
      
      System.out.println("appleの意味は" + wordMap.get("apple"));
      System.out.println("bananaの意味は" + wordMap.get("banana"));
      System.out.println("grapeの意味は" + wordMap.get("grape"));
      System.out.println("bananaの意味は" + wordMap.get("banana"));
      
   }}
      