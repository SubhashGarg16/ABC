package subhash.app;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapteer extends FragmentPagerAdapter {

    int tabcount;
    public PageAdapteer(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount = behavior;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0: return new LostFragment();
            case 1: return new FoundFragment();
            default:  return null;
        }

    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
