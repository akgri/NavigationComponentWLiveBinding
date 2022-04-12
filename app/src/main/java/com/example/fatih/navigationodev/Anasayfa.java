package com.example.fatih.navigationodev;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fatih.navigationodev.databinding.FragmentAnasayfaBinding;


public class Anasayfa extends Fragment {
    private FragmentAnasayfaBinding binding;


    public Anasayfa() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding=FragmentAnasayfaBinding.inflate(getLayoutInflater());

        binding.btnGitA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Navigation.findNavController(view).navigate(R.id.action_anasayfa_to_sayfaA);

            }
        });

        binding.btnGitX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_anasayfa_to_sayfaX);

            }
        });


        return binding.getRoot();

    }
}