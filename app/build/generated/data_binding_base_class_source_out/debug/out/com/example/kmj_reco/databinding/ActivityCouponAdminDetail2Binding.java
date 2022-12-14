// Generated by view binder compiler. Do not edit!
package com.example.kmj_reco.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class ActivityCouponAdminDetail2Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView buydate;

  @NonNull
  public final Button gifticonADDeleteBtn;

  @NonNull
  public final Button gifticonADEditButton;

  @NonNull
  public final TextView gifticonExpirydate;

  @NonNull
  public final ImageView gifticonImage;

  @NonNull
  public final TextView gifticonUsage;

  @NonNull
  public final TextView gifticonadstNum;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView24;

  @NonNull
  public final TextView textView47;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final TitleBarBinding titleBar;

  @NonNull
  public final TextView usedate;

  private ActivityCouponAdminDetail2Binding(@NonNull ConstraintLayout rootView,
      @NonNull TextView buydate, @NonNull Button gifticonADDeleteBtn,
      @NonNull Button gifticonADEditButton, @NonNull TextView gifticonExpirydate,
      @NonNull ImageView gifticonImage, @NonNull TextView gifticonUsage,
      @NonNull TextView gifticonadstNum, @NonNull TextView textView10, @NonNull TextView textView24,
      @NonNull TextView textView47, @NonNull TextView textView7, @NonNull TextView textView8,
      @NonNull TitleBarBinding titleBar, @NonNull TextView usedate) {
    this.rootView = rootView;
    this.buydate = buydate;
    this.gifticonADDeleteBtn = gifticonADDeleteBtn;
    this.gifticonADEditButton = gifticonADEditButton;
    this.gifticonExpirydate = gifticonExpirydate;
    this.gifticonImage = gifticonImage;
    this.gifticonUsage = gifticonUsage;
    this.gifticonadstNum = gifticonadstNum;
    this.textView10 = textView10;
    this.textView24 = textView24;
    this.textView47 = textView47;
    this.textView7 = textView7;
    this.textView8 = textView8;
    this.titleBar = titleBar;
    this.usedate = usedate;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCouponAdminDetail2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCouponAdminDetail2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_coupon_admin_detail2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCouponAdminDetail2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buydate;
      TextView buydate = rootView.findViewById(id);
      if (buydate == null) {
        break missingId;
      }

      id = R.id.gifticonADDeleteBtn;
      Button gifticonADDeleteBtn = rootView.findViewById(id);
      if (gifticonADDeleteBtn == null) {
        break missingId;
      }

      id = R.id.gifticonADEditButton;
      Button gifticonADEditButton = rootView.findViewById(id);
      if (gifticonADEditButton == null) {
        break missingId;
      }

      id = R.id.gifticonExpirydate;
      TextView gifticonExpirydate = rootView.findViewById(id);
      if (gifticonExpirydate == null) {
        break missingId;
      }

      id = R.id.gifticonImage;
      ImageView gifticonImage = rootView.findViewById(id);
      if (gifticonImage == null) {
        break missingId;
      }

      id = R.id.gifticon_usage;
      TextView gifticonUsage = rootView.findViewById(id);
      if (gifticonUsage == null) {
        break missingId;
      }

      id = R.id.gifticonadst_num;
      TextView gifticonadstNum = rootView.findViewById(id);
      if (gifticonadstNum == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = rootView.findViewById(id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.textView24;
      TextView textView24 = rootView.findViewById(id);
      if (textView24 == null) {
        break missingId;
      }

      id = R.id.textView47;
      TextView textView47 = rootView.findViewById(id);
      if (textView47 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = rootView.findViewById(id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = rootView.findViewById(id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.title_bar;
      View titleBar = rootView.findViewById(id);
      if (titleBar == null) {
        break missingId;
      }
      TitleBarBinding binding_titleBar = TitleBarBinding.bind(titleBar);

      id = R.id.usedate;
      TextView usedate = rootView.findViewById(id);
      if (usedate == null) {
        break missingId;
      }

      return new ActivityCouponAdminDetail2Binding((ConstraintLayout) rootView, buydate,
          gifticonADDeleteBtn, gifticonADEditButton, gifticonExpirydate, gifticonImage,
          gifticonUsage, gifticonadstNum, textView10, textView24, textView47, textView7, textView8,
          binding_titleBar, usedate);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
