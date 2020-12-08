package cl.sebastian.mvptelefonos.view;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CellAdapter extends RecyclerView.Adapter<CellAdapter.CellVH> {

    @NonNull
    @Override
    public CellVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CellVH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CellVH extends RecyclerView.ViewHolder {
        public CellVH(@NonNull View itemView) {
            super(itemView);
        }
    }
}
