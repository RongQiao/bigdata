package com.bigdata.web;

import javax.jws.WebService;

@WebService(targetNamespace = "http://web.bigdata.com/", portName = "CommentDAOPort123", serviceName = "CommentDAOService")
public class CommentDAO {

	public String getVersion() {
		return "1.0";
	}
	
	public String hello(String user) {
		return "Hello " + user + "!";
	}

}
