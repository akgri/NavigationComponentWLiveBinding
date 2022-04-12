package com.example.fatih.navigationodev;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fatih.navigationodev.databinding.FragmentSayfaXBinding;


public class SayfaX extends Fragment {
    private FragmentSayfaXBinding binding;


    public SayfaX() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSayfaXBinding.inflate(inflater, container, false);
        View view = binding.getRoot();


        binding.btnGitY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_sayfaX_to_sayfaY);

            }
        });
        return view;
    }
}