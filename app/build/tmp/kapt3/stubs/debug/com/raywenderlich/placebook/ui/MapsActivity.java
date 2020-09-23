package com.raywenderlich.placebook.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0002QRB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0002J\u0016\u0010\u001c\u001a\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!H\u0002J\u001a\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u0010\u0010\'\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010(\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010)\u001a\u00020\u001aH\u0002J\b\u0010*\u001a\u00020\u001aH\u0002J\u0010\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u0013H\u0002J\b\u0010-\u001a\u00020\u001aH\u0002J\u000e\u0010.\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010/\u001a\u00020\u001a2\u0006\u00100\u001a\u000201H\u0002J\"\u00102\u001a\u00020\u001a2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002042\b\u00106\u001a\u0004\u0018\u000107H\u0014J\u0012\u00108\u001a\u00020\u001a2\b\u00109\u001a\u0004\u0018\u00010:H\u0014J\u0010\u0010;\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\tH\u0016J+\u0010=\u001a\u00020\u001a2\u0006\u00103\u001a\u0002042\f\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?2\u0006\u0010A\u001a\u00020BH\u0016\u00a2\u0006\u0002\u0010CJ\b\u0010D\u001a\u00020\u001aH\u0002J\b\u0010E\u001a\u00020\u001aH\u0002J\b\u0010F\u001a\u00020\u001aH\u0002J\b\u0010G\u001a\u00020\u001aH\u0002J\b\u0010H\u001a\u00020\u001aH\u0002J\b\u0010I\u001a\u00020\u001aH\u0002J\b\u0010J\u001a\u00020\u001aH\u0002J\b\u0010K\u001a\u00020\u001aH\u0002J\u0010\u0010L\u001a\u00020\u001a2\u0006\u0010M\u001a\u00020\u0012H\u0002J\u0010\u0010N\u001a\u00020\u001a2\u0006\u0010O\u001a\u00020PH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006S"}, d2 = {"Lcom/raywenderlich/placebook/ui/MapsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "bookmarkListAdapter", "Lcom/raywenderlich/placebook/adapter/BookmarkListAdapter;", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "mapsViewModel", "Lcom/raywenderlich/placebook/viewmodel/MapsViewModel;", "getMapsViewModel", "()Lcom/raywenderlich/placebook/viewmodel/MapsViewModel;", "mapsViewModel$delegate", "Lkotlin/Lazy;", "markers", "Ljava/util/HashMap;", "", "Lcom/google/android/gms/maps/model/Marker;", "placesClient", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "addPlaceMarker", "bookmark", "Lcom/raywenderlich/placebook/viewmodel/MapsViewModel$BookmarkView;", "createBookmarkObserver", "", "disableUserInteraction", "displayAllBookmarks", "bookmarks", "", "displayPoi", "pointOfInterest", "Lcom/google/android/gms/maps/model/PointOfInterest;", "displayPoiDisplayStep", "place", "Lcom/google/android/libraries/places/api/model/Place;", "photo", "Landroid/graphics/Bitmap;", "displayPoiGetPhotoStep", "displayPoiGetPlaceStep", "enableUserInteraction", "getCurrentLocation", "handleInfoWindowClick", "marker", "hideProgress", "moveToBookmark", "newBookmark", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMapReady", "googleMap", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "requestLocationPermissions", "searchAtCurrentLocation", "setupLocationClient", "setupMapListeners", "setupNavigationDrawer", "setupPlacesClient", "setupToolbar", "showProgress", "startBookmarkDetails", "bookmarkId", "updateMapToLocation", "location", "Landroid/location/Location;", "Companion", "PlaceInfo", "app_debug"})
public final class MapsActivity extends androidx.appcompat.app.AppCompatActivity implements com.google.android.gms.maps.OnMapReadyCallback {
    private com.google.android.gms.maps.GoogleMap mMap;
    private com.google.android.libraries.places.api.net.PlacesClient placesClient;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    private final kotlin.Lazy mapsViewModel$delegate = null;
    private com.raywenderlich.placebook.adapter.BookmarkListAdapter bookmarkListAdapter;
    private java.util.HashMap<java.lang.Long, com.google.android.gms.maps.model.Marker> markers;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_BOOKMARK_ID = "com.raywenderlich.placebook.EXTRA_BOOKMARK_ID";
    private static final int REQUEST_LOCATION = 1;
    private static final java.lang.String TAG = "MapsActivity";
    private static final int AUTOCOMPLETE_REQUEST_CODE = 2;
    public static final com.raywenderlich.placebook.ui.MapsActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.raywenderlich.placebook.viewmodel.MapsViewModel getMapsViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    private final void setupPlacesClient() {
    }
    
