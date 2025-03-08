package oopsPracticeQuestions.march1TO8;


import java.util.Random;

interface Scanner{

    void scanDoc(String fileName) throws ScanException;

    void convertToPdf(String fileName) throws ScanException;
}


    public class Scanning implements Scanner{
         boolean isScanned = false;
         boolean isConverted = false;

        @Override
        public void scanDoc(String fileName) throws ScanException {
            if (fileName.isEmpty()) {
                throw new ScanException("please insert a file.");
            }
            System.out.println("scanning document "+ fileName + "...");
            isScanned = new Random().nextBoolean();

            if (!isScanned) {
                throw new ScanException("error scanning document: " + fileName);
            }
            System.out.println("Document scanned successfully.");
        }

        @Override
        public void convertToPdf(String fileName) throws ScanException {
            if (!isScanned) {
                throw new ScanException("cna not convert.scan the document first.");
            }
            System.out.println("converting "+fileName+ " to PDF...");
            isConverted = true;
            System.out.println("Document converted to PDF.");
        }


    }




