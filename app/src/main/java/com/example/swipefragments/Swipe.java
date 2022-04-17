package com.example.swipefragments;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Swipe extends FragmentPagerAdapter {

    public Swipe(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {
            ChatFragment chatFragment = new ChatFragment();
            return chatFragment;
        }
        else if(position==1)
        {
            StatusFragment statusFragment = new StatusFragment();
            return statusFragment;
        }
        else if(position==2)
        {
            CallFragment callFragment = new CallFragment();
            return callFragment;
        }

        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
