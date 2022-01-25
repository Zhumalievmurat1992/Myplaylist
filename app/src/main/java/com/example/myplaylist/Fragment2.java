package com.example.myplaylist;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myplaylist.databinding.Fragment2Binding;

import java.util.ArrayList;


public class Fragment2 extends Fragment implements OnClick {

    private AdapterSongs adapterSongs;
    private ArrayList<Songs> songs;
    public final static String name = "hff";
    private Fragment2Binding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = Fragment2Binding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loadData();
        adapterSongs = new AdapterSongs(songs,this);
        binding.recycle.setAdapter(adapterSongs);
    }

    private void loadData() {
        songs = new ArrayList<>();
        songs.add(new Songs("1","2:33","aaa","bbbb"));
        songs.add(new Songs("2","3:43","ddd","vvvv"));
        songs.add(new Songs("3","4:05","fff","gggg"));
        songs.add(new Songs("4","3:13","ggg","ssss"));
        songs.add(new Songs("5","4:17","hhh","ssss"));
        songs.add(new Songs("6","3:39","jjj","ssss"));
        songs.add(new Songs("7","2:45","kkk","ssss"));
        songs.add(new Songs("8","3:43","lll","ssss"));
        songs.add(new Songs("9","4:37","ooo","ssss"));
        songs.add(new Songs("10","4:00","www","ssss"));


    }

    public void onClick(Songs songs) {

        Bundle bundle = new Bundle();
        Fragment fragment = new Fragment3();
        bundle.putString(name, songs.getNameMusic());
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_main,
                fragment).addToBackStack("a").commit();
    }
}