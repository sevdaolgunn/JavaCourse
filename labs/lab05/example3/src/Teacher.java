public class Teacher {

    int id;
    private Branch branch;

    Teacher (int id, Branch branch){
        this.id = id;
        this.branch = branch;
    }

    public int getId() {
        return id;
    }

    public Branch getBranch() {
        return branch;
    }
}
