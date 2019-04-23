import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyDemo {

	private JFrame frame;
	private JPanel panel_search;
	private JPanel panel_userInfo;
	private JPanel panel_logOut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyDemo window = new MyDemo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 676, 442);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JPanel panel_homePage = new JPanel();
		panel.add(panel_homePage);
		
		JPanel panel_querySocres = new JPanel();
		panel.add(panel_querySocres);
		
		//选课
		JPanel panel_courseSelect_queryCourse = new JPanel();
		panel.add(panel_courseSelect_queryCourse);
		
		JPanel panel_courseSelect_courseList = new JPanel();
		panel.add(panel_courseSelect_courseList);
		
		JPanel panel_courseSelect_courseSelected = new JPanel();
		panel.add(panel_courseSelect_courseSelected);
		
		
		JPanel panel_trainPlan = new JPanel();
		panel.add(panel_trainPlan);
		
		JPanel panel_document = new JPanel();
		panel.add(panel_document);
		
		JPanel panel_search;
		panel_search = new JPanel();
		panel.add(panel_search);
		
		JPanel panel_userInfo;
		panel_userInfo = new JPanel();
		panel.add(panel_userInfo);
		
		JPanel panel_logOut;
		panel_logOut = new JPanel();
		panel.add(panel_logOut);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menu_homePage = new JMenu("我的首页");
		menu_homePage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel.removeAll();
				panel.add(panel_homePage);
				panel.updateUI();
			}
		});
		menuBar.add(menu_homePage);
		
		JMenu menu_querySocres = new JMenu("查询成绩");
		menu_querySocres.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel.removeAll();
				panel.add(panel_courseSelect_queryCourse);
				panel.updateUI();
			}
		});
		menuBar.add(menu_querySocres);
		
		JMenu menu_courseSelect = new JMenu("选课系统");
		menuBar.add(menu_courseSelect);
		
		JMenuItem menuItem = new JMenuItem("查询选课");
		menuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				panel.removeAll();
				panel.add(panel_courseSelect_queryCourse);
				panel.updateUI();
			}
		});
		menu_courseSelect.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("开课列表");
		menuItem_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				panel.removeAll();
				panel.add(panel_courseSelect_courseList);
				panel.updateUI();
			}
		});
		menu_courseSelect.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("已选课程");
		menuItem_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				panel.removeAll();
				panel.add(panel_courseSelect_courseSelected);
				panel.updateUI();
			}
		});
		menu_courseSelect.add(menuItem_2);
		
		JMenu menu_trainPlan = new JMenu("培养方案");
		menu_trainPlan.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel.removeAll();
				panel.add(panel_trainPlan);
				panel.updateUI();
			}
		});
		menuBar.add(menu_trainPlan);
		
		JMenu menu_document = new JMenu("文档应用");
		menu_document.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel.removeAll();
				panel.add(panel_document);
				panel.updateUI();
			}
		});
		menuBar.add(menu_document);
		
		JMenu menu_search = new JMenu("搜索");
		menu_search.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel.removeAll();
				panel.add(panel_search);
				panel.updateUI();
			}
		});
		menuBar.add(menu_search);
		
		JMenu menu_userInfo = new JMenu("用户信息管理");
		menu_userInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel.removeAll();
				panel.add(panel_userInfo);
				panel.updateUI();
			}
		});
		menuBar.add(menu_userInfo);
		
		JMenu menu_logOut = new JMenu("注销");
		menu_logOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel.removeAll();
				panel.add(panel_logOut);
				panel.updateUI();
			}
		});
		menuBar.add(menu_logOut);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
	}

}
