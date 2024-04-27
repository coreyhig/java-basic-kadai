package kadai018;

public class KatoTaro_Chapter18 extends Kato_Chapter18{
	public void setGivenName(String givenName) {
	    this.givenName = givenName;
	}
	// コンストラクタ
	public KatoTaro_Chapter18() {
	    setGivenName("太郎"); 
	}

	   //抽象メソッドに具体的な処理を記述
	   void eachIntroduce() {
	      System.out.println("私はJavaが得意です");
	      System.out.println("");
	   }

}