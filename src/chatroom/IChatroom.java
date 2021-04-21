package chatroom;

import java.util.ArrayList;

public interface IChatroom {
	void sendMessage(String message, IChatroomUser user);
	void addUser(IChatroomUser user);
	void removeUser(IChatroomUser user);
	ArrayList<IChatroomUser> getUsers();
}
