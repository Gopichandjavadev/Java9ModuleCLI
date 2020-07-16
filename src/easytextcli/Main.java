package easytextcli;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

import easytextapi.Analyzer;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //if (args.length == 1) {
        for (String arg : args) {
            System.out.println(arg);
        }
            System.out.println("Please provide file name "+args.length);
        //}
            
         List<List<String>> text = new ArrayList<List<String>>();
         Iterable<Analyzer> analyzers = ServiceLoader.load(Analyzer.class); 
         
         for (Analyzer analyzer :analyzers) {
             System.out.println(analyzer.getName() + ": " +analyzer.analyze(text));
         }
    }

}
