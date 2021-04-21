package chatroom;

public class ChatroomMain {

	public static void main(String[] args) {
		var chatroom = new Chatroom();
		
		var tom = new ChatroomUser("Tom", chatroom);
		var jerry = new ChatroomUser("Jerry", chatroom);
		var dog = new ChatroomUser("Dog", chatroom);
		
		tom.sendMessage("Hello there!");
		dog.sendMessage("addBot");
		jerry.sendMessage("I hate that cat");
		
		System.out.println(chatroom.getUsers().toString());
	}

}
