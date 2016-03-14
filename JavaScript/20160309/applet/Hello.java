import java.applet.Applet;
import java.awt.Graphics;
public class hello extends Applet{
	private String name;
	private int num;
	public void init(){
		name = getParameter("varname");
		num = integer.parseInt(getParameter("varnum"));
	}
	public void paint(Graphics g){
		g.drawString("欢迎" +　name + "来到java的世界，" + "你今年" + num + "岁了。",10,20 );
	}
}