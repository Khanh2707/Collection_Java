package Heap.Design;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class Heap {
    public static class Student implements Comparable {
        public String name;
        public int age;
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Object o) {
            Student other = (Student) o;
            return Integer.compare(this.age,other.age);
        }
    }

    public static void main(String[] args) {
        Queue<Student> minHeap = new PriorityQueue<>();
        minHeap.add(new Student("A",1));
        minHeap.add(new Student("B",2));
        minHeap.add(new Student("C",5));
        minHeap.add(new Student("D",3));
        minHeap.add(new Student("E",4));
        minHeap.add(new Student("F",6));
        minHeap.add(new Student("G",7));

        while (minHeap.isEmpty() == false) {
            Student smallest = minHeap.poll();
            System.out.println(smallest.name + " " +smallest.age);
        }

        Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.add(5);
        maxHeap.add(4);
        maxHeap.add(2);
        maxHeap.add(3);
        maxHeap.add(8);
        maxHeap.add(6);
        maxHeap.add(7);

        while (maxHeap.isEmpty() == false) {
            System.out.println(maxHeap.poll());
        }
    }
}
