public class DoMain {

    private String domain;

    public void INPUT(String tempDomain)
    {
        setDomain(tempDomain);
    }
    public String getDomain() {return domain;}


    public void setDomain(String domain) {
        this.domain = domain;
    }

    public boolean chkDomain(String domain)
    {
        System.out.println(domain);
        if (!(domain.substring(0,4).equals("www.")))
        {
            System.err.println("Invalid Domain");
            return false;
        }

        switch(domain.substring(domain.length()-4)){
            case ".gov":
            case ".com":
            case ".edu":
                System.out.println("Valid Domain.");
                return true;
            default:
                System.err.println("Invalid Domain.");
                return false;
        }

    }
}
