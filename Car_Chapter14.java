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
        	gear = afterGear;	
	    	speed = switch(afterGear) {
	    	case 1  -> 10;
	        case 2  -> 20;
	        case 3  -> 30;
	        case 4  -> 40;
	        case 5  -> 50;
	        case 6  -> 60;
	        default -> 10;
	    	};
	    }
	    public void run() {
	    	System.out.println("速度は時速" + speed + "kmです");
	    }
	    }