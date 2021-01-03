public class Town {
    private People people;
    private int numberOfMember;
    private int homeNumber;
    public Town(People people, int numberOfMember, int homeNumber) {
        this.people = people;
        this.numberOfMember = numberOfMember;
        this.homeNumber = homeNumber;
    }



    public People getPeople() {
        return people;
    }



    @Override
    public String toString() {
        return super.toString()+","+numberOfMember+","+homeNumber;
    }
}
