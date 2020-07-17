package com.example.fibonacciyinzcam;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fibonacciyinzcam.databinding.ListItemBinding;

import java.math.BigInteger;

/**
 * Basic Adapter class extending RecyclerView.Adapter
 */
public class NumberAdapter extends RecyclerView.Adapter<NumberAdapter.ViewHolder>{

    //Fibonacci Sequence object to generate Fibonacci number
    private FibonacciSequence fibonacciSequence;

    //Create fibonacciSequence object
    public NumberAdapter() {
        fibonacciSequence = new FibonacciSequence();
    }

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        //Inflate custom layout
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ListItemBinding binding = ListItemBinding.inflate(layoutInflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //Generate new fibonacci number
        BigInteger num = fibonacciSequence.getFib(position+1);
        if (num != null) {
            holder.bind(num, position + 1);
        }
    }

    /**
     * Returns the total count of numbers to display
     */
    @Override
    public int getItemCount() {
        return fibonacciSequence.getCount()-1;
    }

    /**
     * Provide a direct reference to the each views
     * Used for caching views
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {

        //View Binding
        private final ListItemBinding binding;

        public ViewHolder(ListItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(BigInteger num, int pos){
            binding.positionTextView.setText("Position: " + (pos));
            binding.numberText.setText(num.toString());
        }
    }

}
