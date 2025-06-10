public class Main {
    public static void main(String[] args) {

        MediaFile[] files = new MediaFile[3];

        files[0] = new AudioFile();
        files[1] = new VideoFile();
        files[2] = new PodcastFile();

        TextFileViewer[] textFiles = new TextFileViewer[1];
        textFiles[0] = new TextFile();


        MediaFilePlayer mfp = new MediaFilePlayer(files);
        mfp.playAll();

        TextFileReader tfr = new TextFileReader(textFiles);
        tfr.viewAllTextFiles();
    }
}
