package dataStructures;

import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;
import org.junit.jupiter.api.Test;
import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.info.GraphLayout;

public class BitSetSol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        BitSet[] bs = new BitSet[3];

        bs[1] = b1;
        bs[2] = b2;

        for (int i = 0; i < m; i++){
            String nintendo = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();

            switch(nintendo){
                case("AND"):
                    bs[x].and(bs[y]);
                    break;
                case("OR"):
                    bs[x].or(bs[y]);
                    break;
                case("SET"):
                    bs[x].set(y);
                    break;
                case("FLIP"):
                    bs[x].flip(y);
                    break;
                case("XOR"):
                    bs[x].xor(bs[y]);
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
        sc.close();
    }

    @Test
    public void bitSetTest () {
        boolean[] bits = new boolean[1024];
        System.out.println(ClassLayout.parseInstance(bits).toPrintable());
        BitSet bitSet = new BitSet();
        System.out.println(GraphLayout.parseInstance(bitSet).toPrintable());
    }

    @Test
    public void bitSetCount() {
        BitSet bs1 = new BitSet();
        BitSet bs2 = new BitSet();
        BitSet bs3 = new BitSet();


        resetbit(bs1, bs2);
        System.out.println("bs1 : " + bs1);
        System.out.println("bs2 : " + bs2);
//        System.out.println("bs3 : " + bs3);

        System.out.println("bs1 AND bs2");
        bs1.and(bs2);
        System.out.println("bs1 : " + bs1);
        System.out.println("bs2 : " + bs2);


        resetbit(bs1, bs2);
        System.out.println("bs1 OR bs2");
        bs1.or(bs2);
        System.out.println("bs1 : " + bs1);
        System.out.println("bs2 : " + bs2);

        resetbit(bs1, bs2);
        System.out.println("bs1 XOR bs2");
        bs1.xor(bs2);
        System.out.println("bs1 : " + bs1);
        System.out.println("bs2 : " + bs2);

        resetbit(bs1, bs2);
        System.out.println("filp bs1 0 ");
        bs1.flip(6);
        System.out.println("bs1 : " + bs1);
        System.out.println("bs2 : " + bs2);
        // on bs2 set with bs1
//        bitsetCount
//        System.out.println(bs1.cardinality());
//        System.out.println(bs2.cardinality());
//        System.out.println(bs3.cardinality());
    }


    private void resetbit(BitSet a, BitSet b) {
                        /* set is BitSet class method
        explained in next articles */
        a.clear();
        b.clear();
        a.set(0);
        a.set(1);
        a.set(2);
        a.set(4);

        // assign values to bs2
        b.set(4);
        b.set(6);
        b.set(5);
        b.set(1);
        b.set(2);
        b.set(3);
    }
}
