package multiThreading;

public class FileDownloader extends Thread{
    String fileName;
    int duration;
    FileDownloader( String fileName, int duration){
        this.duration=duration;
        this.fileName=fileName;
    }
    @Override
    public void run() {
        
    }
}
