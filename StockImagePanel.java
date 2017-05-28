import java.awt.Graphics;
import java.io.IOException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class StockImagePanel extends JPanel{
	URL url;
	private String stockline="";
	public StockImagePanel(String sl)
	{
		stockline=sl;
	}
	public void paint(Graphics g)
	{		
		super.paint(g);		
		try{
			url=new URL("http://image.sinajs.cn/newchart/"+stockline+"/n/sh"+StockControl.GetStockCode()+".gif");
			ImageIcon icon=new ImageIcon(url);
			g.drawImage(icon.getImage(),0,50,545,300,this);			
		}catch(IOException e)
		{}		
	}
}
