// Generated by view binder compiler. Do not edit!
package com.example.kmj_reco.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.kmj_reco.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemGifticonHistoryBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView gifticonBrand;

  @NonNull
  public final TextView gifticonExpiration;

  @NonNull
  public final ImageView gifticonImage;

  @NonNull
  public final TextView gifticonName;

  private ItemGifticonHistoryBinding(@NonNull LinearLayout rootView,
      @NonNull TextView gifticonBrand, @NonNull TextView gifticonExpiration,
      @NonNull ImageView gifticonImage, @NonNull TextView gifticonName) {
    this.rootView = rootView;
    this.gifticonBrand = gifticonBrand;
    this.gifticonExpiration = gifticonExpiration;
    this.gifticonImage = gifticonImage;
    this.gifticonName = gifticonName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemGifticonHistoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemGifticonHistoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_gifticon_history, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemGifticonHistoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.gifticonBrand;
      TextView gifticonBrand = rootView.findViewById(id);
      if (gifticonBrand == null) {
        break missingId;
      }

      id = R.id.gifticonExpiration;
      TextView gifticonExpiration = rootView.findViewById(id);
      if (gifticonExpiration == null) {
        break missingId;
      }

      id = R.id.gifticonImage;
      ImageView gifticonImage = rootView.findViewById(id);
      if (gifticonImage == null) {
        break missingId;
      }

      id = R.id.gifticonName;
      TextView gifticonName = rootView.findViewById(id);
      if (gifticonName == null) {
        break missingId;
      }

      return new ItemGifticonHistoryBinding((LinearLayout) rootView, gifticonBrand,
          gifticonExpiration, gifticonImage, gifticonName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}