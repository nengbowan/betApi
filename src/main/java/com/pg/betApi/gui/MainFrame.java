package com.pg.betApi.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class MainFrame extends JFrame {
    //上子组件 投注配置组件
    private JPanel topPanel = new JPanel(new FlowLayout());
    //下子组件 日志组件
    private JPanel bottomPanel = new JPanel();;

    private JPanel loginPanel = new JPanel(new FlowLayout());;
    //创建选择投注号码位置 1 2 3 4 5 6 7 8 9 10 选择那一条马
    private JPanel horseNumberPanel = new JPanel(new FlowLayout());;

    //选择哪个赛道去跑
    private JPanel horseRoadPanel = new JPanel(new FlowLayout());
    //圆角分组件
    private JPanel moneyUnitPanel = new JPanel();
    //日志框
    private JTextArea logArea = new JTextArea(20,80);

    //赛道
    private JComboBox roadBox;

    //下注金额
    private JTextField betField = new JTextField(10);
    public MainFrame(){
        //上下布局
        this.setLayout(new FlowLayout());
        //左上角
        this.setLocation(0,0);
        //设置不可扩大 缩小界面
        this.setResizable(true);
        //设置窗口 宽 高
        this.setSize(1265,500);
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

        initTopPanel();

        initBottomPanel();

        add(topPanel,BorderLayout.NORTH);
        add(bottomPanel,BorderLayout.CENTER);
        //设置可见
        this.setVisible(true);
    }

    private void initBottomPanel() {


        JScrollPane scrollPane = new JScrollPane(logArea);
        this.bottomPanel.add(scrollPane);
    }

    private void initTopPanel() {
        topPanel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        //创建登录账号密码配置区域 username password
        createLoginPanel();
        //创建选择投注号码位置 1 2 3 4 5 6 7 8 9 10 选择那一条马
        createHorseNumberPanel();
        //创建下拉某一赛道 冠军 亚军 第三名  第四名 .... 第十名  选择在哪条赛道上跑
        createHorseRoadPanel();
        //创建圆角分选择
        createMoneyUnitPanel();

        JLabel betLabel = new JLabel("下注金额:");

        JButton startButton = new JButton("开始");
        //监听事件
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

        topPanel.add(betLabel);
        topPanel.add(betField);
        this.topPanel.add(startButton);
        //开始按钮
    }

    private void createMoneyUnitPanel() {
        moneyUnitPanel.setBorder(BorderFactory.createTitledBorder("金钱:"));

        JRadioButton yuanRadio = new JRadioButton("圆");
        JRadioButton jiaoRadio = new JRadioButton("角");
        JRadioButton fenRadio = new JRadioButton("分");

        ButtonGroup group = new ButtonGroup();
        group.add(yuanRadio);
        group.add(jiaoRadio);
        group.add(fenRadio);

        //垂直
        Box box = Box.createHorizontalBox();
        box.add(yuanRadio);
        box.add(jiaoRadio);
        box.add(fenRadio);

        this.moneyUnitPanel.add(box);
        this.topPanel.add(moneyUnitPanel);
    }

    private void createHorseRoadPanel() {
        horseRoadPanel.setBorder(BorderFactory.createTitledBorder("赛道:"));

        roadBox = new JComboBox();


        roadBox.addItem("冠军");
        roadBox.addItem("亚军");
        roadBox.addItem("季军");
        roadBox.addItem("第四名");
        roadBox.addItem("第五名");
        roadBox.addItem("第六名");
        roadBox.addItem("第七名");
        roadBox.addItem("第八名");
        roadBox.addItem("第九名");
        roadBox.addItem("第十名");




        horseRoadPanel.add(roadBox);
        this.topPanel.add(horseRoadPanel);

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

        JTextField userText = new JTextField("lin2732903",10);
        JTextField passText = new JTextField("a123456",10);


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
