package edu.frcc.csclub.cc;

import java.awt.Color;

public class TemplateCCApp extends CCApp {
	private static final int WIDTH = 800;
	private static final int HEIGHT = 500;

	public TemplateCCApp() {
		super("Template CCApp", WIDTH, HEIGHT);
		// WARNING: Do not call getGfx() here.  It will break.
		// All of your initialization code should go in the begin method.
	}

	@Override
	public void begin() {for (int i = 0; i < NUM_POINTS; ++i) {
			xPoints[i] = getRandom().nextInt(WIDTH);
			yPoints[i] = getRandom().nextInt(HEIGHT);
		// TODO Initialize your application here.

	}

	@Override
	public void update() {for (int i = 0; i < NUM_POINTS; ++i) {
			xPoints[i] += getRandom().nextInt(5) - 2;
			yPoints[i] += getRandom().nextInt(5) - 2;
		// TODO Update your application here.

	}

	@Override
	public void paint() {
		// TODO Draw your application here.
		// e.g.
		getGfx().setColor(Color.blue);
		getGfx().fillRect(0, 0, WIDTH, HEIGHT);
		int x = getRandom().nextInt(WIDTH);
		int y = getRandom().nextInt(HEIGHT);
	}

	public static void main(String[] args) {
		// TODO Start your application by creating it.
		new TemplateCCApp();
	}

}
