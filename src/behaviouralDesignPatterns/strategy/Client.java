package behaviouralDesignPatterns.strategy;

public class Client {

    public static void main(String[] args) {
        CompressionContext compressionContext = new CompressionContext();
        compressionContext.setCompressionStrategy(new ZipCompression());
        //get a list of files
        //compressionContext.createArchive(fileList);
    }

}
