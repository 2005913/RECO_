// Generated by view binder compiler. Do not edit!
package com.example.kmj_reco.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.kmj_reco.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RecobinDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView btnQrScan;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final TextView recobinFulladdress;

  @NonNull
  public final TextView textView13;

  @NonNull
  public final TextView textView9;

  private RecobinDetailBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView btnQrScan,
      @NonNull ImageView imageView4, @NonNull TextView recobinFulladdress,
      @NonNull TextView textView13, @NonNull TextView textView9) {
    this.rootView = rootView;
    this.btnQrScan = btnQrScan;
    this.imageView4 = imageView4;
    this.recobinFulladdress = recobinFulladdress;
    this.textView13 = textView13;
    this.textView9 = textView9;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RecobinDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RecobinDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.recobin_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RecobinDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_qr_scan;
      ImageView btnQrScan = rootView.findViewById(id);
      if (btnQrScan == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = rootView.findViewById(id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.recobin_fulladdress;
      TextView recobinFulladdress = rootView.findViewById(id);
      if (recobinFulladdress == null) {
        break missingId;
      }

      id = R.id.textView13;
      TextView textView13 = rootView.findViewById(id);
      if (textView13 == null) {
        break missingId;
      }

      id = R.id.textView9;
      TextView textView9 = rootView.findViewById(id);
      if (textView9 == null) {
        break missingId;
      }

      return new RecobinDetailBinding((ConstraintLayout) rootView, btnQrScan, imageView4,
          recobinFulladdress, textView13, textView9);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}