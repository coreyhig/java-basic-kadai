package kadai018;

public abstract class Kato_Chapter18 {
	public String familyName  = "加藤"; // 
	public String givenName;  // 下の名前
	public String address = "東京都中野区〇×" ;  // 住所


	public void commonIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");

	}
	abstract void eachIntroduce();

	public void execIntroduce(){
		commonIntroduce();
		eachIntroduce();
	}
}