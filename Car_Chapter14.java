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
	    	switch(afterGear) {
	    	case 1  -> System.out.println("速度は時速10kmです");
	        case 2  -> System.out.println("速度は時速20kmです");
	        case 3  -> System.out.println("速度は時速30kmです");
	        case 4  -> System.out.println("速度は時速40kmです");
	        case 5  -> System.out.println("速度は時速50kmです");
	        case 6  -> System.out.println("速度は時速50kmです");
	        default -> System.out.println("速度は時速100kmです");
	    	}
	    	}
        		}
	    }
	      