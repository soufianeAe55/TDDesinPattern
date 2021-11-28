import strategy.FilterStrategyImpl;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Framework framework=new Framework();
        int [] arr={1,3,6};
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        framework.appliquerFilter(name,arr);
        framework.compresser(arr);
        System.out.println("------------------------------------");
        name=sc.nextLine();
        framework.appliquerFilter(name,arr);
        framework.compresser(arr);


    }
}
