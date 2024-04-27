package kadai018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
	public void setGivenName(String givenName) {
	    this.givenName = givenName;
	}
	 // コンストラクタ
	public KatoIchiro_Chapter18() {
		setGivenName( "一郎");
	}

	   //抽象メソッドに具体的な処理を記述
	   void eachIntroduce() {
	      System.out.println("好きな食べ物はリンゴです");
	      System.out.println("");
	   }
}