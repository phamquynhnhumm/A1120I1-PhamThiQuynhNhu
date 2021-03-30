package _bai12_Java_Collection_Framework._thuchanh;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class phanbiet_HashMap_HashSet  {
    public static void main(String[] args) {
        Student sv1 = new Student("Nhu", 21, "Thanh Hoa");
        Student sv2 = new Student("Huy", 2, "Quảng Nam");
        Student sv3 = new Student("Hanh", 30, "Dang Nang");
        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, sv1);
        studentMap.put(2, sv2);
        studentMap.put(3, sv3);

        for (Map.Entry<Integer, Student> stude :studentMap.entrySet())
        {
            System.out.println(stude.toString());
        }
        Set<Student> students = new HashSet<Student>();
        students.add(sv1);
        students.add(sv2);
        students.add(sv3);
        for(Student student : students)
        {
            System.out.println(student.toString());
        }
    }

    }



