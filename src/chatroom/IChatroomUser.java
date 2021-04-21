package chatroom;

public interface IChatroomUser {
	void sendMessage(String message);
	void receiveMessage(String message, IChatroomUser user);
	void setChatroom(IChatroom chatroom);
	IChatroom getChatroom();
	String getName();
}
