package com.tienda.bean;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "link")
public class Link {
	
	private String href,type;

	public Link() {
		super();
	}

	public Link(String href, String type) {
		super();
		this.href = href;
		this.type = type;
	}
	
	@XmlAttribute
	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	@XmlAttribute
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
