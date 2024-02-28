package sec2;

public class Television implements Screen {
	int volume;
	int lightness;
	int zoom;

	public void turnOff() {
		System.out.println("전원 OFF");
	}

	public void turnOn() {
		System.out.println("전원 ON");
	}

	public void setVolume(int volume) {
		if(volume>MAX) {
			this.volume = RemoteControl.MAX;
			System.out.println("현재 볼륨 : "+MAX);
		}	else if(volume<MIN) {
			this.volume = RemoteControl.MIN;
			System.out.println("현재 볼륨 : "+MIN);
		}	else {
			this.volume = volume;
			System.out.println("현재 볼륨 : "+volume);
		}		
	}	

	public int light() {
		System.out.println("밝게");
		if(this.lightness<255 && this.lightness>0) {
			this.lightness++;
		}
		return this.lightness;
	}

	public int dark() {
		System.out.println("어둡게");
		if(this.lightness<255 && this.lightness>0) {
			this.lightness--;
		}
		return this.lightness;
	}

	public int zoomin() {
		System.out.println("확대");
		if(zoom>=-500 && zoom<=500) {
			zoom+=50;
		}
		return zoom;
	}

	public int zoomout() {
		System.out.println("축소");
		if(zoom>=-500 && zoom<=500) {
			zoom-=50;
		}
		return zoom;
	}

}
