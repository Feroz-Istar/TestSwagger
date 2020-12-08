package mytest;

import com.google.gson.Gson;

import pojo.User;

public class TestJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	User user = new User("", "", "feroz@salesken.ai", "test123", "");

	System.out.println(new Gson().toJson(user));
	}

}
