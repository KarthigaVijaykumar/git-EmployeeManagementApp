package entity;

public class Track {
	private int trackId;
	private String trackName;
	public Track(int trackId, String trackName) {
		super();
		this.trackId = trackId;
		this.trackName = trackName;
	}
	public int getTrackId() {
		return trackId;
	}
	public void setTrackId(int trackId) {
		this.trackId = trackId;
	}
	public String getTrackName() {
		return trackName;
	}
	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}
}
