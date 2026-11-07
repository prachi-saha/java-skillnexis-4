import java.util.ArrayList;

class StudentList
{
    public static void main(String args[])
    {
        ArrayList<String> students = new ArrayList<String>();

        students.add("Rahul");
        students.add("Priyasi");
        students.add("Amitabh");
        students.add("Snehal");

        System.out.println("Student Names:");

        for(String name : students)
        {
            System.out.println(name);
        }
    }
}
