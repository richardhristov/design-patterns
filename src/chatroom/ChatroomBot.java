package chatroom;

public class ChatroomBot extends ChatroomUser {
	private static ChatroomBot instance = null;
	
	public ChatroomBot() {
		super("bot");
	}
	
	public ChatroomBot(IChatroom chatroom) {
		super("bot", chatroom);
	}

	public static ChatroomBot getInstance() {
		if(instance == null) {
			instance = new ChatroomBot();
		}
		
		return instance;
	}
	
	@Override
	public void receiveMessage(String message, IChatroomUser user) {
		if (message.contains("cat") && user != this) {
			this.getChatroom().sendMessage(user.getName() + " has said the bad word \"cat\", kicking them", this);
			this.getChatroom().removeUser(user);
		}
	}
}
