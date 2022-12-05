public class Main {
    public static void main(String[] args) {

        Post post = new Post("Merhaba","Sinop","Karabuk");

        PostOffice postOffice1 = new PostOffice("Sinop PTT Subesi");
        postOffice1.send(post);

        PostOffice postOffice2 = new PostOffice("Karabuk PTT Subesi");
        postOffice2.receive(post);

    }
}