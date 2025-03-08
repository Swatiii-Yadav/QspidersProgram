package oopsPracticeQuestions.march1TO8;

public class ScannerServiceException {
    public void processScanning(Scanner scanner, String fileName) {
        try {
            scanner.scanDoc(fileName);
            scanner.convertToPdf(fileName);
        } catch (ScanException e) {
            System.out.println("Error in scanning process: " + e.getMessage());
        }
    }
}
