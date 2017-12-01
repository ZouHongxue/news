package com.zhx.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class BaiduApi {
	
	private URL url;
	private HttpURLConnection connection;
	public void doGet() throws IOException{
		StringBuffer res = new StringBuffer();
		String temp;
		String key = "2dff9384f9db2e2a5ae19341a4416e36";
		String u = "http://api.avatardata.cn/ActNews/LookUp";
		url = new URL(u);
		connection = (HttpURLConnection) url.openConnection();
		connection.setDoOutput(true);
		connection.setRequestMethod("GET");
		connection.setRequestProperty("key", key);
		connection.setIfModifiedSince(99999999);
		InputStream in = connection.getInputStream();
		BufferedReader bd = new BufferedReader(
				new InputStreamReader(in));
		while ((temp = bd.readLine())!=null) {
			res.append(temp);
		}
		System.out.println(res);
	}
	public static void main(String[] args) throws IOException {
		BaiduApi baiduApi = new BaiduApi();
		baiduApi.doGet();
	}
}
