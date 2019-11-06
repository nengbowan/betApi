package com.pg.betApi.gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    //上子组件 投注配置组件
    private JPanel topPanel;
    //下子组件 日志组件
    private JPanel bottomPanel;

    private JPanel loginPanel;
    //创建选择投注号码位置 1 2 3 4 5 6 7 8 9 10 选择那一条马
    private JPanel horseNumberPanel;
    public MainFrame(){
        //左上角
        this.setLocation(0,0);
        //设置不可扩大 缩小界面 TODO
        this.setResizable(true);
        //设置窗口 宽 高
        this.setSize(950,500);
        //设置关闭退出程序
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置整体ui
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        //设置标题
        this.setTitle("飞艇自动投注工具V0.1");
        //TODO icon图标
        //初始化子组件
        init();
    }

    private void init() {
        //上下布局
        this.setLayout(new BorderLayout());

        initTopPanel();

        initBottomPanel();

        add(topPanel,BorderLayout.NORTH);
        add(bottomPanel,BorderLayout.SOUTH);
        //设置可见
        this.setVisible(true);
    }

    private void initBottomPanel() {
        bottomPanel = new JPanel();
    }

    private void initTopPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        this.topPanel = panel;
        //创建登录账号密码配置区域 username password
        createLoginPanel();
        //创建选择投注号码位置 1 2 3 4 5 6 7 8 9 10 选择那一条马
        createHorseNumberPanel();
        //创建下拉某一赛道 冠军 亚军 第三名  第四名 .... 第十名  选择在哪条赛道上跑
//        createHorseRoadPanel();
        JButton startButton = new JButton("开始");
        //开始按钮
    }

    private void createHorseNumberPanel() {
        JLabel number1 = new JLabel("1");
        JLabel number2 = new JLabel("2");
        JLabel number3 = new JLabel("3");
        JLabel number4 = new JLabel("4");
        JLabel number5 = new JLabel("5");
        JLabel number6 = new JLabel("6");
        JLabel number7 = new JLabel("7");
        JLabel number8 = new JLabel("8");
        JLabel number9 = new JLabel("9");
        JLabel number10 = new JLabel("10");

        JPanel horseNumberPanel = new JPanel(new FlowLayout());

        JCheckBox numberCheckBox = new JCheckBox();
        JCheckBoxMenuItem item1 = new JCheckBoxMenuItem("1");
        JCheckBoxMenuItem item2 = new JCheckBoxMenuItem("2");
        JCheckBoxMenuItem item3 = new JCheckBoxMenuItem("3");
        JCheckBoxMenuItem item4 = new JCheckBoxMenuItem("4");
        JCheckBoxMenuItem item5 = new JCheckBoxMenuItem("5");
        JCheckBoxMenuItem item6 = new JCheckBoxMenuItem("6");
        JCheckBoxMenuItem item7 = new JCheckBoxMenuItem("7");
        JCheckBoxMenuItem item8 = new JCheckBoxMenuItem("8");
        JCheckBoxMenuItem item9 = new JCheckBoxMenuItem("9");
        JCheckBoxMenuItem item10 = new JCheckBoxMenuItem("10");

        numberCheckBox.add(item1);
        numberCheckBox.add(item2);
        numberCheckBox.add(item3);
        numberCheckBox.add(item4);
        numberCheckBox.add(item5);
        numberCheckBox.add(item6);
        numberCheckBox.add(item7);
        numberCheckBox.add(item8);
        numberCheckBox.add(item9);
        numberCheckBox.add(item10);

        horseNumberPanel.add(numberCheckBox);

        topPanel.add(horseNumberPanel);
    }

    /**
     * 创建登录账号密码配置区域 username password
     */
    private void createLoginPanel() {
        JPanel loginPanel = new JPanel(new FlowLayout());

        JLabel username = new JLabel("账号:");
        JLabel password = new JLabel("密码:");

        JTextField userText = new JTextField(20);
        JTextField passText = new JTextField(20);

        loginPanel.add(username);
        loginPanel.add(userText);
        loginPanel.add(password);
        loginPanel.add(passText);
        this.loginPanel = loginPanel;

    }


}
