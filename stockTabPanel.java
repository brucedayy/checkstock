import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class stockTabPanel extends JPanel{
	JTabbedPane tab=new JTabbedPane(JTabbedPane.BOTTOM);	
	JPanel pMiLine=new StockImagePanel("min");
	JPanel pDaLine=new StockImagePanel("daily");
	JPanel pWeLine=new StockImagePanel("weekly");
	JPanel pMoLine=new StockImagePanel("monthly");
	JPanel pHelp=new JPanel();
	public stockTabPanel()
	{
		tab.add(pMiLine,"��ʱ��");
	    tab.add(pDaLine,"��K��");
	    tab.add(pWeLine,"��K��");
	    tab.add(pMoLine,"��K��");	
	    tab.add(pHelp,"Help");
	    setLayout(new BorderLayout());	   
	    add(tab,BorderLayout.CENTER);
	}
}
