package com.example.fragmentdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 
 * A fragment in which will display some text initially and then have some of it
 * replaced by data which originated in another fragment.
 * 
 */
public class SecondFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		// The view that will hold the second fragment
		View view = inflater.inflate(R.layout.fragment_secondary, container,
				false);

		return view;
	}
}