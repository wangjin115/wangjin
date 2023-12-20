package digui;

public class Homework09 {

	public static void main(String[] args) {
		 Music music = new Music("music", 300);
		 music.play();
		 System.out.println(music.getInfo());
		
	}
	
	
}
//定义music类，有音乐名和音乐时长属性，并设置播放play功能和返回本身属性信息的功能方法 
class Music {
	String name;
	double times;
	public Music(String name,double times) {
		this.name=name;
		this.times=times;
		
	}
	public void play() {
		System.out.println("音乐"+ name +"正在播放。。。时长为" + times+ "秒");
				
	}
	public String getInfo() {
		return "音乐"+ name + "时长" + times +"秒";
	}
}
