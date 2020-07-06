package main;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world");
        String[] input = new String[]{"Abby Truong", "Ahmed Mujtaba", "Azeez Temitope Olanrewaju", "Diming Chu", "Dongshuo Li", "Honorinicy",
                                     "Jason", "Jason", "Kelly Liu", "Kinjan", "Kun Li", "Muhammed Umar", "Oaz", "PQ", "Prithviatani", "Richard",
                                     "Sahil Slngh Sandhu", "Samuel Yang", "Scott(Shi-Kai) Jhou", "Shahbaz Mansahia", "Shahriar Kabir", "Shakur",
                                     "Shrina Patel", "Siyu Qiu", "Siyu Lei", "Sumid", "Tao", "Trivediakshay", "Yan Huang", "Zhaosaitong"};
        ArrayList<String> names = new ArrayList<>();
//        names.addAll(input);
        for (String i : input) {
            names.add(i);
        }
        int size = names.size();
        int tmp;
        while (size != 0) {
            tmp = names.size();
            double ran = 0 + Math.random() * (tmp);
            String res = names.get((int)ran);
            System.out.println(res);
            JOptionPane.showConfirmDialog(null, res, null, JOptionPane.YES_NO_OPTION);
            size--;
            names.remove((int)ran);
        }


    }
}
