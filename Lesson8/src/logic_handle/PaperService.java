package logic_handle;

import entity.Paper;

import java.util.Scanner;

public class PaperService {
    public static Paper[] papers = new Paper[900];
    public static void displayPaper() {
        for (int i = 0; i < papers.length; i++) {
            System.out.println((i+1)+", "+papers[i]);
        }
    }

    public static void addPaper() {
        int numb;
        do {
            System.out.print("Enter number of new papers: ");
            numb = new Scanner(System.in).nextInt();
            if (numb >=0){
                break;
            }
            System.out.println("Invalid input, please try again!");
        } while (true);
        for (int i = 0; i < numb; i++) {
            Paper paper = new Paper();
            paper.inputInfo();
            for (int j = 0; j < papers.length; j++) {
                if (papers[j] == null){
                    papers[j] = paper;
                }
            }
        }
    }
}
