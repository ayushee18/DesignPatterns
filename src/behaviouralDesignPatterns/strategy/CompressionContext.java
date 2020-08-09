package behaviouralDesignPatterns.strategy;

import java.io.File;
import java.util.ArrayList;

/* Our context will provide a way for the client to compress the files. Let's say that there is a preferences setting
in our application that sets which compression algorithm to use.
We can change our strategy using the setCompressionStrategy method in the Context.  */
public class CompressionContext {

    private CompressionStrategy compressionStrategy;

    //this can be set at runtime by the application preferences
    public void setCompressionStrategy(CompressionStrategy compressionStrategystrategy) {
        this.compressionStrategy = compressionStrategystrategy;
    }

    //use the strategy
    public void createArchive(ArrayList<File> files) {
        compressionStrategy.compressFiles(files);
    }
}
