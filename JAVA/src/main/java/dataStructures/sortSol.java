package dataStructures;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

public class sortSol {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                if (st1.getCgpa() == st2.getCgpa()){
                    if (st1.getFname().compareTo(st2.getFname()) == 0)
                        return Integer.compare(st1.getId(), st2.getId());
                    else
                        return st1.getFname().compareTo(st2.getFname());
                }
                else
                    return Double.compare(st2.getCgpa(), st1.getCgpa());
            }
        });

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }

    @Test
    public void floatTest() {
        System.out.println(Math.round(3.68 - 3.85));
    }

    @Test
    public void StringCompareToTest() {
//      기준값 "abcd"에 비교대상"ab"에 포함되어 있는 경우
//        서로의 문자열의 길이의 차이를 리턴
        Assertions.assertEquals("abcd".compareTo("ab"), 2);
//        하지만 같은 위치의 문자만 비교하기 때문에 첫번째 문자부터 순서대로 비교해서 다를 경우 바로 아스키 값 기준
//        으로 비교처리를 해준다.
//         int(a:97) - int(c:99) = -2
        Assertions.assertEquals("abcd".compareTo("c"), -2);
    }
}
