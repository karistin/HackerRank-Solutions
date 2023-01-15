package dataStructures;

import java.util.Arrays;
import java.util.BitSet;
import org.junit.jupiter.api.Test;
import org.openjdk.jol.info.ClassLayout;

public class BitSetSol {

    @Test
    public void bitSetTest () {
        boolean[] bits = new boolean[1024];
        System.out.println(ClassLayout.parseInstance(bits).toPrintable());
        BitSet bitSet = new BitSet();



    }

}
