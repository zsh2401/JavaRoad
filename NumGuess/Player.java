public class Player{
	int num = 0;//定义数字
	public int guessNum(){
		num = (int)(Math.random()*10);//产生一个随机数字
		System.out.println("I guess is "+ num);
		return num;//返回给调用者
	}
}
