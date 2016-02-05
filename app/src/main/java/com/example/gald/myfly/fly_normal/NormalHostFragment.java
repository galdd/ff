package com.example.gald.myfly.fly_normal;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.gald.myfly.R;

public class NormalHostFragment extends Fragment {

	ImageView mToggle;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.host_item, container, false);
		mToggle = (ImageView) view.findViewById(R.id.toggle);
		mToggle.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				((FlyNormal) getActivity()).getRootView()
						.animateToggle();
			}
		});
		return view;
	}

}
