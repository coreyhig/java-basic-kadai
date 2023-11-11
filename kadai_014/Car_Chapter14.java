package kadai_014;

	public class Car_Chapter14
{
		//車クラスのフィールド
		private int gear  = 1; // 1速から5速のギアを表す
        private int speed = 30; //ギアチェンジ後の速度を表す
		
		 //車クラスのgearchangeメソッド
		public void gearChange( int afterGear ) {
			System.out.println( this.gear + "から" + afterGear  + "に切り替えました");
		}
		
		//車クラスのrunメソッド
		public void run() {
				System.out.println("速度は時速" + this.speed + "kmです");
	    }
}