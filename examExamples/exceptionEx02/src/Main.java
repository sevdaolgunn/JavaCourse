public class Main {
    public static void main(String[] args) {

        try{
            NFT nft1 = new NFT(200, "sevda");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}