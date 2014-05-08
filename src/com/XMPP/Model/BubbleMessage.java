package com.XMPP.Model;

import com.XMPP.util.MessageType;

/**
 * Message is a Custom Object to encapsulate message information/fields
 * 
 * @author Adil Soomro
 * 
 */
public class BubbleMessage {

	boolean isMine;
	MessageType type;

	String message;
	int pictureID;
	String status;

	String filename;
	String filesize;
	
	
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getFilesize() {
		return filesize;
	}
	public void setFilesize(String filesize) {
		this.filesize = filesize;
	}

	public BubbleMessage(){
		
	}
	public BubbleMessage(String message ,MessageType type , boolean isMine) {
		super();
		this.type = type;
		this.message = message;
		this.isMine = isMine;
	}
	public BubbleMessage(int pictureID,boolean isMine){
		super();
		this.type = MessageType.PICTURE;
		this.pictureID = pictureID;
		this.isMine = isMine;
	}

	public BubbleMessage(String filename,String filesize ,MessageType type , boolean isMine){
		this.filename =filename;
		this.filesize = filesize;
		this.type = type;
		this.isMine = isMine;
	}
	public boolean isMine() {
		return isMine;
	}

	public void setMine(boolean isMine) {
		this.isMine = isMine;
	}

	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getPictureID() {
		return pictureID;
	}

	public void setPictureID(int pictureID) {
		this.pictureID = pictureID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String string = " Time : "  + this.type + " Content "  + this.getMessage();
		return string;
	}
	

}
