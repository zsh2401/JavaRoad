public class RunDog{
	public static void main(String[]args){
		//苟
		int dog_num = 7;//苟的数量
		Dog[] dogs = new Dog[dog_num];//创建一个用来装苟的数组
		
		//int c = 0;//控制循环次数和要弄的苟
		//while (c < dog_num){//while循环
		//	dogs[c] = new Dog();//给数字创建苟
		//	System.out.println(dogs[c].name);
		//	dogs[c].eat();//苟改不了斥诗
		//	c ++;//+1s
		//}
		
		for (int c = 0;c < dog_num ;c++){
			dogs[c] = new Dog();//给数字创建苟
			System.out.println(dogs[c].name);
			dogs[c].eat();//苟改不了斥诗
		}
		
		dogs[5] = dogs[6];//狗5和狗6引用了同一个对象(同一只狗)
		dogs[5].name = "sb dog";//狗5改名
		System.out.println(dogs[6].name);//狗6的名字也变了
		System.out.println(dogs.length);//显示数组长度
	}
}