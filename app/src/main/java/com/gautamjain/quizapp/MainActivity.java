package com.gautamjain.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private String [] questions = {"C++ is a prerson","C++ was introduced in 1233", "C++ was created using python"
            , "C++ has abstract classes","C++ supports interface?"};

    private boolean [] answers = {false, false, false, true, true};
    private int score = 0;
    Button yes;
    Button no;
    private int i = 0;
    TextView question;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        question = findViewById(R.id.question);
        question.setText(questions[i]);

        yes.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(i <= questions.length -1)
                {
                    if (answers[i] == true)
                    {
                        score++;
                    }
                    i++;

                    if (i <= questions.length - 1)
                    {
                        question.setText(questions[i]);
                    }
                    else
                        {
                        Toast.makeText(MainActivity.this, "Your score is " + score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });

        no.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(i <= questions.length -1)
                {
                    if(answers[i] == false)
                    {
                        score++;
                    }
                    i++;

                    if(i<=questions.length - 1)
                    {
                        question.setText(questions[i]);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Your score is "+ score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}