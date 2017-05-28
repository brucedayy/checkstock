import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.swing.JOptionPane;

public class StockCrawler {
	URL url;
	static String jsonstr="";
	String stockcode="";  //股票代码
	String[] jstr=new String[3];
	static String[] rjstr=new String[32];  //股票信息
	int c;
	public StockCrawler()
	{
		stockcode=StockControl.GetStockCode();
		try{
			url=new URL("http://hq.sinajs.cn/list=sh"+stockcode);
			InputStream is=url.openStream();
			BufferedInputStream bis=new BufferedInputStream(is);
			InputStreamReader r=new InputStreamReader(bis);
			while((c=r.read())!=-1)
			{
				jsonstr+=(char)c;
			}
			bis.close();
		}catch(IOException e){
			JOptionPane.showMessageDialog(null, "网络异常");
		}
		jstr=jsonstr.split("\"");
		if(jstr[1]=="")
			JOptionPane.showMessageDialog(null, "请求异常");			
		rjstr=jstr[1].split(",");
	}
}
