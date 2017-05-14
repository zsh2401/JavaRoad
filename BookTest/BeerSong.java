public class BeerSong{
	public static void main(String[]args){
		int beerNum = 99;//99个瓶子
		String word = "bottles";//瓶子的名字
		while (beerNum > 0 ){//还有瓶子就执行循环
			if (beerNum == 1){//如果瓶子只剩下一个没数,名字不再是复数词
				word = "bottle";
			}
			System.out.println("there have " + beerNum + word);//打印
			beerNum -= 1;//减少一个数的瓶子
			if (beerNum ==0){
				System.out.println("这里没有瓶子了!");
			}
		}
	}
}	