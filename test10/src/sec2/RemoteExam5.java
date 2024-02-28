package sec2;
//형변환
public class RemoteExam5 {
	public static void main(String[] args) {
		RemoteControl r;
		
		r= new RemoteControl() {
			int volume;
			public void turnOff() {System.out.println("기기 전원 OFF");}
			public void turnOn() {System.out.println("기기 전원 ON");}
			public void setVolume(int volume) {
				if(volume>MAX) this.volume = RemoteControl.MAX;
				else if(volume<MAX) this.volume = RemoteControl.MIN;
				else this.volume = volume;
			}
			public void setMute(boolean mute) {
				if(mute) System.out.println("무음 처리");
				else System.out.println("무음 해제");
			}
			public void changeBattery() {
				System.out.println("건전지 교체");
			}
		};
		r = new Screen() {
			int lightness;
			int zoom;
			int volume;
			public void turnOff() {System.out.println("기기 전원 OFF");}
			public void turnOn() {System.out.println("기기 전원 ON");}
			public void setVolume(int volume) {
				if(volume>MAX) this.volume = RemoteControl.MAX;
				else if(volume<MAX) this.volume = RemoteControl.MIN;
				else this.volume = volume;
			}
			public int light() {System.out.println("밝게");
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
		};
		r = new Audio();
		
		r = new Television();
	}
}