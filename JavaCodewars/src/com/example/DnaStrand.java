package com.example;

//Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the development and functioning of living organisms.
//
//        If you want to know more http://en.wikipedia.org/wiki/DNA
//
//        In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". You have function with one side of the DNA (string, except for Haskell); you need to get the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).
//
//        More similar exercise are found here http://rosalind.info/problems/list-view/ (source)
//
//        DnaStrand.makeComplement("ATTGC") // return "TAACG"
//
//        DnaStrand.makeComplement("GTAT") // return "CATA"
public class DnaStrand {
    public static String makeComplement(String dna) {
        dna = dna.replaceAll("A","Z");
        dna = dna.replaceAll("T","A");
        dna = dna.replaceAll("Z","T");
        dna = dna.replaceAll("C","Z");
        dna = dna.replaceAll("G","C");
        dna = dna.replaceAll("Z","G");
        return dna;
    }
}

//    public static String makeComplement(String dna) {
//        return dna.replace('T','X').replace('A','T').replace('X','A').replace('C','X').replace('G','C').replace('X','G');
//    }
