package fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.hyperdev.androidme.R;
import java.util.List;


public class AndroidFragment extends Fragment {

    ImageView androidFragmentImage;
    private List<Integer> whatPartt;
    private int partIndex = 0 ;
    public AndroidFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.android_fragment, container, false);



       androidFragmentImage = (ImageView) view.findViewById(R.id.androidFragment_img);

        return view;
    }



    public void setWhatPart(List<Integer> whatPart) {
        this.whatPartt = whatPart;
        androidFragmentImage.setImageResource(this.whatPartt[partIndex]);

    }

}
