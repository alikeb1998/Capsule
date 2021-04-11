package com.delta.capsule;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private Context mContext;
    private List<Form> forms;

    public Adapter(Context mContext, List<Form> forms) {
        this.mContext = mContext;
        this.forms = forms;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_card_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        for (int i = 0; i <= forms.size(); i++) {
            holder.mDateText.setText(forms.get(position).getDate());
            holder.mNameText.setText(forms.get(position).getName());
            holder.mKindText.setText(forms.get(position).getKind());
            holder.mEntryText.setText(String.valueOf(forms.get(position).getEntry()));
            holder.mExitText.setText(String.valueOf(forms.get(position).getExit()));
            holder.mDetailText.setText(forms.get(position).getDetail());
            holder.mPriceText.setText(String.valueOf(forms.get(position).getPrice()));
        }
    }
    @Override
    public int getItemCount() {
        return forms.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mDateText;
        private TextView mNameText;
        private TextView mKindText;
        private TextView mEntryText;
        private TextView mExitText;
        private TextView mDetailText;
        private TextView mPriceText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.mDateText = itemView.findViewById(R.id.dateText);
            this.mNameText = itemView.findViewById(R.id.nameText);
            this.mKindText = itemView.findViewById(R.id.kindText);
            this.mEntryText = itemView.findViewById(R.id.entryText);
            this.mExitText = itemView.findViewById(R.id.exitText);
            this.mDetailText = itemView.findViewById(R.id.detailText);
            this.mPriceText = itemView.findViewById(R.id.priceText);

        }
    }
}
