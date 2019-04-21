import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Data {
	
	String data;
	
	public void pegarData(){
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		data = dateFormat.format(date);
	}

	public String getData() {
		return data;
	}

	public void setData(String hoje) {
		this.data = hoje;
	}
	
	

}
