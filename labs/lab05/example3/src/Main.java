public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher(123, Branch.ENG);
        Teacher teacher2 = new Teacher(456, Branch.CS);
        Teacher teacher3 = new Teacher(789,Branch.PHYSICS);
        Teacher teacher4 = new Teacher(987, Branch.MATH );

        Teacher[] teachers = {teacher1,teacher2,teacher3,teacher4};
        for(Teacher t : teachers){
            System.out.println(t.getId() + " branch " +t.getBranch());
        }

    }
}