public class PostOffice {

    String name;

    PostOffice(String name){
        this.name = name;
    }
    void send(Post post){
        String info = String.format("content: %s send by: %s  to receiver adress %s:",
                post.content, post.senderAdress, post.receiverAdress);
        System.out.println(info);

    }
    void receive(Post post){
        String info = String.format("content: %s received by: %s from adress: %s",
                post.content, post.senderAdress, post.receiverAdress);
        System.out.println(info);

    }
}
