package org.redcoded.restfulws.utm.model;

import javax.xml.bind.annotation.XmlAttribute;

public class Link {
	private String href, rel;

	public Link() {}
	
	public Link(String href, String rel) {
		this.href = href;
		this.rel = rel;
	}

	@XmlAttribute
	public String getHref() {
		return href;
	}

	@XmlAttribute
	public String getRel() {
		return rel;
	}

	public void setHref(String href) {
		this.href = href;
	}
	
	public void setRel(String rel) {
		this.rel = rel;
	}
}