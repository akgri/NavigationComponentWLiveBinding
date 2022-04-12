package com.example.fatih.navigationodev;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fatih.navigationodev.databinding.FragmentSayfaYBinding;


public class SayfaY extends Fragment {
    private FragmentSayfaYBinding binding;

    public SayfaY() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSayfaYBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        binding.btnGeriGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_sayfaY_to_anasayfa);
            }
        });



        return view;
    }
}