public class Dog{
	private int x = 3;
	public int showX(){
		return x;
	}
	public void resizeX(int num){
		if(num > 0 ){
			x = num;
		}
	}
}
class wtf{
	public static void main(String[]args){
		Dog dog = new Dog();
		dog.resizeX(19);
		System.out.println(dog.showX());
		
	}
}