package chapter07.sec04;

public class Tv {
	private int channel;
	private int volume;
	private boolean onOff;
	private int serial;

	static int count = 0;

	public Tv() {
		super();

		count++;
		serial = count;
	}

	public Tv(int channel, int volume, boolean onOff) {
		super();

		count++;
		serial = count;
		this.channel = channel;
		this.volume = volume;
		this.onOff = onOff;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isOnOff() {
		return onOff;
	}

	public void setOnOff(boolean onOff) {
		this.onOff = onOff;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	@Override
	public String toString() {
		return "Tv [channel=" + channel + ", volume=" + volume + ", onOff=" + onOff + "]";
	}
}
