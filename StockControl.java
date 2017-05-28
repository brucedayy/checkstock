import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class StockControl extends JPanel{
	static JTextField jt;
	static JButton btnSearch;
	static JLabel[] lbContentArr;
	public StockControl()
	{
		String[] labelStockTitle={"股票名字:","今开盘价:",
				"昨收盘价:","当前价格:","今日最高:","今日最低:","成交金额:","更新时间:"};
		jt=new JTextField(10);	
		jt.setText(mainui.mainstockcode);
		btnSearch=new JButton("查找");
		this.add(jt);
		this.add(btnSearch);
	    JLabel[] lbTitleArr=new JLabel[8];
	    lbContentArr=new JLabel[8];
	    for(int i=0;i<8;i++)
	    {
	    	lbTitleArr[i]=new JLabel(labelStockTitle[i]);		
	    	lbContentArr[i]=new JLabel();	    	
	    	this.add(lbTitleArr[i]);
	    	this.add(lbContentArr[i]);
	    }	    
	    new StockCrawler();	   
	    GetStockCode();
	    lbContentArr[0].setText("------"+StockCrawler.rjstr[0]+"------");
	    for(int i=1;i<6;i++)
	    	lbContentArr[i].setText("---------"+StockCrawler.rjstr[i]+"---------");
	    lbContentArr[6].setText("-----"+StockCrawler.rjstr[9]+"-----");
	    lbContentArr[7].setText("-------"+StockCrawler.rjstr[31]+"-------");	  
	}
	
	public static String GetStockCode()
	{	
		return jt.getText();
	}
}
