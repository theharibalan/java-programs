package mySBI;

import accOpen.openacc;
import accwWithdrawl.withD;
public class Myacc {
    public static void main(String[] args) {
        openacc op = new openacc();
        op.dispInfo();
        withD w1 = new withD();
        w1.m2();
    }
}
