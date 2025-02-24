package designPatterns.creationalDesignPatten.factoryMethodPattern;


//8. Document Reader – Creating PDF, Word, or Excel file reader dynamically.
interface DocumentReaders {
    void read(String name);
}
class PDF implements DocumentReaders{

    @Override
    public void read(String fileName) {
        System.out.println("Reading PDF file: " + fileName + " 📄");
    }
}

class Word implements DocumentReaders{


    @Override
    public void read(String fileName) {
        System.out.println("Reading word file: " + fileName + " 📄");

    }
}

class Excel implements DocumentReaders{


    @Override
    public void read(String fileName) {
        System.out.println("Reading Excel file: " + fileName + " 📄");

    }
}