package com.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
	
	@GetMapping(value="/api/contact/V1",produces=MediaType.APPLICATION_JSON_VALUE)
	public Contact getContact() {
		return new Contact("TOM",12345);
		
	}
	@GetMapping(value="/api/contact/V2",produces=MediaType.APPLICATION_JSON_VALUE)
	public Contact2 getContact2() {
		return new Contact2("TOM",12345);
		
	}
	@GetMapping(value="/api/contact",produces=MediaType.APPLICATION_JSON_VALUE,params="version=v1")
	public Contact getContactQueryV1() {
		return new Contact("TOM",12345);
		
		
	}		

	@GetMapping(value="/api/contact",produces=MediaType.APPLICATION_JSON_VALUE,params="version=v2")
	public Contact2 getContactQueryV2() {
		return new Contact2("TOM",12345);
		
		
	}
	@GetMapping(value="/api/contact",produces=MediaType.APPLICATION_JSON_VALUE,headers="version=v1")
	public Contact getContactHeaderV1() {
		return new Contact("TOM",12345);
	}
	@GetMapping(value="/api/contact",produces=MediaType.APPLICATION_JSON_VALUE,headers="version=v2")
	public Contact2 getContactHeaderV2() {
		return new Contact2("TOM",12345);
	}
	@GetMapping(value="/api/contact",produces="application/contact.v1+json")
	public Contact getContactContentNegoV1() {
		return new Contact("TOM",12345);
	}
	@GetMapping(value="/api/contact",produces="application/contact.v2+json")
	public Contact2 getContactContentNegoV2() {
		return new Contact2("TOM",12345);
	}

}

class Contact{
	private String name;
	private int mobile;
	public Contact(String name, int mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
	}
	public Contact() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", mobile=" + mobile + "]";
	}
	
	
}
class Contact2{
	private String name;
	private int mobileNo;
	public Contact2(String name, int mobileNo) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
	}
	public Contact2() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Contact2 [name=" + name + ", mobileNo=" + mobileNo + "]";
	}
	
}
