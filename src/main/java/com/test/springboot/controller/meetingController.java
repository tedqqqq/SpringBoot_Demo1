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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.test.openmeetings.service.UserService;


@EnableAutoConfiguration
@Controller
public class meetingController {
	

	@Autowired
	UserService userService;
	
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
	
	/**
	 * 登陆页面
	 * @return
	 */
	@RequestMapping("/login")
	public String main() {
		return "login";
	}
	
	/**
	 * 判断登陆操作
	 * @return
	 */
	@RequestMapping(value="/meetings/login", method=RequestMethod.POST)
	public String login(@RequestParam(value = "accountname", required = true) String name,@RequestParam(value = "password", required = true) String password) {
		
		System.err.println("获取信息"+name+"---"+password);
		System.err.println();
		if(!(userService.selecUser(name, password)==null)) {
			return "notifications";
		}else {
			return "register";
		}
	}
	
	
	
	@ResponseBody
	@RequestMapping("/db/{1}/{2}")
	public String testDB(@PathVariable("1") String p1,@PathVariable("2") String p2) {
		System.err.println(p1+"----"+p2);
		System.err.println(userService.list());
		return "dffedfd";
	}
	
}
