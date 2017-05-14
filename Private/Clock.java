public class Clock{
	private int time = 0;
	int getTime(){
		return time;
	}
	int setTime(int arg){
		if(arg>0){
			time = arg;
			return 0;
		}else{
			return 1;
		}
	}
}
class ClockMain{
	public static void main(String[]args){
		Clock c = new Clock();
		System.out.println(c.getTime());
		c.setTime(10033);
		System.out.println(c.getTime());
	}
}