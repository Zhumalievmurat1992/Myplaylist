package com.example.myplaylist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myplaylist.databinding.ItemSongsBinding;

import java.util.ArrayList;

public class AdapterSongs extends RecyclerView.Adapter<AdapterSongs.CountViewHolder> {

    private Context context;
    private OnClick onClick;

    ArrayList<Songs> list = new ArrayList<>();

    public AdapterSongs(ArrayList<Songs> list, OnClick onClick) {
        this.list = list;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public CountViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        ItemSongsBinding binding = ItemSongsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new CountViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CountViewHolder holder, int position) {
        holder.bind(list.get(position), context);
        holder.itemView.setOnClickListener(view -> {
            onClick.onClick(list.get(position));
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class CountViewHolder extends RecyclerView.ViewHolder {

        private ItemSongsBinding binding;
        private Context context;

        public CountViewHolder(@NonNull ItemSongsBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(Songs music, Context context) {
            binding.numbers.setText(music.getNumbers());
            binding.songs.setText(music.getNameMusic());
            binding.time.setText(music.getTime());
            binding.singer.setText(music.getSinger());
        }
    }

}
