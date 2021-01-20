package subhash.app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LostFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LostFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView rcv;
    RecAdapter recAdapter;

    public LostFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LostFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LostFragment newInstance(String param1, String param2) {
        LostFragment fragment = new LostFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_lost, container, false);
        rcv=view.findViewById(R.id.lost_recview);
        rcv.setLayoutManager(new LinearLayoutManager(getContext()));
        recAdapter=new RecAdapter(dataqueue());
        rcv.setAdapter(recAdapter);

        return view;
    }

    public ArrayList<DataModel> dataqueue() {

        ArrayList<DataModel> holder = new ArrayList<>();

        DataModel obj1 = new DataModel();
        obj1.setImgName(R.drawable.puppyimg);
        obj1.setHeader("bruuno");
        obj1.setDesc1("2nd Jan 2021");
        obj1.setDesc2("pointer");
        holder.add(obj1);

        DataModel obj2 = new DataModel();
        obj2.setImgName(R.drawable.puppyimg);
        obj2.setHeader("bruuno");
        obj2.setDesc1("2nd Jan 2021");
        obj2.setDesc2("pointer");
        holder.add(obj2);

        DataModel obj3 = new DataModel();
        obj3.setImgName(R.drawable.puppyimg);
        obj3.setHeader("bruuno");
        obj3.setDesc1("2nd Jan 2021");
        obj3.setDesc2("pointer");
        holder.add(obj3);

        DataModel obj4 = new DataModel();
        obj4.setImgName(R.drawable.puppyimg);
        obj4.setHeader("bruuno");
        obj4.setDesc1("2nd Jan 2021");
        obj4.setDesc2("pointer");
        holder.add(obj4);

        DataModel obj5 = new DataModel();
        obj5.setImgName(R.drawable.puppyimg);
        obj5.setHeader("bruuno");
        obj5.setDesc1("2nd Jan 2021");
        obj5.setDesc2("pointer");
        holder.add(obj5);

        DataModel obj6 = new DataModel();
        obj6.setImgName(R.drawable.puppyimg);
        obj6.setHeader("bruuno");
        obj6.setDesc1("2nd Jan 2021");
        obj6.setDesc2("pointer");
        holder.add(obj6);

        DataModel obj7 = new DataModel();
        obj7.setImgName(R.drawable.puppyimg);
        obj7.setHeader("bruuno");
        obj7.setDesc1("2nd Jan 2021");
        obj7.setDesc2("pointer");
        holder.add(obj7);

        DataModel obj8 = new DataModel();
        obj8.setImgName(R.drawable.puppyimg);
        obj8.setHeader("bruuno");
        obj8.setDesc1("2nd Jan 2021");
        obj8.setDesc2("pointer");
        holder.add(obj8);

        return holder;
    }

}