package com.arka.veerabhadraswamymantra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.navigation.fragment.NavHostFragment;

import com.arka.veerabhadraswamymantra.databinding.FragmentFirstBinding;

public class FirstFragment extends ListFragment {

    String[] code_name = {"ಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ಸುಪ್ರಭಾತ", "ಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ಕವಚಂ", "ಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ದಂಡಕಂ", "ಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ತಾರಾವಳಿ", "ಶ್ರೀ ವೀರಭದ್ರಾಷ್ಟಕಂ", "ಶ್ರೀ ಭದ್ರ ಕವಚಂ", "ಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ಸಹಸ್ರನಾಮಸ್ತೋತ್ರ", "ಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ಸಹಸ್ರನಾಮವಳಿ", "ಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ಅಷ್ಟೋತ್ತರ ಶತನಾಮಾವಳಿ ಸ್ತೋತ್ರ", "ಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ಅಷ್ಟೋತ್ತರ ಶತನಾಮಾವಳಿ","ಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ವಡಪುಗಳು","ಗುಗ್ಗುಳದ ಬಗ್ಗೆ ಮಾಹಿತಿ","ಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ಸಂಕ್ಷಿಪ್ತ ಪರಿಚಯ","ಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ಆಚರಣೆಗಳು","ಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ಪ್ರಾರ್ಥನೆ","ಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ಮಂಗಳ ಶ್ಲೋಕ","ಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ಶತಕ","ಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ಮಂಗಳ","ದ್ವಾತ್ರಿಂಶದ್ಭುಜ ಶ್ರೀ ವೀರಭದ್ರ ಧ್ಯಾನಂ","ಶ್ರೀ ಶರಭ ಹೃದಯ ಸ್ತೋತ್ರ","ಶ್ರೀ ಶರಭೋಪನಿಷತ್ತು"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(), android.R.layout.simple_list_item_1, code_name);
        setListAdapter(adapter);
        return view;

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Toast.makeText(getActivity().getBaseContext(), code_name[position], Toast.LENGTH_SHORT).show();
        moveToNewActivity();
    }

    private void moveToNewActivity () {

        Intent i = new Intent(getActivity(), PagerActivity.class);
        startActivity(i);
        ((Activity) getActivity()).overridePendingTransition(0, 0);

    }
}
