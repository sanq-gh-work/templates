package sanq.example.templates.mvc.heart;

import sanq.example.templates.mvc.IBPMObserver;
import sanq.example.templates.mvc.IBeatObserver;
import sanq.example.templates.mvc.heart.IHeartModel;

import java.util.*;

public class HeartModel implements IHeartModel, Runnable {
	ArrayList beatObservers = new ArrayList();
	ArrayList bpmObservers = new ArrayList();
	int time = 1000;
    int bpm = 90;
	Random random = new Random(System.currentTimeMillis());
	Thread thread;

	public HeartModel() {
		thread = new Thread(this);
		thread.start();
	}

	public void run() {
		int lastrate = -1;

		for(;;) {
			int change = random.nextInt(10);
			if (random.nextInt(2) == 0) {
				change = 0 - change;
			}
			int rate = 60000/(time + change);
			if (rate < 120 && rate > 50) {
				time += change;
				notifyBeatObservers();
				if (rate != lastrate) {
					lastrate = rate;
					notifyBPMObservers();
				}
			}
			try {
				Thread.sleep(time);
			} catch (Exception e) {}
		}
	}
	public int getHeartRate() {
		return 60000/time;
	}

	public void registerObserver(IBeatObserver o) {
		beatObservers.add(o);
	}

	public void removeObserver(IBeatObserver o) {
		int i = beatObservers.indexOf(o);
		if (i >= 0) {
			beatObservers.remove(i);
		}
	}

	public void notifyBeatObservers() {
		for(int i = 0; i < beatObservers.size(); i++) {
			IBeatObserver observer = (IBeatObserver)beatObservers.get(i);
			observer.updateBeat();
		}
	}

	public void registerObserver(IBPMObserver o) {
		bpmObservers.add(o);
	}

	public void removeObserver(IBPMObserver o) {
		int i = bpmObservers.indexOf(o);
		if (i >= 0) {
			bpmObservers.remove(i);
		}
	}

	public void notifyBPMObservers() {
		for(int i = 0; i < bpmObservers.size(); i++) {
			IBPMObserver observer = (IBPMObserver)bpmObservers.get(i);
			observer.updateBPM();
		}
	}
}
