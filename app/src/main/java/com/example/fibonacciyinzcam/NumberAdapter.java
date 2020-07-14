package com.example.fibonacciyinzcam;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fibonacciyinzcam.databinding.ListItemBinding;

import java.math.BigInteger;
import java.util.List;

public class NumberAdapter extends RecyclerView.Adapter<NumberAdapter.ViewHolder>{

    private List<BigInteger> mData;

    public NumberAdapter(List<BigInteger> data) {
        this.mData = data;
    }

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ListItemBinding binding = ListItemBinding.inflate(layoutInflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        BigInteger num = mData.get(position);
        holder.bind(num);
    }

    @Override
    public int getItemCount() {
        if (mData.isEmpty()) return 0;
        return mData.size();
    }

    /**
     * Provide a direct reference to the each views
     * Used for caching views
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final ListItemBinding binding;

        public ViewHolder(ListItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(BigInteger num){
            binding.numberText.setText(num.toString());
        }
    }


//    public void setData(List<BigInteger> data){
//        mData = data;
//        notifyDataSetChanged();
//    }
}
