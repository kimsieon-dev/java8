package day200414;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Puzzler extends JPanel {
	JLabel[] lables;
	Point[] points;
	Block[] blocks;
	private int x;

	public static void main(String[] args) {
		JFrame f = new JFrame("���� ����");
		Puzzler p = new Puzzler();
		p.setLayout(null); // null -> ��ġ�� �ڵ����� ����
		p.makeGame();

		f.addKeyListener(p.getKeyListener());
		f.add(p);
		f.setSize(266, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.shuffleGame();
	}

	void makeGame() {
		lables = new JLabel[25];
		points = new Point[25];
		blocks = new Block[25];

		for (int i = 0; i < blocks.length; i++) {
			lables[i] = new JLabel(i + 1 + "", JLabel.CENTER);
			lables[i].setSize(50, 50);
			lables[i].setBorder(BorderFactory.createLineBorder(Color.BLUE));
			points[i] = new Point(i % 5 * 50, i / 5 * 50);
			lables[i].setLocation(points[i]);
			blocks[i] = new Block(lables[i], points[i]);
			this.add(lables[i]);
		}
		this.remove(lables[blocks.length - 1]);
		x = 25;
	}

	KeyListener getKeyListener() {
		KeyListener listener = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_LEFT && x % 5 != 0) {
					x++;
					moveGame(x, e.getKeyCode());
				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT && x % 5 != 1) {
					x--;
					moveGame(x, e.getKeyCode());
				} else if (e.getKeyCode() == KeyEvent.VK_UP && x <= 20) {
					x += 5;
					moveGame(x, e.getKeyCode());
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN && x >= 6) {
					x -= 5;
					moveGame(x, e.getKeyCode());
				}
//				System.out.println(x);
				matchGame();
			}
		};
		return listener;
	}

	void moveGame(int x, int keyCode) {
		JLabel lable;
		switch (keyCode) {
		case KeyEvent.VK_LEFT:
			lable = blocks[x - 1].getLable();
//			blocks[x - 1].setLable(null);
			blocks[x - 2].setLable(lable);
			lable.setLocation(blocks[x - 2].getPoint());
			break;
		case KeyEvent.VK_RIGHT:
			lable = blocks[x - 1].getLable();
//			blocks[x - 1].setLable(null);
			blocks[x].setLable(lable);
			lable.setLocation(blocks[x].getPoint());
			break;
		case KeyEvent.VK_UP:
			lable = blocks[x - 1].getLable();
//			blocks[x - 1].setLable(null);
			blocks[x - 6].setLable(lable);
			lable.setLocation(blocks[x - 6].getPoint());
			break;
		case KeyEvent.VK_DOWN:
			lable = blocks[x - 1].getLable();
//			blocks[x - 1].setLable(null);
			blocks[x + 4].setLable(lable);
			lable.setLocation(blocks[x + 4].getPoint());
			break;
		}
	}

	void shuffleGame() {
		for (int i = 0; i < 1000; i++) {
			int random = (int) (Math.random() * 4);
			int keyCode = 0;
			switch (random) {
			case 0:
				if (x % 5 != 0) {
					x++;
					moveGame(x, KeyEvent.VK_LEFT);
				}
				break;
			case 1:
				if (x % 5 != 1) {
					x--;
					moveGame(x, KeyEvent.VK_RIGHT);
				}
				break;
			case 2:
				if (x <= 20) {
					x += 5;
					moveGame(x, KeyEvent.VK_UP);
				}

				break;
			case 3:
				if (x >= 6) {
					x -= 5;
					moveGame(x, KeyEvent.VK_DOWN);
				}
				break;
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
		}
	}

	void matchGame() {
		int i = 0;
		for (i = 0; i < blocks.length; i++) {
			if (blocks[i].getLable().getText().equals(i + 1 + "")) {

			} else {
				break;
			}
			if (i == 23) {
				JOptionPane.showMessageDialog(this, "�����Դϴ�.");
			}
		}
	}

	class Block {
		private JLabel lable;
		private Point point;

		public Block(JLabel lable, Point point) {
			super();
			this.lable = lable;
			this.point = point;
		}

		public JLabel getLable() {
			return lable;
		}

		public void setLable(JLabel lable) {
			this.lable = lable;
		}

		public Point getPoint() {
			return point;
		}

		public void setPoint(Point point) {
			this.point = point;
		}

	}
}