    private final void setupLocationClient() {
    }
    
    private final void requestLocationPermissions() {
    }
    
    private final void getCurrentLocation() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void displayPoi(com.google.android.gms.maps.model.PointOfInterest pointOfInterest) {
    }
    
    private final void displayPoiGetPlaceStep(com.google.android.gms.maps.model.PointOfInterest pointOfInterest) {
    }
    
    private final void displayPoiGetPhotoStep(com.google.android.libraries.places.api.model.Place place) {
    }
    
    private final void displayPoiDisplayStep(com.google.android.libraries.places.api.model.Place place, android.graphics.Bitmap photo) {
    }
    
    private final void setupMapListeners() {
    }
    
    private final void handleInfoWindowClick(com.google.android.gms.maps.model.Marker marker) {
    }
    
    private final com.google.android.gms.maps.model.Marker addPlaceMarker(com.raywenderlich.placebook.viewmodel.MapsViewModel.BookmarkView bookmark) {
        return null;
    }
    
    private final void displayAllBookmarks(java.util.List<com.raywenderlich.placebook.viewmodel.MapsViewModel.BookmarkView> bookmarks) {
    }
    
    private final void createBookmarkObserver() {
    }
    
    private final void startBookmarkDetails(long bookmarkId) {
    }
    
    private final void setupToolbar() {
    }
    
    private final void setupNavigationDrawer() {
    }
    
    private final void updateMapToLocation(android.location.Location location) {
    }
    
    public final void moveToBookmark(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.placebook.viewmodel.MapsViewModel.BookmarkView bookmark) {
    }
    
    private final void searchAtCurrentLocation() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void newBookmark(com.google.android.gms.maps.model.LatLng latLng) {
    }
    
    private final void disableUserInteraction() {
    }
    
    private final void enableUserInteraction() {
    }
    
    private final void showProgress() {
    }
    
    private final void hideProgress() {
    }
    
    public MapsActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/raywenderlich/placebook/ui/MapsActivity$PlaceInfo;", "", "place", "Lcom/google/android/libraries/places/api/model/Place;", "image", "Landroid/graphics/Bitmap;", "(Lcom/google/android/libraries/places/api/model/Place;Landroid/graphics/Bitmap;)V", "getImage", "()Landroid/graphics/Bitmap;", "getPlace", "()Lcom/google/android/libraries/places/api/model/Place;", "app_debug"})
    public static final class PlaceInfo {
        @org.jetbrains.annotations.Nullable()
        private final com.google.android.libraries.places.api.model.Place place = null;
        @org.jetbrains.annotations.Nullable()
        private final android.graphics.Bitmap image = null;
        
        @org.jetbrains.annotations.Nullable()
        public final com.google.android.libraries.places.api.model.Place getPlace() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.graphics.Bitmap getImage() {
            return null;
        }
        
        public PlaceInfo(@org.jetbrains.annotations.Nullable()
        com.google.android.libraries.places.api.model.Place place, @org.jetbrains.annotations.Nullable()
        android.graphics.Bitmap image) {
            super();
        }
        
        public PlaceInfo() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/raywenderlich/placebook/ui/MapsActivity$Companion;", "", "()V", "AUTOCOMPLETE_REQUEST_CODE", "", "EXTRA_BOOKMARK_ID", "", "REQUEST_LOCATION", "TAG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}