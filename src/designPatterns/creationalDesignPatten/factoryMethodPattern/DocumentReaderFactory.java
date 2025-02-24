package designPatterns.creationalDesignPatten.factoryMethodPattern;

public class DocumentReaderFactory {
    public static DocumentReaders getReader(String fileType) {
        switch (fileType) {
            case "PDF":
                return new PDF();
            case "Word":
                return new Word();
            case "Excel":
                return new Excel();
            default:
                return null;
        }
    }
}
