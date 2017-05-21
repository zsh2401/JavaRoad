public class GuessGame{
	public void startGame(){
		//创建对象
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		//生成需要猜的数字
		int targetNumber = (int)(Math.random()*10);
		System.out.println("Num is " + targetNumber);
		//用于存储玩家是否判断正确
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		//存储玩家判断的数值
		int p1Num = 0;
		int p2Num = 0;
		int p3Num = 0;
		
		while(true){
			//获取玩家猜的数字
			p1Num = p1.guessNum();
			p2Num = p2.guessNum();
			p3Num = p3.guessNum();
			
			//判断是否猜对了
			if (p1Num == targetNumber){
				p1isRight = true;
			}
			
			if (p2Num == targetNumber){
				p2isRight = true;
			}
			
			if (p3Num == targetNumber){
				p3isRight = true;
			}
			
			//显示玩家猜的数字
			System.out.println("P1 Guess num is "+ p1Num);
			System.out.println("P2 Guess num is "+ p2Num);
			System.out.println("P3 Guess num is "+ p3Num);
			
			
			if (p1isRight||p2isRight||p3isRight){//如果有人猜对,显示结果并结束游戏
				System.out.println("We Have a winner!");
				System.out.println("Player One is Right? >> " + p1isRight);
				System.out.println("Player Two is Right? >> " + p2isRight);
				System.out.println("Player Three is Right? >> " + p3isRight);
				break;
			}
			else{//否则游戏继续
				System.out.println("Let's Guess again!");
			}
		}
		
	}
}