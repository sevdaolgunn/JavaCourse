public class Main {
    public static void main(String[] args) {

        Post post = new Post("this is some post...","KARABUK KLAVUZLAR VILLAGE", "CANKAYA CENTER");

        PostOffice postOffice1 = new PostOffice("KARABUK PO");
        postOffice1.send(post);

        PostOffice postOffice2 =new PostOffice("ANKARA PO");
        postOffice2.receive(post);

    }
}