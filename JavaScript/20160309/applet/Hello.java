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
		g.drawString("��ӭ" +��name + "����java�����磬" + "�����" + num + "���ˡ�",10,20 );
	}
}