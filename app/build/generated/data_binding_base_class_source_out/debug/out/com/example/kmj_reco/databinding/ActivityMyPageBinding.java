// Generated by view binder compiler. Do not edit!
package com.example.kmj_reco.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.kmj_reco.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMyPageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton btnBack;

  @NonNull
  public final Button btnGifticon;

  @NonNull
  public final Button btnLogout;

  @NonNull
  public final Button btnModification;

  @NonNull
  public final Button btnNotice;

  @NonNull
  public final Button btnService;

  @NonNull
  public final TextView mypage;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView12;

  @NonNull
  public final TitleBarBinding titleBar;

  @NonNull
  public final TextView userPoint;

  private ActivityMyPageBinding(@NonNull ConstraintLayout rootView, @NonNull ImageButton btnBack,
      @NonNull Button btnGifticon, @NonNull Button btnLogout, @NonNull Button btnModification,
      @NonNull Button btnNotice, @NonNull Button btnService, @NonNull TextView mypage,
      @NonNull TextView textView11, @NonNull TextView textView12, @NonNull TitleBarBinding titleBar,
      @NonNull TextView userPoint) {
    this.rootView = rootView;
    this.btnBack = btnBack;
    this.btnGifticon = btnGifticon;
    this.btnLogout = btnLogout;
    this.btnModification = btnModification;
    this.btnNotice = btnNotice;
    this.btnService = btnService;
    this.mypage = mypage;
    this.textView11 = textView11;
    this.textView12 = textView12;
    this.titleBar = titleBar;
    this.userPoint = userPoint;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMyPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMyPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_my_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMyPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_back;
      ImageButton btnBack = rootView.findViewById(id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.btn_gifticon;
      Button btnGifticon = rootView.findViewById(id);
      if (btnGifticon == null) {
        break missingId;
      }

      id = R.id.btn_logout;
      Button btnLogout = rootView.findViewById(id);
      if (btnLogout == null) {
        break missingId;
      }

      id = R.id.btn_modification;
      Button btnModification = rootView.findViewById(id);
      if (btnModification == null) {
        break missingId;
      }

      id = R.id.btn_notice;
      Button btnNotice = rootView.findViewById(id);
      if (btnNotice == null) {
        break missingId;
      }

      id = R.id.btn_service;
      Button btnService = rootView.findViewById(id);
      if (btnService == null) {
        break missingId;
      }

      id = R.id.mypage;
      TextView mypage = rootView.findViewById(id);
      if (mypage == null) {
        break missingId;
      }

      id = R.id.textView11;
      TextView textView11 = rootView.findViewById(id);
      if (textView11 == null) {
        break missingId;
      }

      id = R.id.textView12;
      TextView textView12 = rootView.findViewById(id);
      if (textView12 == null) {
        break missingId;
      }

      id = R.id.title_bar;
      View titleBar = rootView.findViewById(id);
      if (titleBar == null) {
        break missingId;
      }
      TitleBarBinding binding_titleBar = TitleBarBinding.bind(titleBar);

      id = R.id.user_point;
      TextView userPoint = rootView.findViewById(id);
      if (userPoint == null) {
        break missingId;
      }

      return new ActivityMyPageBinding((ConstraintLayout) rootView, btnBack, btnGifticon, btnLogout,
          btnModification, btnNotice, btnService, mypage, textView11, textView12, binding_titleBar,
          userPoint);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}