package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        int i = 0;
        while ( i < lastPrinted){
            if(i == 3) continue;

            System.out.println(i);
            i++;

        }

    }
}
