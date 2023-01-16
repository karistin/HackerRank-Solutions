package dataStructures;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

class Student2 implements Comparable<Student2>{
    int id;
    String name;
    double cgpa;

    public Student2(String name, double cgpa, int id) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student2 o) {
        if (this.getCgpa() == o.getCgpa()){
            if (this.name.compareTo(o.getName()) == 0)
                return Integer.compare(this.getId(), o.getId());
            else
                return this.name.compareTo(o.getName());
        }
        else
            return Double.compare(o.getCgpa(), this.getCgpa());
    }
}

class Priorities {
    public List<Student2> getStudents(List<String> event) {
        List<Student2> student2List = new ArrayList<>();

        for (String ev : event) {
            String[] data = ev.split(" ");
            if (data[0].equals("ENTER")) {
                Student2 student2 = new Student2(data[1], Double.parseDouble(data[2]), Integer.parseInt(data[3]));
                student2List.add(student2);
                Collections.sort(student2List);
            } else if (data[0].equals("SERVED")) {
                if(!student2List.isEmpty())
                    student2List.remove(0);
            }
        }

        return student2List;
    }
}


//class Priorities{
//    public final List<Student> getStudents(List<String> events){
//        List<Student> students = new ArrayList<>();
//        PriorityQueue<Student> pQueue = new PriorityQueue<>();
//        for(String event : events){
//            if(event.equalsIgnoreCase("SERVED")){
//                pQueue.poll();
//            } else {
//                String [] detailsStudent = event.split(" ");
//                int idStudent = Integer.parseInt(detailsStudent[3]);
//                String nameStudent = detailsStudent[1];
//                double cpgaStudent = Double.parseDouble(detailsStudent[2]);
//                pQueue.add(new Student(idStudent, nameStudent ,cpgaStudent));
//            }
//        }
//        while(!pQueue.isEmpty()){
//            students.add(pQueue.poll());
//        }
//        return students;
//    }
//}

public class PriorityQueueSol {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student2> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student2 st: students) {
                System.out.println(st.getName());
            }
        }
    }


    @Test
    public void priorityQueue() {
//        낮은 숫자가 우선 순위인 int 형 우선순위 큐
        PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();
//        높은 숫자가 우선 순위인 int 형 우선순위 큐
        PriorityQueue<Integer> priorityQueueHighest = new PriorityQueue<>(Collections.reverseOrder());

        priorityQueueLowest.add(1);
        priorityQueueLowest.add(10);
        priorityQueueLowest.offer(100);

    }


    @Test
    public void equallIgnoreTest() {
        assertTrue("abc".equalsIgnoreCase("ABC"));
    }
}
