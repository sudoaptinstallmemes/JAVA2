public class teamClient {
    public static void main(String [] args)
    {
        teamMain TeamName = new teamMain();

        TeamName.INPUT("Orioles");
        System.out.println("Team is named "+TeamName.getName().toString()+".");

        if(TeamName.equal(TeamName.getName()))
        {
            System.out.print(TeamName.getName()+" is a fake team.");
        }
    }
}
