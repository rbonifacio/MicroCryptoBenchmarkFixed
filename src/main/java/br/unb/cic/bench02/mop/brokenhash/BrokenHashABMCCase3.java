package br.unb.cic.mop.bench02.brokenhash;

import java.security.NoSuchAlgorithmException;

public class BrokenHashABMCCase3 {
    public static void main (String [] args) throws NoSuchAlgorithmException {
        BrokenHashABMC3 bh = new BrokenHashABMC3();
        String str = "abcdef";
        String crypto = "SHA-256";
        bh.go(str,crypto);
    }
}
