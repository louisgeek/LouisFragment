package test.sunstar.com.louisfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_main, container, false);
       Button buttonGotoNewFragment= (Button) rootView.findViewById(R.id.buttonGotoNewFragment);
        buttonGotoNewFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                     getFragmentManager()
                        .beginTransaction()
                        .addToBackStack(null)
                             .replace(R.id.fragment, new BlankFragment()).commit();
            }
        });

       // Log.d("zhuzhu","xxxx");

        return rootView;
    }
}
