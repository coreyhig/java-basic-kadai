package kadai_014;

public class Car_Chapter14{
	//フィールド
	    private int gear = 1;
	    private int speed = 10;

	    // コンストラクタ（初期化処理）
	    public Car_Chapter14(int gear, int speed ) {
	        this.gear  = gear;
	        this.speed = speed;
	    }
	    public void gearChange( int afterGear ) {
        System.out.println("ギア"+gear +"から" +afterGear + "に切り替わりました");
        		{
        		afterGear = speed;
	    	switch(afterGear) {
	    	case 1  -> System.out.println(10);
	        case 2  -> System.out.println(20);
	        case 3  -> System.out.println(30);
	        case 4  -> System.out.println(40);
	        case 5  -> System.out.println(50);
	        case 6  -> System.out.println(60);
	        default -> System.out.println(1000);
	    	}}}
	    public void run() {
	    	System.out.println("速度は時速" + speed + "kmです");
	    }
        		}