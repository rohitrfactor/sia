package com.example.garorasu.fragmenttest;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by garorasu on 26/3/16.
 */
public class Calendar extends Fragment {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private String[] nyDataset = {"Jan 1","Jan 2","Jan 12","Jan 14","Jan 14","Jan 15","Jan 15","Jan 16","Jan 16","Jan 17","Jan 23","Jan 25","Jan 26","Jan 28","Jan 31","Feb 2","Feb 9","Feb 9","Feb 12","Feb 12","Feb 13","Feb 19","Feb 22","Mar 4","Mar 5","Mar 7","Mar 9","Mar 22","Mar 23","Mar 23","Mar 23","Mar 24","Mar 24","Mar 25","Apr 1","Apr 1","Apr 5","Apr 8","Apr 8","Apr 13","Apr 13","Apr 13","Apr 13","Apr 14","Apr 14","Apr 14","Apr 14","Apr 14","Apr 14","Apr 15","Apr 15","Apr 15","Apr 19","Apr 20","Apr 20","Apr 21","May 1","May 1","May 8","May 8","May 9","May 9","May 16","May 21","May 25","Jun 7","Jun 8","Jun 14","Jun 15","Jun 20","Jul 1","Jul 6","Jul 6","Jul 7","Jul 12","Jul 26","Jul 31","Aug 1","Aug 2","Aug 15","Aug 17","Aug 18","Aug 24","Aug 25","Sep 2","Sep 3","Sep 4","Sep 5","Sep 6","Sep 10","Sep 12","Sep 13","Sep 13","Sep 14","Sep 15","Sep 16","Sep 16","Sep 21","Sep 23","Sep 28","Sep 30","Oct 1","Oct 2","Oct 2","Oct 8","Oct 9","Oct 10","Oct 10","Oct 10","Oct 11","Oct 11","Oct 12","Oct 12","Oct 13","Oct 14","Oct 15","Oct 15","Oct 16","Oct 17","Oct 29","Oct 29","Oct 29","Oct 30","Oct 31","Oct 31","Oct 31","Nov 1","Nov 1","Nov 1","Nov 1","Nov 6","Nov 7","Nov 14","Nov 14","Nov 17","Dec 3","Dec 4","Dec 12","Dec 13","Dec 25","Dec 26","Dec 26"};
    private String[] myDataset={"New Years Day","Mannam Jayanthi","Birthday of Swami Vivekananda","Bhogi","Pongal","Pongal","Sankranti","Guru Gobind Singh Jayanti","Thiruvalluvar Day","Uzhavar Tirunal","Netaji Subhas Chandra Bose Jayanti","Statehood Day","Republic Day","Birthday of Lala Lajpat Rai","Me-dam-me-phi","Public Holiday","Losar","Sonam Lhochar","Vasant Panchami","Sir Chhotu Ram Jayanti","Sree Panchami","Chhatrapati Shivaji Maharaj Jayanti","Guru Ravidas Birthday","Maharshi Dayanand Saraswati Jayanti","Panchayati Raj Diwas","Maha Shivratri","Solar Eclipse","Bihar Divas","Doljatra","Shahidi Divas S. Bhagat Singh Ji","Shaheedi Diwas of Bhagat Singh, Rajguru & Sukhdev","Holi","Maundy Thursday","Good Friday","Odisha Day","Bank Holiday","Babu Jagjivan Ram Birthday","Ugadi","Cheti Chand","Vaisakhi","Bohag Bihu Holiday","Biju Festival","Maha Vishuba Sankranti","Tamil New Year","Bengali New Year","Dr Ambedkar Jayanti","Vishu","Bohag Bihu","Ashoka's Birth Anniversary","Ram Navami","Himachal Day","Bohag Bihu Holiday","Mahavir Jayanti","Garia Puja","Mahavir Jayanti","Hazrat Alis Birthday","Maharashtra Day","May Day","Birthday of Rabindra Nath Tagore","Parashurama Jayanti","Parashurama Jayanti","Basava Jayanthi","State Day","Buddha Purnima","Birthday of Kazi Nazrul Islam","Maharana Pratap Jayanti","Guru Arjun Dev Martyrdom day","Pahili Raja","Raja Sankranti","Sant Guru Kabir Jayanti","Jumat-ul-Wida","Idul Fitr","Ratha Yatra","Ramzan","Kharchi Puja","Ker Puja","Martyrdom Day of Shaheed Udham Singh","Bonalu","Karkkadaka Vavu","Independence Day","Parsi New Year","Raksha Bandhan","Sreekrishna Jayanthi","Janmashtami","Parkash Utsav Sri Guru Granth Sahib Ji","Tithi of Shrimanta Shankar Dev","Teej","Ganesh Chaturthi","Nuakhai","Birthday of Baba Sri Chand Ji","Idul Juha","First Onam","Bakrid","Thiruvonam","Third Onam","Sree Narayana Guru Jayanti","Fourth Onam","Sree Narayana Guru Samadhi","Haryana's Heroes' Martyrdom Day","Birthday of S. Bhagat Singh Ji","Mahalaya","Maharaja Agrasen Jayanati","Mahatma Gandhi Birthday","Muharram","Maha Saptami","Durgastami","Ayudha Puja","Navami of Durga Puja","Mahanavami","Dussehra","Vijaya Dashami","Muharram (10th Day)","Durga Puja","Durga Puja Holiday","Durga Puja Holiday","Maharishi Valmiki Birthday","Lakshmi Puja","Maharishi Valmiki Birthday","Parkash Gurpurab of Sri Guru Ram Dass Ji","Narak Chaturdashi","Deepavali","Kali Puja","Deewali","Vikram Samvat New Year","Deepavali","Vishavkarma day","Bhai Bij","Kannada Rajyothsava","Haryana Day","Vishavkarma day","Chhath Puja","Chhath Puja","Guru Nanak Birthday","Rasa Purnima","Kanakadasa Jayanthi","World Disabled Day","Martyrdom Day of Sri Guru Teg Bahadur Ji","Id-e-Milad","Id-e-Milad","Christmas Day","Shaheed Udham Singh's Birthday","Boxing Day"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.calendar, container, false);
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)

        mAdapter = new MyAdapter(myDataset,nyDataset);
        mRecyclerView.setAdapter(mAdapter);

        return rootView;
    }

    public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
        private String[] mDataset;
        private String[] nDataset;

        // Provide a reference to the views for each data item
        // Complex data items may need more than one view per item, and
        // you provide access to all the views for a data item in a view holder
        public class ViewHolder extends RecyclerView.ViewHolder {
            // each data item is just a string in this case
            public TextView mTextView;
            public TextView mTextView2;
            public ViewHolder(View v) {
                super(v);
                mTextView = (TextView) v.findViewById(R.id.textR);
                mTextView2 = (TextView) v.findViewById(R.id.textR2);
            }
        }

        // Provide a suitable constructor (depends on the kind of dataset)
        public MyAdapter(String[] myDataset,String[] nyDataset) {
            nDataset = nyDataset;
            mDataset = myDataset;
        }

        // Create new views (invoked by the layout manager)
        @Override
        public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                       int viewType) {
            // create a new view
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.my_text_holiday, parent, false);
            // set the view's size, margins, paddings and layout parameters

            ViewHolder vh = new ViewHolder(v);
            return vh;
        }

        // Replace the contents of a view (invoked by the layout manager)
        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            // - get element from your dataset at this position
            // - replace the contents of the view with that element
            holder.mTextView.setText(nDataset[position]);
            holder.mTextView2.setText(mDataset[position]);

        }

        // Return the size of your dataset (invoked by the layout manager)
        @Override
        public int getItemCount() {
            return mDataset.length;
        }
    }
}
