package com.xizi.snake;

import javax.swing.*;

//游戏的启动类
public class StartGame {
    public static void main(String[] args){
        JFrame frame = new JFrame("戏子制作的贪吃蛇， 博客:www.yinpeng.fun");

        frame.setBounds(10,10,900,720);
        //窗口大小不可变
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //正常游戏界面都i应该在面板上
        frame.add(new GamePanel());

        frame.setVisible(true);
    }
}
