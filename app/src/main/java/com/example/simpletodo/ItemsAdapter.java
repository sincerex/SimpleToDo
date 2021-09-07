package com.example.simpletodo;

import androidx.recyclerview.widget.RecyclerView;

//Responsible for displaying data from model into a row in recycler view
public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ViewHolder> {


    List<String> items;

    public ItemsAdapter(List<String> items) {
    }

    /// Container to provide easy access to views that represent each row of the
    class ViewHolder extends RecyclerView.ViewHolder {

    }
}
