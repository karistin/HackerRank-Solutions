package dataStructures;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class DequeueSol {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> hashSet = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();

        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            hashSet.add(num);
            if(deque.size() == m){
                if(hashSet.size() > max){
                    max = hashSet.size();
                }
                int removed = (int)deque.removeFirst();
                /*
                * deque에 개수를 제한하여 큐처럼 사용(오직 크기는 m만큼)
                * 이를 판별하기 위한 set사용
                * */
                if(!deque.contains(removed)){
                    hashSet.remove(removed);
                }
            }
        }
        System.out.println(max);
    }

    @Test
    public void dequeTesting() {
        System.out.println("Stack!!");
        Deque<String> stack = new ArrayDeque<>();
        stack.addFirst("Element1");
        stack.addFirst("Element2");
        stack.addFirst("Element3");
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());

        System.out.println("Queue!!");
        Deque<String> queue = new ArrayDeque<>();
        queue.addFirst("Element1");
        queue.addFirst("Element2");
        queue.addFirst("Element3");
        System.out.println(queue.removeLast());
        System.out.println(queue.removeLast());
        System.out.println(queue.removeLast());
    }

}
