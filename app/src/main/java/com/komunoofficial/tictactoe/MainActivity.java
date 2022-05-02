package com.komunoofficial.tictactoe;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.komunoofficial.tictactoe.R;

public class MainActivity extends AppCompatActivity {

    private ImageView button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9;
    private Button reset_btn;
    private int player = 1, i=0, x_count = 0, o_count = 0;
    private TextView o_win_view, x_win_view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_1 = findViewById(R.id.button1);
        button_2 = findViewById(R.id.button2);
        button_3 = findViewById(R.id.button3);
        button_4 = findViewById(R.id.button4);
        button_5 = findViewById(R.id.button5);
        button_6 = findViewById(R.id.button6);
        button_7 = findViewById(R.id.button7);
        button_8 = findViewById(R.id.button8);
        button_9 = findViewById(R.id.button9);
        
        x_win_view = findViewById(R.id.xscore);
        o_win_view = findViewById(R.id.oscore);

        reset_btn = findViewById(R.id.reset_btn);
        reset();


        reset_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });

    }

    private void reset() {
        button_1.setBackground(null);
        button_2.setBackground(null);
        button_3.setBackground(null);
        button_4.setBackground(null);
        button_5.setBackground(null);
        button_6.setBackground(null);
        button_7.setBackground(null);
        button_8.setBackground(null);
        button_9.setBackground(null);

        button_1.setTag(4);
        button_2.setTag(4);
        button_3.setTag(4);
        button_4.setTag(4);
        button_5.setTag(4);
        button_6.setTag(4);
        button_7.setTag(4);
        button_8.setTag(4);
        button_9.setTag(4);

        button_1.setClickable(true);
        button_2.setClickable(true);
        button_3.setClickable(true);
        button_4.setClickable(true);
        button_5.setClickable(true);
        button_6.setClickable(true);
        button_7.setClickable(true);
        button_8.setClickable(true);
        button_9.setClickable(true);

        player = 1;
        i = 0;



    }

    public void button_click(View view) {


        if (player == 1){
            view.setBackgroundResource(R.drawable.cross);
            player = 0;
            view.setTag(1);
            view.setClickable(false);
        }
        else {
            view.setBackgroundResource(R.drawable.circle);
            player = 1;
            view.setTag(0);
            view.setClickable(false);
        }
        i++;
        iswinner();



    }

    private void iswinner() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        if (button_1.getTag().equals(0) && button_2.getTag().equals(0) &&  button_3.getTag().equals(0)){

            // 0 wins
            builder.setMessage("Congrats O wins!!")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            o_win_view.setText("O score :- " + o_count);
                        }
                    });
            builder.create().show();
            o_count++;

            button_1.setClickable(false);
            button_2.setClickable(false);
            button_3.setClickable(false);
            button_4.setClickable(false);
            button_5.setClickable(false);
            button_6.setClickable(false);
            button_7.setClickable(false);
            button_8.setClickable(false);
            button_9.setClickable(false);


        }
        else if (button_1.getTag().equals(0) && button_5.getTag().equals(0) &&  button_9.getTag().equals(0)){

            // 0 wins
            builder.setMessage("Congrats O wins!!")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            o_win_view.setText("O score :- " + o_count);
                        }
                    });
            builder.create().show();
            o_count++;

            button_1.setClickable(false);
            button_2.setClickable(false);
            button_3.setClickable(false);
            button_4.setClickable(false);
            button_5.setClickable(false);
            button_6.setClickable(false);
            button_7.setClickable(false);
            button_8.setClickable(false);
            button_9.setClickable(false);


        }
        else if (button_3.getTag().equals(0) && button_5.getTag().equals(0) &&  button_7.getTag().equals(0)){

            // 0 wins
            builder.setMessage("Congrats O wins!!")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            o_win_view.setText("O score :- " + o_count);
                        }
                    });
            builder.create().show();
            o_count++;

            button_1.setClickable(false);
            button_2.setClickable(false);
            button_3.setClickable(false);
            button_4.setClickable(false);
            button_5.setClickable(false);
            button_6.setClickable(false);
            button_7.setClickable(false);
            button_8.setClickable(false);
            button_9.setClickable(false);


        }
        else if (button_4.getTag().equals(0) && button_5.getTag().equals(0) &&  button_6.getTag().equals(0)){

            // 0 wins
            builder.setMessage("Congrats O wins!!")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            o_win_view.setText("O score :- " + o_count);
                        }
                    });
            builder.create().show();
            o_count++;

            button_1.setClickable(false);
            button_2.setClickable(false);
            button_3.setClickable(false);
            button_4.setClickable(false);
            button_5.setClickable(false);
            button_6.setClickable(false);
            button_7.setClickable(false);
            button_8.setClickable(false);
            button_9.setClickable(false);


        }
        else if (button_7.getTag().equals(0) && button_8.getTag().equals(0) &&  button_9.getTag().equals(0)){

            // 0 wins
            builder.setMessage("Congrats O wins!!")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            o_win_view.setText("O score :- " + o_count);
                        }
                    });
            builder.create().show();
            o_count++;

            button_1.setClickable(false);
            button_2.setClickable(false);
            button_3.setClickable(false);
            button_4.setClickable(false);
            button_5.setClickable(false);
            button_6.setClickable(false);
            button_7.setClickable(false);
            button_8.setClickable(false);
            button_9.setClickable(false);


        }
        else if (button_1.getTag().equals(0) && button_4.getTag().equals(0) &&  button_7.getTag().equals(0)){

            // 0 wins
            builder.setMessage("Congrats O wins!!")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            o_win_view.setText("O score :- " + o_count);
                        }
                    });
            builder.create().show();
            o_count++;

            button_1.setClickable(false);
            button_2.setClickable(false);
            button_3.setClickable(false);
            button_4.setClickable(false);
            button_5.setClickable(false);
            button_6.setClickable(false);
            button_7.setClickable(false);
            button_8.setClickable(false);
            button_9.setClickable(false);


        }
        else if (button_2.getTag().equals(0) && button_5.getTag().equals(0) &&  button_8.getTag().equals(0)){

            // 0 wins
            builder.setMessage("Congrats O wins!!")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            o_win_view.setText("O score :- " + o_count);
                        }
                    });
            builder.create().show();
            o_count++;

            button_1.setClickable(false);
            button_2.setClickable(false);
            button_3.setClickable(false);
            button_4.setClickable(false);
            button_5.setClickable(false);
            button_6.setClickable(false);
            button_7.setClickable(false);
            button_8.setClickable(false);
            button_9.setClickable(false);


        }
        else if (button_3.getTag().equals(0) && button_6.getTag().equals(0) &&  button_9.getTag().equals(0)){

            // 0 wins
            builder.setMessage("Congrats O wins!!")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            o_win_view.setText("O score :- " + o_count);
                        }
                    });
            builder.create().show();
            o_count++;

            button_1.setClickable(false);
            button_2.setClickable(false);
            button_3.setClickable(false);
            button_4.setClickable(false);
            button_5.setClickable(false);
            button_6.setClickable(false);
            button_7.setClickable(false);
            button_8.setClickable(false);
            button_9.setClickable(false);


        }




        else if (button_1.getTag().equals(1) && button_2.getTag().equals(1) &&  button_3.getTag().equals(1)){

            // X wins
            builder.setMessage("Congrats X wins!!")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            x_win_view.setText("X score :- " + x_count);
                        }
                    });
            builder.create().show();
            x_count++;

            button_1.setClickable(false);
            button_2.setClickable(false);
            button_3.setClickable(false);
            button_4.setClickable(false);
            button_5.setClickable(false);
            button_6.setClickable(false);
            button_7.setClickable(false);
            button_8.setClickable(false);
            button_9.setClickable(false);


        }
        else if (button_1.getTag().equals(1) && button_5.getTag().equals(1) &&  button_9.getTag().equals(1)){

            // X wins
            builder.setMessage("Congrats X wins!!")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            x_win_view.setText("X score :- " + x_count);
                        }
                    });
            builder.create().show();
            x_count++;

            button_1.setClickable(false);
            button_2.setClickable(false);
            button_3.setClickable(false);
            button_4.setClickable(false);
            button_5.setClickable(false);
            button_6.setClickable(false);
            button_7.setClickable(false);
            button_8.setClickable(false);
            button_9.setClickable(false);



        }
        else if (button_3.getTag().equals(1) && button_5.getTag().equals(1) &&  button_7.getTag().equals(1)){

            // X wins
            builder.setMessage("Congrats X wins!!")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            x_win_view.setText("X score :- " + x_count);
                        }
                    });
            builder.create().show();
            x_count++;

            button_1.setClickable(false);
            button_2.setClickable(false);
            button_3.setClickable(false);
            button_4.setClickable(false);
            button_5.setClickable(false);
            button_6.setClickable(false);
            button_7.setClickable(false);
            button_8.setClickable(false);
            button_9.setClickable(false);



        }
        else if (button_4.getTag().equals(1) && button_5.getTag().equals(1) &&  button_6.getTag().equals(1)){

            // X wins
            builder.setMessage("Congrats X wins!!")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            x_win_view.setText("X score :- " + x_count);
                        }
                    });
            builder.create().show();
            x_count++;

            button_1.setClickable(false);
            button_2.setClickable(false);
            button_3.setClickable(false);
            button_4.setClickable(false);
            button_5.setClickable(false);
            button_6.setClickable(false);
            button_7.setClickable(false);
            button_8.setClickable(false);
            button_9.setClickable(false);



        }
        else if (button_7.getTag().equals(1) && button_8.getTag().equals(1) &&  button_9.getTag().equals(1)){

            // X wins
            builder.setMessage("Congrats X wins!!")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            x_win_view.setText("X score :- " + x_count);
                        }
                    });
            builder.create().show();
            x_count++;

            button_1.setClickable(false);
            button_2.setClickable(false);
            button_3.setClickable(false);
            button_4.setClickable(false);
            button_5.setClickable(false);
            button_6.setClickable(false);
            button_7.setClickable(false);
            button_8.setClickable(false);
            button_9.setClickable(false);



        }
        else if (button_1.getTag().equals(1) && button_4.getTag().equals(1) &&  button_7.getTag().equals(1)){

            // X wins
            builder.setMessage("Congrats X wins!!")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            x_win_view.setText("X score :- " + x_count);
                        }
                    });
            builder.create().show();
            x_count++;

            button_1.setClickable(false);
            button_2.setClickable(false);
            button_3.setClickable(false);
            button_4.setClickable(false);
            button_5.setClickable(false);
            button_6.setClickable(false);
            button_7.setClickable(false);
            button_8.setClickable(false);
            button_9.setClickable(false);



        }
        else if (button_2.getTag().equals(1) && button_5.getTag().equals(1) &&  button_8.getTag().equals(1)){

            // X wins
            builder.setMessage("Congrats X wins!!")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            x_win_view.setText("X score :- " + x_count);
                        }
                    });
            builder.create().show();
            x_count++;

            button_1.setClickable(false);
            button_2.setClickable(false);
            button_3.setClickable(false);
            button_4.setClickable(false);
            button_5.setClickable(false);
            button_6.setClickable(false);
            button_7.setClickable(false);
            button_8.setClickable(false);
            button_9.setClickable(false);



        }
        else if (button_3.getTag().equals(1) && button_6.getTag().equals(1) &&  button_9.getTag().equals(1)){

            // X wins
            builder.setMessage("Congrats X wins!!")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            x_win_view.setText("X score :- " + x_count);
                        }
                    });
            builder.create().show();
            x_count++;

            button_1.setClickable(false);
            button_2.setClickable(false);
            button_3.setClickable(false);
            button_4.setClickable(false);
            button_5.setClickable(false);
            button_6.setClickable(false);
            button_7.setClickable(false);
            button_8.setClickable(false);
            button_9.setClickable(false);



        }
        else if (i == 9){
            builder.setMessage("Match Draw")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            builder.create().show();

            button_1.setClickable(false);
            button_2.setClickable(false);
            button_3.setClickable(false);
            button_4.setClickable(false);
            button_5.setClickable(false);
            button_6.setClickable(false);
            button_7.setClickable(false);
            button_8.setClickable(false);
            button_9.setClickable(false);
        }


    }

}