//面向对象测试//
class HelloWorld{
	public static void main(String[]args){
		System.out.println("HelloWorld");
	}
}
class Get{
	static void ok(){
		System.out.println("Wow!" + x);
	}
	public static int x = 3;
}
class Run{
	public static void main(String[]args){
		Get x = new Get();
		x.ok();
	}
}
//面向对象测试//
class ForTest{
	//FOR循环练习
	public static void main(String[]args){
		int c = 0;
		int all = 10130;
		int b = 10;
		//		当num小于all,则执行,执行完num++继续
		for(int num =0;num<all;num++){
			if(num%b==0){
				c ++;
			}
		}
		System.out.println(all + "中有" + c + "个" + b);
	}
}
//更多的练习
class Dog{
	//狗的模型
	String name = "Acc";
    int speed = 5;
	int x = 3;
	int y = 3;
	int water_value = 3;
	int jie_value = 3;

	void jiao(){
		//狗叫的方法
		System.out.println("汪");
	}

	void move(String fangxiang){
		//狗移动的方法
		switch(fangxiang){
			case "up":
				y += speed;
				break;
			case "down":
				y -= speed;
				break;
			case "left":
				x -= speed;
				break;
			case "right":
				x += speed;
				break;
			default:
				System.out.println("移动出现错误!");
				break;
		}
	}
	void eat(Apple anything){
		//狗吃东西的方法
		System.out.println(anything.name);
		if (anything.type != "food"){
			System.out.println("这玩意儿不能吃!");
		}
		else if (anything.type == "food"){
			System.out.println("这玩意儿能吃!狗吃了这玩意儿!");
			water_value += anything.water_value;
			jie_value += anything.jie_value;
		}

	}
	void showInfo(){
		//显示狗的信息
		System.out.println(x + "-" + y + "-" + speed  + "\n口渴度_" + water_value + "饥饿度_" + jie_value);
	}
	int fuck(){
		return jie_value;
	}
}
class Food{
	//食物的模型
	String type = "food";
}

class Apple extends Food{
	//苹果这个类	继承自食物
	String name = "apple";
	int water_value = 3;
	int jie_value = 4;
}

class MyDog{
	//我的狗
	public static void main(String[]args){
		int fuck = 0;
		Dog mydog = new Dog();//创建狗的对象
		Apple apple = new Apple();//创建苹果对象
		
		//do while 语句
		do{
			System.out.println("Move ! move!");
			mydog.move("up");//狗向上移动
			fuck += 1;//循环条件+1
		}while(fuck<10); 
		
		mydog.eat(apple);//狗吃苹果
		//System.out.pprintln(mydog.showInfo());//显示狗的信息
		System.out.println(mydog.name);

	}
}
//More Test
