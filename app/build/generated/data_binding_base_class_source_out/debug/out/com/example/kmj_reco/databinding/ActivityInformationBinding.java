// Generated by view binder compiler. Do not edit!
package com.example.kmj_reco.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.kmj_reco.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityInformationBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnCancel;

  @NonNull
  public final Button btnCheck;

  @NonNull
  public final EditText etBirth;

  @NonNull
  public final EditText etEmail;

  @NonNull
  public final EditText etId;

  @NonNull
  public final EditText etName;

  @NonNull
  public final EditText etPass;

  @NonNull
  public final EditText etPass2;

  @NonNull
  public final EditText etPhone;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TitleBarBinding titleBar;

  private ActivityInformationBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnCancel,
      @NonNull Button btnCheck, @NonNull EditText etBirth, @NonNull EditText etEmail,
      @NonNull EditText etId, @NonNull EditText etName, @NonNull EditText etPass,
      @NonNull EditText etPass2, @NonNull EditText etPhone, @NonNull TextView textView2,
      @NonNull TitleBarBinding titleBar) {
    this.rootView = rootView;
    this.btnCancel = btnCancel;
    this.btnCheck = btnCheck;
    this.etBirth = etBirth;
    this.etEmail = etEmail;
    this.etId = etId;
    this.etName = etName;
    this.etPass = etPass;
    this.etPass2 = etPass2;
    this.etPhone = etPhone;
    this.textView2 = textView2;
    this.titleBar = titleBar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityInformationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityInformationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_information, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityInformationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_cancel;
      Button btnCancel = rootView.findViewById(id);
      if (btnCancel == null) {
        break missingId;
      }

      id = R.id.btn_check;
      Button btnCheck = rootView.findViewById(id);
      if (btnCheck == null) {
        break missingId;
      }

      id = R.id.et_birth;
      EditText etBirth = rootView.findViewById(id);
      if (etBirth == null) {
        break missingId;
      }

      id = R.id.et_email;
      EditText etEmail = rootView.findViewById(id);
      if (etEmail == null) {
        break missingId;
      }

      id = R.id.et_id;
      EditText etId = rootView.findViewById(id);
      if (etId == null) {
        break missingId;
      }

      id = R.id.et_name;
      EditText etName = rootView.findViewById(id);
      if (etName == null) {
        break missingId;
      }

      id = R.id.et_pass;
      EditText etPass = rootView.findViewById(id);
      if (etPass == null) {
        break missingId;
      }

      id = R.id.et_pass2;
      EditText etPass2 = rootView.findViewById(id);
      if (etPass2 == null) {
        break missingId;
      }

      id = R.id.et_phone;
      EditText etPhone = rootView.findViewById(id);
      if (etPhone == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = rootView.findViewById(id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.title_bar;
      View titleBar = rootView.findViewById(id);
      if (titleBar == null) {
        break missingId;
      }
      TitleBarBinding binding_titleBar = TitleBarBinding.bind(titleBar);

      return new ActivityInformationBinding((ConstraintLayout) rootView, btnCancel, btnCheck,
          etBirth, etEmail, etId, etName, etPass, etPass2, etPhone, textView2, binding_titleBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
