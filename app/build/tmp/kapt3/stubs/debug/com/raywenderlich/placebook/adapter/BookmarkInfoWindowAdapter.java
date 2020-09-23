package com.raywenderlich.placebook.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/raywenderlich/placebook/adapter/BookmarkInfoWindowAdapter;", "Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;", "context", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "contents", "Landroid/view/View;", "getContext", "()Landroid/app/Activity;", "getInfoContents", "marker", "Lcom/google/android/gms/maps/model/Marker;", "getInfoWindow", "app_debug"})
public final class BookmarkInfoWindowAdapter implements com.google.android.gms.maps.GoogleMap.InfoWindowAdapter {
    private final android.view.View contents = null;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Activity context = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View getInfoWindow(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.Marker marker) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View getInfoContents(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.Marker marker) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getContext() {
        return null;
    }
    
    public BookmarkInfoWindowAdapter(@org.jetbrains.annotations.NotNull()
    android.app.Activity context) {
        super();
    }
}