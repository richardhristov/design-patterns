package chatroom;

import java.util.ArrayList;

public class Chatroom implements IChatroom {
	private ArrayList<IChatroomUser> users = new ArrayList<IChatroomUser>();
	
	public Chatroom() {
		
	}
	
	public Chatroom(ArrayList<IChatroomUser> users) {
		this.users = users;
	}

	@SuppressWarnings("unchecked")
	public void sendMessage(String message, IChatroomUser user) {
		for(IChatroomUser u: (ArrayList<IChatroomUser>)users.clone()) {
			if (user == u) {
				continue;
			}
			u.receiveMessage(message, user);
		}
		if (message.equals("addBot")) {
			ChatroomBot bot = ChatroomBot.getInstance();
			bot.setChatroom(this);
			addUser(bot);
		}
	}

	public void addUser(IChatroomUser user) {
		if (!users.contains(user)) {
			users.add(user);
		}
		user.setChatroom(this);
	}

	public void removeUser(IChatroomUser user) {
		users.remove(user);
		user.setChatroom(null);
	}
	
	public ArrayList<IChatroomUser> getUsers() {
		return users;
	}
}
