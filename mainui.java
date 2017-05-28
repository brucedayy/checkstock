import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class mainui extends JFrame{
	private int scrWidth;  //фад╩©М
	private int scrHeight;  //фад╩╦ъ
	static String mainstockcode="600600";
	public mainui()
	{
		super("CheckStock");
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();		
		scrWidth=screenSize.width;
		scrHeight=screenSize.height;		
		setLayout(new BorderLayout());
		setSize(782,480);
		setVisible(true);	
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(scrWidth/2-391,scrHeight/2-240);
		JPanel jp=new stockTabPanel();		
		jp.setPreferredSize(new Dimension(560,400));		
		JPanel jpl=new StockControl();		
		jpl.setPreferredSize(new Dimension(216,400));		
		this.add(jpl,BorderLayout.EAST);		
		this.setVisible(true);
		this.add(jp,BorderLayout.WEST);
		this.setVisible(true);
		ActionListener lis=new ActionListener(){						
			public void actionPerformed(ActionEvent e) {
				JButton jb=(JButton)e.getSource();	
				if(jb==StockControl.btnSearch)
				{					
					StockControl.lbContentArr[0].setText("------"+StockCrawler.rjstr[0]+"------");
				    for(int i=1;i<6;i++)
				    	StockControl.lbContentArr[i].setText("---------"+StockCrawler.rjstr[i]+"---------");
				    StockControl.lbContentArr[6].setText("-----"+StockCrawler.rjstr[9]+"-----");
				    StockControl.lbContentArr[7].setText("-------"+StockCrawler.rjstr[31]+"-------");					
				}
			}
		};
		StockControl.btnSearch.addActionListener(lis);
	}
	public static void main(String[] args)
	{
		new mainui();			
	}
}
