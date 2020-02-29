package com.test.springboot.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;

import javax.xml.ws.spi.http.HttpContext;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;


@EnableAutoConfiguration
@Controller
public class meetingController {
	

	
	//读取配置文件中的自定义属性值
	@Value("${spring.name}")
	private String name;
	
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		return "hello world"+"     "+name;
	}

	
	@RequestMapping("/index")
	public String index() {
		return "views/welcome";
	}
	
	//http://localhost:5080/openmeetings/MethodGateway?service=userservice&method=getSession
	//1FBB0AB463893095BAA846D458B6A5A5
	//3c518caea4004a91849ec6c6c8854189
	@RequestMapping("/sid")
	@ResponseBody
	public String getSessionID() throws ClientProtocolException, IOException {
		String seesionID="";
	      CloseableHttpClient httpClient = HttpClients.createDefault();
	        HttpGet get=new HttpGet("http://192.168.0.25:5080/openmeetings/MethodGateway?service=userservice&method=getSession");
	        HttpClientContext context = HttpClientContext.create();
	        try {
	            CloseableHttpResponse response = httpClient.execute(get, context);
	            try{
	                System.out.println(">>>>>>headers:");
	                Arrays.stream(response.getAllHeaders()).forEach(System.out::println);
	                System.out.println(">>>>>>cookies:");
	                context.getCookieStore().getCookies().forEach(System.out::println);
	                List<Cookie>  cookies=context.getCookieStore().getCookies();
	                System.err.println(cookies.size());
	                Cookie cookieSessionID=cookies.get(0);
	                seesionID=cookieSessionID.getValue();
	            }
	            finally {
	                response.close();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }finally {
	            try {
	                httpClient.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    
                     return seesionID;
	}    
	
}
