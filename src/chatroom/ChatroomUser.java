package chatroom;

public class ChatroomUser implements IChatroomUser {
	private String name;
	private IChatroom chatroom = null;
	
	public ChatroomUser(String name) {
		this.name = name;
	}
	
	public ChatroomUser(String name, IChatroom chatroom) {
		this.name = name;
		this.chatroom = chatroom;
		chatroom.addUser(this);
	}

	public void sendMessage(String message) {
		if (chatroom == null) {
			return;
		}
		chatroom.sendMessage(message, this);
		System.out.println(this.name + " - sendMessage, message: " + message);
	}

	public void receiveMessage(String message, IChatroomUser user) {
		System.out.println(this.name + " - receiveMessage, message: " + message + " user: " + user.getName());
	}

	public void setChatroom(IChatroom chatroom) {
		this.chatroom = chatroom;
	}
	
	public IChatroom getChatroom() {
		return chatroom;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return name;
	}
}
