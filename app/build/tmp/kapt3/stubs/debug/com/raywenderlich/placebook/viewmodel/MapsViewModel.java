package com.raywenderlich.placebook.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0014\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\nJ\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0013H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/raywenderlich/placebook/viewmodel/MapsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "TAG", "", "bookmarkRepo", "Lcom/raywenderlich/placebook/repository/BookmarkRepo;", "bookmarks", "Landroidx/lifecycle/LiveData;", "", "Lcom/raywenderlich/placebook/viewmodel/MapsViewModel$BookmarkView;", "addBookmark", "", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "(Lcom/google/android/gms/maps/model/LatLng;)Ljava/lang/Long;", "addBookmarkFromPlace", "", "place", "Lcom/google/android/libraries/places/api/model/Place;", "image", "Landroid/graphics/Bitmap;", "bookmarkToBookmarkView", "bookmark", "Lcom/raywenderlich/placebook/model/Bookmark;", "getBookmarkViews", "getPlaceCategory", "mapBookmarksToBookmarkView", "BookmarkView", "app_debug"})
public final class MapsViewModel extends androidx.lifecycle.AndroidViewModel {
    private final java.lang.String TAG = "MapsViewModel";
    private com.raywenderlich.placebook.repository.BookmarkRepo bookmarkRepo;
    private androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.placebook.viewmodel.MapsViewModel.BookmarkView>> bookmarks;
    
    public final void addBookmarkFromPlace(@org.jetbrains.annotations.NotNull()
    com.google.android.libraries.places.api.model.Place place, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap image) {
    }
    
    private final com.raywenderlich.placebook.viewmodel.MapsViewModel.BookmarkView bookmarkToBookmarkView(com.raywenderlich.placebook.model.Bookmark bookmark) {
        return null;
    }
    
    private final void mapBookmarksToBookmarkView() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.placebook.viewmodel.MapsViewModel.BookmarkView>> getBookmarkViews() {
        return null;
    }
    
    private final java.lang.String getPlaceCategory(com.google.android.libraries.places.api.model.Place place) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long addBookmark(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng latLng) {
        return null;
    }
    
    public MapsViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\rJD\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$J\t\u0010%\u001a\u00020\nH\u00d6\u0001J\t\u0010&\u001a\u00020\u0007H\u00d6\u0001R\u0015\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015\u00a8\u0006\'"}, d2 = {"Lcom/raywenderlich/placebook/viewmodel/MapsViewModel$BookmarkView;", "", "id", "", "location", "Lcom/google/android/gms/maps/model/LatLng;", "name", "", "phone", "categoryResourceId", "", "(Ljava/lang/Long;Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getCategoryResourceId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLocation", "()Lcom/google/android/gms/maps/model/LatLng;", "getName", "()Ljava/lang/String;", "getPhone", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Long;Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/raywenderlich/placebook/viewmodel/MapsViewModel$BookmarkView;", "equals", "", "other", "getImage", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "hashCode", "toString", "app_debug"})
    public static final class BookmarkView {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long id = null;
        @org.jetbrains.annotations.NotNull()
        private final com.google.android.gms.maps.model.LatLng location = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String phone = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer categoryResourceId = null;
        
        @org.jetbrains.annotations.Nullable()
        public final android.graphics.Bitmap getImage(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.android.gms.maps.model.LatLng getLocation() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPhone() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCategoryResourceId() {
            return null;
        }
        
        public BookmarkView(@org.jetbrains.annotations.Nullable()
        java.lang.Long id, @org.jetbrains.annotations.NotNull()
        com.google.android.gms.maps.model.LatLng location, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String phone, @org.jetbrains.annotations.Nullable()
        java.lang.Integer categoryResourceId) {
            super();
        }
        
        public BookmarkView() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.android.gms.maps.model.LatLng component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.raywenderlich.placebook.viewmodel.MapsViewModel.BookmarkView copy(@org.jetbrains.annotations.Nullable()
        java.lang.Long id, @org.jetbrains.annotations.NotNull()
        com.google.android.gms.maps.model.LatLng location, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String phone, @org.jetbrains.annotations.Nullable()
        java.lang.Integer categoryResourceId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}