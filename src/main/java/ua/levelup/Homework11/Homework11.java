package ua.levelup.Homework11;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

public class Homework11 {

    @Option(name = "-s", aliases = "-string", required = true)
    String str;

    @Option(name="-ch", aliases = "-change", handler =Handler.class)
    ParametersForChange pfc;

    @Option(name = "-r", aliases = "-reverse")
    boolean rev;


    public static void main(String[] args) {

        Homework11 main=new Homework11();
        CmdLineParser parser=new CmdLineParser(main);
        try {
            parser.parseArgument(args);
        } catch (CmdLineException e){
            e.printStackTrace();
        }
        System.out.println(main.str);
        Function function = new Function();

        if (main.rev) {
            System.out.println(function.reverseString(main.str));
        }

        if (main.rev && main.pfc!=null) {
            System.out.println(function.swapCharacters(main.str, main.pfc.from, main.pfc.to));
        }

    }
}

class Function{

    public String swapCharacters (String s, char from, char to) {
        return s.replace(from, to);
    }



    public String reverseString (String s){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            result.insert(0, s.charAt(i));
        }
        return result.toString();
    }
}