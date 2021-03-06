package com.gapestation.collegeappdevaughn;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FamilyMemberFragment extends Fragment {
    private TextView firstnametext;
    private TextView lastnametext;
    public Guardian FamilyMember1 = new Guardian("Josh", "Peck");

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup view, Bundle bundle) {
        super.onCreateView(inflater, view, bundle);

        View rootView = inflater.inflate(R.layout.fragment_guardian, view, false);
        firstnametext = (TextView) rootView.findViewById(R.id.guardianfirstname);
        lastnametext = (TextView) rootView.findViewById(R.id.guardianlastname);

        lastnametext.setText(FamilyMember1.getLastName());
        firstnametext.setText(FamilyMember1.getFirstName());

        return rootView;
    }
}
