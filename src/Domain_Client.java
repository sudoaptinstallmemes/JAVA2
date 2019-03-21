public class Domain_Client {
    // 66 pg 417
    public static void main(String [] args)
    {
        DoMain url = new DoMain();

        url.INPUT("www.google.com");
        System.out.println(url.chkDomain(url.getDomain()));
    }
}
