package com.classpractice.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainer;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.classpractice.fragments.fragment.AreaOfCircle;
import com.classpractice.fragments.fragment.FirstFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    Button btnLoadFragment;
    private  boolean status = true;
    RelativeLayout fragmentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoadFragment=findViewById(R.id.btnLoadFragment);
        fragmentContainer = findViewById(R.id.fragmentContainer);
        btnLoadFragment.setOnClickListener(this);







    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        if (status){
            FirstFragment firstFragment= new FirstFragment();
            fragmentTransaction.replace(R.id.fragmentContainer,firstFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            btnLoadFragment.setText("Load Second Fragment");
            status=false;

        }
        else{

            AreaOfCircle abc=new AreaOfCircle();
            fragmentTransaction.replace(R.id.fragmentContainer,abc);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            btnLoadFragment.setText("Load First Fragment");
            status=false;


        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
