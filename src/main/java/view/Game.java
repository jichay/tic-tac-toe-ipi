package view;

import service.GameUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame{

    private JPanel mainPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private int[][] boardData;
    private boolean player;

    public Game(){
        boardData = new int[3][3];
        player = true;
        mainPanel.setName("mainPanel");
        button1.setName("button1");
        button1.setVisible(true);
        button1.setPreferredSize(new Dimension(200, 200));
        button1.setFont(new Font("Arial", Font.PLAIN, 40));
        button2.setPreferredSize(new Dimension(200, 200));
        button2.setFont(new Font("Arial", Font.PLAIN, 40));
        button3.setPreferredSize(new Dimension(200, 200));
        button3.setFont(new Font("Arial", Font.PLAIN, 40));
        button4.setPreferredSize(new Dimension(200, 200));
        button4.setFont(new Font("Arial", Font.PLAIN, 40));
        button5.setPreferredSize(new Dimension(200, 200));
        button5.setFont(new Font("Arial", Font.PLAIN, 40));
        button6.setPreferredSize(new Dimension(200, 200));
        button6.setFont(new Font("Arial", Font.PLAIN, 40));
        button7.setPreferredSize(new Dimension(200, 200));
        button7.setFont(new Font("Arial", Font.PLAIN, 40));
        button8.setPreferredSize(new Dimension(200, 200));
        button8.setFont(new Font("Arial", Font.PLAIN, 40));
        button9.setPreferredSize(new Dimension(200, 200));
        button9.setFont(new Font("Arial", Font.PLAIN, 40));

        ActionListener listener = e -> {
            if(GameUtils.checkWinner(boardData)){
                JOptionPane.showMessageDialog(mainPanel, "Winner");
            }
        };
        button1.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
        button4.addActionListener(listener);
        button5.addActionListener(listener);
        button6.addActionListener(listener);
        button7.addActionListener(listener);
        button8.addActionListener(listener);
        button9.addActionListener(listener);

        button1.addActionListener(e -> {
            if(player){
                button1.setText("X");
                boardData[0][0] = 1;
            } else {
                button1.setText("O");
                boardData[0][0] = 2;
            }
            player = !player;
            button1.setEnabled(false);
        });

        button2.addActionListener(e -> {
            if(player){
                button2.setText("X");
                boardData[0][1] = 1;
            } else {
                button2.setText("O");
                boardData[0][1] = 2;
            }
            player = !player;
            button2.setEnabled(false);
        });

        button3.addActionListener(e -> {
            if(player){
                button3.setText("X");
                boardData[0][2] = 1;
            } else {
                button3.setText("O");
                boardData[0][2] = 2;
            }
            player = !player;
            button3.setEnabled(false);
        });

        button4.addActionListener(e -> {
            if(player){
                button4.setText("X");
                boardData[1][0] = 1;
            } else {
                button4.setText("O");
                boardData[1][0] = 2;
            }
            player = !player;
            button4.setEnabled(false);
        });

        button5.addActionListener(e -> {
            if(player){
                button5.setText("X");
                boardData[1][1] = 1;
            } else {
                button5.setText("O");
                boardData[1][1] = 2;
            }
            player = !player;
            button5.setEnabled(false);
        });

        button6.addActionListener(e -> {
            if(player){
                button6.setText("X");
                boardData[1][2] = 1;
            } else {
                button6.setText("O");
                boardData[1][2] = 2;
            }
            player = !player;
            button6.setEnabled(false);
        });

        button7.addActionListener(e -> {
            if(player){
                button7.setText("X");
                boardData[2][0] = 1;
            } else {
                button7.setText("O");
                boardData[2][0] = 2;
            }
            player = !player;
            button7.setEnabled(false);
        });

        button8.addActionListener(e -> {
            if(player){
                button8.setText("X");
                boardData[2][1] = 1;
            } else {
                button8.setText("O");
                boardData[2][1] = 2;
            }
            player = !player;
            button8.setEnabled(false);
        });

        button9.addActionListener(e -> {
            if(player){
                button9.setText("X");
                boardData[2][2] = 1;
            } else {
                button9.setText("O");
                boardData[2][2] = 2;
            }
            player = !player;
            button9.setEnabled(false);
        });

    }


    public JPanel getMainPanel() {
        return mainPanel;
    }

}
