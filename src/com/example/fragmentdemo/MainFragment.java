package com.example.fragmentdemo;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * 
 * A fragment in which data will be entered. This data will then be sent to the
 * parent activity which will, in turn, send it on to a second fragment.
 * 
 */
public class MainFragment extends Fragment {

	private OnSubmitListener listener;
	private View view;
	private EditText entryField;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		// The view that will hold the main fragment
		view = inflater.inflate(R.layout.fragment_main, container, false);

		// The items in the main fragment
		entryField = (EditText) view.findViewById(R.id.editTextEntryField);
		Button submit = (Button) view.findViewById(R.id.buttonSubmit);

		// Add a listener to the submit button
		submit.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				// The text that was entered
				String enteredText = entryField.getText().toString();

				/*
				 * Pass the entered text through this fragment's interface to
				 * the onSubmission method that is implemented in the parent
				 * activity.
				 */
				listener.onSubmission(enteredText);
			}
		});

		return view;
	}

	/**
	 * An interface to be implemented by the parent activity.
	 */
	public interface OnSubmitListener {

		/**
		 * 
		 * An abstract method that will take the text that is passed to it from
		 * this fragment and do something with it in the parent activity.
		 * 
		 * In this instance, the DemoActivity will take this string and
		 * substitute it for a sting of text in SecondFagment.
		 * 
		 * @param text
		 *            The text that will be passed from this fragment to the
		 *            parent activity.
		 */
		public void onSubmission(String text);
	}

	@Override
	public void onAttach(Activity activity) {

		super.onAttach(activity);

		/*
		 * Check that the activity adding this fragment has implemented the
		 * OnSubmitListener interface. If it has not then an exception is thrown
		 * with a message stating that it must be implemented.
		 */
		if (activity instanceof OnSubmitListener) {
			listener = (OnSubmitListener) activity;
		} else {
			throw new ClassCastException(activity.toString()
					+ " must implemenet MainFragment.OnSubmitListener");
		}
	}

}
