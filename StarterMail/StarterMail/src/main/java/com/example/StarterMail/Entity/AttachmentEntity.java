package com.example.StarterMail.Entity;

public class AttachmentEntity {

	private String fromMail;
	private String toMail;
	private String subject;
	private String body;
	private String attachment;
	
	public AttachmentEntity() {}

	public AttachmentEntity(String fromMail, String toMail, String subject, String body, String attachment) {
		super();
		this.fromMail = fromMail;
		this.toMail = toMail;
		this.subject = subject;
		this.body = body;
		this.attachment = attachment;
	}

	public String getFromMail() {
		return fromMail;
	}

	public void setFromMail(String fromMail) {
		this.fromMail = fromMail;
	}

	public String getToMail() {
		return toMail;
	}

	public void setToMail(String toMail) {
		this.toMail = toMail;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	@Override
	public String toString() {
		return "AttachmentEntity [fromMail=" + fromMail + ", toMail=" + toMail + ", subject=" + subject + ", body="
				+ body + ", attachment=" + attachment + "]";
	}
	
	
}
