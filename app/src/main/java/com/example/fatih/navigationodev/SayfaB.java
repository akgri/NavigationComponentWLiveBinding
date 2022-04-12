package com.example.fatih.navigationodev;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fatih.navigationodev.databinding.FragmentSayfaBBinding;


public class SayfaB extends Fragment {
    private FragmentSayfaBBinding binding;
    public SayfaB() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSayfaBBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        binding.btnGitY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_sayfaB_to_sayfaY);

            }
        });




        return view;
    }
}