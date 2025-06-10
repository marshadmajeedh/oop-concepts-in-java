public class MediaFilePlayer implements Playable{

    private MediaFile[] mediaFile;

    public MediaFilePlayer(MediaFile[] mediaFile) {
        this.mediaFile = mediaFile;
    }
    @Override
    public void playAll() {

        System.out.println("Playing " + mediaFile.length + " media files");
        for (MediaFile mf : mediaFile) {
            mf.play();
        }
    }
}
