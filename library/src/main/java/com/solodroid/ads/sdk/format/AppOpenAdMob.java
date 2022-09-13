package com.solodroid.ads.sdk.format;

import android.app.Activity;
import android.content.Context;

import androidx.annotation.NonNull;

import com.solodroid.ads.sdk.util.OnShowAdCompleteListener;

import java.util.Date;

public class AppOpenAdMob {

    private static final String LOG_TAG = "AppOpenAd";
    private boolean isLoadingAd = false;
    public boolean isShowingAd = false;
    //public String appOpenAdUnitId = "";

    /**
     * Keep track of the time an app open ad is loaded to ensure you don't show an expired ad.
     */
    private long loadTime = 0;

    /**
     * Constructor.
     */
    public AppOpenAdMob() {
        //this.appOpenAdUnitId = appOpenAdUnitId;
    }

    /**
     * Load an ad.
     *
     * @param context the context of the activity that loads the ad
     */
    public void loadAd(Context context, String adMobAppOpenAdUnitId) {
        // Do not load ad if there is an unused ad or one is already loading.
        if (isLoadingAd || isAdAvailable()) {
            return;
        }

        isLoadingAd = true;
    }

    /**
     * Check if ad was loaded more than n hours ago.
     */
    public boolean wasLoadTimeLessThanNHoursAgo(long numHours) {
        long dateDifference = (new Date()).getTime() - loadTime;
        long numMilliSecondsPerHour = 3600000;
        return (dateDifference < (numMilliSecondsPerHour * numHours));
    }

    /**
     * Check if ad exists and can be shown.
     */
    public boolean isAdAvailable() {
        // Ad references in the app open beta will time out after four hours, but this time limit
        // may change in future beta versions. For details, see:
        // https://support.google.com/admob/answer/9341964?hl=en
        return false;
    }

    /**
     * Show the ad if one isn't already showing.
     *
     * @param activity the activity that shows the app open ad
     */
    public void showAdIfAvailable(@NonNull final Activity activity, String appOpenAdUnitId) {
        showAdIfAvailable(activity, appOpenAdUnitId, () -> {
            // Empty because the user will go back to the activity that shows the ad.
        });
    }

    /**
     * Show the ad if one isn't already showing.
     *
     * @param activity                 the activity that shows the app open ad
     * @param onShowAdCompleteListener the listener to be notified when an app open ad is complete
     */
    public void showAdIfAvailable(@NonNull final Activity activity, String appOpenAdUnitId, @NonNull OnShowAdCompleteListener onShowAdCompleteListener) {

    }
}