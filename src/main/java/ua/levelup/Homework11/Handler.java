package ua.levelup.Homework11;


import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.OptionDef;
import org.kohsuke.args4j.spi.OptionHandler;
import org.kohsuke.args4j.spi.Parameters;
import org.kohsuke.args4j.spi.Setter;

public class Handler extends OptionHandler<ParametersForChange> {

    public Handler(CmdLineParser parser, OptionDef option, Setter<? super ParametersForChange> setter) {
        super(parser, option, setter);
    }

    @Override
    public int parseArguments(Parameters params) throws CmdLineException {
        char from = params.getParameter(0).toCharArray()[0];
        char to = params.getParameter(1).toCharArray()[0];
        setter.addValue(new ParametersForChange(from, to));
        return 2;
    }

    @Override
    public String getDefaultMetaVariable() {
        return null;
    }
}
