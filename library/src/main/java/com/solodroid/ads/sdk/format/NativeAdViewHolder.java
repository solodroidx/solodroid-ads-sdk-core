package com.solodroid.ads.sdk.format;

import android.content.Context;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public class NativeAdViewHolder extends RecyclerView.ViewHolder {

    private static final String TAG = "AdNetwork";

    public NativeAdViewHolder(View view) {
        super(view);
    }

    public void loadNativeAd(Context context, String adStatus, int placementStatus, String adNetwork, String backupAdNetwork, String adMobNativeId, String adManagerNativeId, String fanNativeId, String appLovinNativeId, boolean darkTheme, boolean legacyGDPR, String nativeAdStyle) {

    }

    public void loadBackupNativeAd(Context context, String adStatus, int placementStatus, String backupAdNetwork, String adMobNativeId, String adManagerNativeId, String fanNativeId, String appLovinNativeId, boolean darkTheme, boolean legacyGDPR, String nativeAdStyle) {

    }

    public void setNativeAdPadding(int left, int top, int right, int bottom) {

    }

}
