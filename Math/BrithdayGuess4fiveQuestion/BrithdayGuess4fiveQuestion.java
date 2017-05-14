import java.util.Scanner;
class BrithDayGameRunner{
	//运行程序
	public static void main(String[] args){
		BG brithdayGame = new BG();//创建游戏对象
		brithdayGame.run();//运行
		System.out.println(brithdayGame.getBrithDay());//获取计算的天数
	}
}
class BG{
	//定义集合
	private String set1 =  "1  3  5  7\n" +
					"9  11 13 15 \n" + 
					"17 19 21 23 \n" + 
					"25 27 29 31 \n";
					
	private String set2 =  "2  3  6  7\n" +
					"10 11 14 15 \n" + 
					"18 19 22 23 \n" + 
					"26 27 20 31 \n";
					
	private String set3 =  "4  5  6  7\n" +
					"12 13 14 15 \n" + 
					"20 21 22 23 \n" + 
					"28 29 30 31 \n";
					
	private String set4 =  "8 9 10 11\n" +
					"12 13 14 15 \n" + 
					"24 25 26 27 \n" + 
					"28 29 30 31 \n";
					
	private String set5 =  "16 17 18 19\n" +
					"20 21 22 23 \n" + 
					"24 25 26 27 \n" + 
					"28 29 30 31 \n";
	private int day = 0 ;//天数
	private int k = 1;//猜测的次数
	void run(){
		Scanner input = new Scanner(System.in);//创建输入对象
		int answer;//使用变量进行猜测
		while(k<=5){//当
			printString(k);
			printTitle(k);
			answer = input.nextInt();//获得输入
			if (answer==1){
				dayPlus(k);//根据关卡增加天数
			}
			k++;//猜测次数自增
		}
		k = 1;//重置
	}
	int getBrithDay(){
		/*
		获取计算的天数
		*/
		return day;
	}
	void printTitle(int num){
		/*
		打印提示信息
		*/
		System.out.println("请输入0代表否,1代表是\n\n>>");
	}
	void printString(int num){
		/*
		打印题目
		*/
		System.out.println("请问你的生日在以下数字中吗?");
		switch(k){
			case 1:
				System.out.println(set1);
				break;
			case 2:
				System.out.println(set2);
				break;
			case 3:
				System.out.println(set3);
				break;
			case 4:
				System.out.println(set4);
				break;
			case 5:
				System.out.println(set5);
				break;
		}
	}
	void dayPlus(int k){
		/*
		根据回答的次数增加天数
		*/
		switch(k){
			case 1:
				day += 1;
				break;
			case 2:
				day += 2;
				break;
			case 3:
				day += 4;
				break;
			case 4:
				day += 8;
				break;
			case 5:
				day += 16;
				break;
		}//switch结束
	}//方法结束
}//类技术