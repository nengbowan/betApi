package com.pg.betApi.gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    //上子组件 投注配置组件
    private JPanel topPanel = new JPanel(new FlowLayout());
    //下子组件 日志组件
    private JPanel bottomPanel = new JPanel();;

    private JPanel loginPanel = new JPanel(new FlowLayout());;
    //创建选择投注号码位置 1 2 3 4 5 6 7 8 9 10 选择那一条马
    private JPanel horseNumberPanel = new JPanel(new FlowLayout());;
    public MainFrame(){
        //左上角
        this.setLocation(0,0);
        //设置不可扩大 缩小界面
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

    }

    private void initTopPanel() {
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
        horseNumberPanel.setBorder(BorderFactory.createTitledBorder("跑马选择:"));

        JCheckBox item1 = new JCheckBox("1");
        JCheckBox item2 = new JCheckBox("2");
        JCheckBox item3 = new JCheckBox("3");
        JCheckBox item4 = new JCheckBox("4");
        JCheckBox item5 = new JCheckBox("5");
        JCheckBox item6 = new JCheckBox("6");
        JCheckBox item7 = new JCheckBox("7");
        JCheckBox item8 = new JCheckBox("8");
        JCheckBox item9 = new JCheckBox("9");
        JCheckBox item10 = new JCheckBox("10");


        horseNumberPanel.add(item1);
        horseNumberPanel.add(item2);
        horseNumberPanel.add(item3);
        horseNumberPanel.add(item4);
        horseNumberPanel.add(item5);
        horseNumberPanel.add(item6);
        horseNumberPanel.add(item7);
        horseNumberPanel.add(item8);
        horseNumberPanel.add(item9);
        horseNumberPanel.add(item10);


        topPanel.add(horseNumberPanel);
    }

    /**
     * 创建登录账号密码配置区域 username password
     */
    private void createLoginPanel() {


        loginPanel.setBorder(BorderFactory.createTitledBorder("账号配置:"));
        JLabel username = new JLabel("账号:");
        JLabel password = new JLabel("密码:");

        JTextField userText = new JTextField(20);
        JTextField passText = new JTextField(20);


        Box usernameBox = Box.createHorizontalBox();
        Box passwdBox = Box.createHorizontalBox();
        usernameBox.add(username);
        usernameBox.add(userText);

        passwdBox.add(password);
        passwdBox.add(passText);


        Box loginBox = Box.createVerticalBox();
        loginBox.add(usernameBox);
        loginBox.add(passwdBox);

        loginPanel.add(loginBox);
        topPanel.add(loginPanel);
    }


}
