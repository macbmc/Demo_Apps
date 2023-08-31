package com.example.democalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     String a,b;
     double a1,a2,a3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num_a=(EditText) findViewById(R.id.firstnum);
        EditText num_b=(EditText) findViewById(R.id.secnum);
        EditText res = (EditText) findViewById(R.id.result);


        Button addbtn=(Button)findViewById(R.id.add);
        Button subbtn=(Button)findViewById(R.id.sub);
        Button multbtn=(Button)findViewById(R.id.multiply);
        Button divbtn=(Button)findViewById(R.id.div);
        Button clrbtn=(Button)findViewById(R.id.clr);






        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=num_a.getText().toString().trim();
                b=num_b.getText().toString().trim();
                if(a.length()==0||b.length()==0)
                {
                    res.setText("");
                    Toast.makeText(MainActivity.this,"Error check inputs",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    a1=Double.parseDouble(a);
                    a2=Double.parseDouble(b);
                    a3=a1+a2;
                    res.setText("Result is "+ a3);
                }




            }
        });
        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=num_a.getText().toString().trim();
                b=num_b.getText().toString().trim();
                if(a.length()==0||b.length()==0)
                {
                    res.setText("");
                    Toast.makeText(MainActivity.this,"Error check inputs",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    a1=Double.parseDouble(a);
                    a2=Double.parseDouble(b);
                    a3=a1-a2;
                    res.setText("Result is "+ a3);
                }




            }
        });
        multbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=num_a.getText().toString().trim();
                b=num_b.getText().toString().trim();
                if(a.length()==0||b.length()==0)
                {
                    res.setText("");
                    Toast.makeText(MainActivity.this,"Error check inputs",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    a1=Double.parseDouble(a);
                    a2=Double.parseDouble(b);
                    a3=a1*a2;
                    res.setText("Result is "+ a3);
                }




            }
        });
        divbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=num_a.getText().toString().trim();
                b=num_b.getText().toString().trim();
                if(a.length()==0||b.length()==0)
                {
                    res.setText("");
                    Toast.makeText(MainActivity.this,"Error check inputs",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    a1=Double.parseDouble(a);
                    a2=Double.parseDouble(b);
                    a3=a1/a2;
                    res.setText("Result is "+ a3);
                }




            }
        });

        clrbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_a.setText("");
                num_b.setText("");
                res.setText("");
            }
        });


    }
}