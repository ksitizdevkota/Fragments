package com.classpractice.fragments.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.classpractice.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment implements View.OnClickListener{
    EditText txtFNum;
    EditText txtSNum;
    Button   btnCalculate;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view = inflater.inflate(R.layout.fragment_first, container, false);
        txtFNum=view.findViewById(R.id.txtFNum);
        txtSNum=view.findViewById(R.id.txtSNum);
        btnCalculate=view.findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        int FirstNum=Integer.parseInt(txtFNum.getText().toString());
        int SecondNum=Integer.parseInt(txtSNum.getText().toString());
        int result= FirstNum+SecondNum;

        Toast.makeText(getActivity(),"Sum is:"+ result,Toast.LENGTH_SHORT).show();
    }
}
