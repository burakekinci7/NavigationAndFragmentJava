package com.flashex.navigation;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.flashex.navigation.FirstFragmentDirections;

public class FirstFragment extends Fragment {

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button button = view.findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToSecond(view );
            }
        });
    }

    public void goToSecond(View view) {
        //navigation new action
        //no argument
        //NavDirections action=FirstFragmentDirections.actionFirstFragmentToSecondFragment();

        //arguments
        FirstFragmentDirections.ActionFirstFragmentToSecondFragment action=FirstFragmentDirections.actionFirstFragmentToSecondFragment();
        action.setAge(32);
        Navigation.findNavController(view).navigate(action);
    }
}