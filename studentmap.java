import java.util.HashMap;

class StudentMap
{
    public static void main(String args[])
    {
        HashMap<Integer, String> students = new HashMap<Integer, String>();

        students.put(101, "Rahul");
        students.put(102, "Priyasi");
        students.put(103, "Amitabh");
        students.put(104, "Snehal");

        System.out.println("Student Details:");

        for(Integer roll : students.keySet())
        {
            System.out.println(roll + " : " + students.get(roll));
        }
    }
}
