package com.example.fragmentdemo;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class MainFragment extends Fragment {

	private OnSubmitListener listener;
	private View rootView;
	private EditText entryField;


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		rootView = inflater.inflate(R.layout.fragment_main, container, false);
		entryField = (EditText) rootView.findViewById(R.id.editTextEntryField);

		Button submit = (Button) rootView.findViewById(R.id.buttonSubmit);
		submit.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				String enteredText = entryField.getText().toString();

				listener.onSubmission(enteredText);
			}
		});

		return rootView;
	}

	public interface OnSubmitListener {
		public void onSubmission(String text);
	}

	@Override
	public void onAttach(Activity activity) {

		super.onAttach(activity);

		if (activity instanceof OnSubmitListener) {
			listener = (OnSubmitListener) activity;
		} else {
			throw new ClassCastException(activity.toString()
					+ " must implemenet MainFragment.OnSubmitListener");
		}
	}

}
