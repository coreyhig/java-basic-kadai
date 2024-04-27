package kadai018;

public class KatoHanako_Chapter18 extends Kato_Chapter18{
	public void setGivenName(String givenName) {
	    this.givenName = givenName;
	}
	
	// コンストラクタ
	public KatoHanako_Chapter18() {
		setGivenName("花子");
	}
	   
	   //抽象メソッドに具体的な処理を記述
	   void eachIntroduce() {
		   System.out.println("趣味は読書です");
	   }
}