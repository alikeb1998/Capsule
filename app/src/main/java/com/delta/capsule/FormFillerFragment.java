package com.delta.capsule;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FormFillerFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FormFillerFragment extends Fragment {
private Button submitButton;
private EditText dateView;
private EditText nameView;
private EditText kindView;
private EditText entryView;
private EditText exitView;
private EditText detailView;
private EditText priceView;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FormFillerFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FormFillerFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FormFillerFragment newInstance(String param1, String param2) {
        FormFillerFragment fragment = new FormFillerFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
                View view= inflater.inflate(R.layout.fragment_form_filler, container, false);
       submitButton = view.findViewById(R.id.submitButton);
       dateView = view.findViewById(R.id.fillerDate);
       nameView = view.findViewById(R.id.fillerName);
       kindView = view.findViewById(R.id.fillerKind);
       entryView = view.findViewById(R.id.fillerEntry);
       exitView = view.findViewById(R.id.fillerExit);
       detailView = view.findViewById(R.id.fillerDetail);
       priceView= view.findViewById(R.id.fillerPrice);
       submitButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Form form = new Form();
               form.setDate(dateView.getText().toString());
               form.setName(nameView.getText().toString());
               form.setKind(kindView.getText().toString());
               String val = entryView.getText().toString();
               int entryVal = Integer.parseInt(val);
               form.setEntry(entryVal);
               String temp = exitView.getText().toString();
               int exitVal = Integer.parseInt(temp);
               form.setExit(exitVal);
               form.setDetail(detailView.getText().toString());
               String var = priceView.getText().toString();
               double priceVal = Double.parseDouble(var);
               form.setPrice(priceVal);

           }
       });
        return view;
    }
}