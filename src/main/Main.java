package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world");
        String[] names = new String[]{"Abby Truong", "Ahmed Mujtaba", "Azeez Temitope Olanrewaju", "Diming Chu", "Dongshuo Li", "Honorinicy",
                                     "Jason", "Jason", "Kelly Liu", "Kinjan", "Kun Li", "Muhammed Umar", "Oaz", "PQ", "Prithviatani", "Richard",
                                     "Sahil Slngh Sandhu", "Samuel Yang", "Scott(Shi-Kai) Jhou", "Shahbaz Mansahia", "Shahriar Kabir", "Shakur",
                                     "Shrina Patel", "Siyu Qiu", "Siyu Lei", "Sumid", "Tao", "Trivediakshay", "Yan Huang", "Zhaosaitong"};

        double ran = 0 + Math.random() * (29 + 1);
        String res = names[(int)ran];
        System.out.println(res);
        JOptionPane.showConfirmDialog(null, res, null, JOptionPane.YES_NO_OPTION);
    }
}
