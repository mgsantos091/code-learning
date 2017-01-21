package alura;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.TreeMap;

import sun.net.www.protocol.http.HttpURLConnection;

public class TesteHtml {

	private String getAuth(String usr, String pwd) {
		String userPw = new sun.misc.BASE64Encoder().encode((usr + ":" + pwd)
				.getBytes());
		String auth = "Basic " + userPw;
		return auth;
	}
	
	private HttpURLConnection getHttpConn(String addr, String auth)
			throws IOException {
		URL url = new URL(addr);
		HttpURLConnection http = (HttpURLConnection) url.openConnection();
		http.setRequestProperty("Authorization", auth);
		return http;
	}
	
	private HttpURLConnection getHttpConn(String addr)
			throws IOException {
		URL url = new URL(addr);
		HttpURLConnection http = (HttpURLConnection) url.openConnection();
		http.setRequestMethod("POST");
		http.setDoInput(true);
		http.setDoOutput(true);
		return http;
	}
	
	private String getQuery(List<SimpleEntry> params) throws UnsupportedEncodingException
	{ 
	    StringBuilder result = new StringBuilder();
	    boolean first = true;

	    for (SimpleEntry pair : params)
	    {
	        if (first)
	            first = false;
	        else
	            result.append("&");

	        result.append(URLEncoder.encode((String)pair.getKey(), "UTF-8"));
	        result.append("=");
	        result.append(URLEncoder.encode((String)pair.getValue(), "UTF-8"));
	    }

	    return result.toString();
	}
	
	public static void main(String args[]) throws IOException {
		String addr = "http://webrh.decisiongroup.com.br/Logon/Login.aspx";
		String user = "40449053806";
		String pw = "l41js3wt";
		
		while (true) {
            System.out.println(new Date());
            try {
            	TesteHtml testeHtml = new TesteHtml();
            	HttpURLConnection httpConnection = testeHtml.getHttpConn(addr);
            	List<SimpleEntry> params = testeHtml.getParams();
            	
            	OutputStream os = httpConnection.getOutputStream();
            	BufferedWriter writer = new BufferedWriter(
            	        new OutputStreamWriter(os, "UTF-8"));
            	writer.write(testeHtml.getQuery(params));
            	writer.flush();
            	writer.close();
            	os.close();

            	httpConnection.connect();
            	
            	// PAGE READING PROCESS
        		StringBuffer resp = new StringBuffer();
        		try {
	        		BufferedReader in = new BufferedReader(new InputStreamReader(
	        				httpConnection.getInputStream()));
	        		String line;
	        		while ((line = in.readLine()) != null) {
	        			resp.append(line);
	        		}
	        		in.close();
	        		httpConnection.disconnect();
        		} catch(Exception e) {
        			System.err.println(e);
        			Thread.sleep(1 * 30 * 1000); // 5 MINUTES IN CASE OF CONNECTION PROBLEM - RETRY
        			continue;
        		}
        		// END PAGE READING PROCESS
        		
        		System.out.println(resp);
            	
            } catch(Exception e) {
            }
		}
		
	}

	private List<SimpleEntry> getParams() {
		ArrayList<SimpleEntry> params = new ArrayList<SimpleEntry>();
		params.add(new SimpleEntry("UserName", "40449053806"));
		params.add(new SimpleEntry("Password", "l41js3wt"));
		params.add(new SimpleEntry("LoginButton", "OK"));
		
		return params;
	}
	
}
