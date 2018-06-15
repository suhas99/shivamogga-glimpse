package com.bezets.cityappar.utils;

import android.support.v7.widget.CardView;

/**
 * Created by Bezet on 01/04/2017.
 */

public interface CardAdapter {
    int MAX_ELEVATION_FACTOR = 8;

    float getBaseElevation();

    CardView getCardViewAt(int position);

    int getCount();
}
