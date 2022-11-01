// Generated by view binder compiler. Do not edit!
package com.example.kmj_reco.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.kmj_reco.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCameraBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button takeBtn;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TitleBarBinding titleBar;

  private ActivityCameraBinding(@NonNull LinearLayout rootView, @NonNull Button takeBtn,
      @NonNull TextView textView6, @NonNull TitleBarBinding titleBar) {
    this.rootView = rootView;
    this.takeBtn = takeBtn;
    this.textView6 = textView6;
    this.titleBar = titleBar;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCameraBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCameraBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_camera, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCameraBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.takeBtn;
      Button takeBtn = rootView.findViewById(id);
      if (takeBtn == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = rootView.findViewById(id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.title_bar;
      View titleBar = rootView.findViewById(id);
      if (titleBar == null) {
        break missingId;
      }
      TitleBarBinding binding_titleBar = TitleBarBinding.bind(titleBar);

      return new ActivityCameraBinding((LinearLayout) rootView, takeBtn, textView6,
          binding_titleBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}