package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {
	
	// message sent from client to create publish a message on a topic
	String topic;
	String Message;

	public PublishMsg(String user, String topic, String message) {
	super(MessageType.PUBLISH,user);
	this.Message=message;
	this.topic=topic;

	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public void setMessage(String message) {
		Message = message;
	}

	@Override
	public String toString() {
		return "PublishMsg{" +
				"topic='" + topic + '\'' +
				", Message='" + Message + '\'' +
				super.toString()+
				'}';
	}


	public String getMessage() {
		return Message;
	}
}
