public class PostOffice {

    String name;

    public PostOffice(String name){
        this.name = name;
    }

    void send(Post post){
        String info = String.format("message: %s send by: %s receiver adress: %s",
                post.mesagge, post.sourceAdress, post.targetAdress);

        System.out.println(info);

    }
    void receive(Post post){
        String info = String.format("mesagge: %s received by: %s, from: %s",
                post.mesagge,post.sourceAdress, post.targetAdress);

        System.out.println(info);

    }

}
