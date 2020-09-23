package com.raywenderlich.placebook.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0007J\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0013J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u0016\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0007R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/raywenderlich/placebook/viewmodel/BookmarkDetailsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "bookmarkDetailsView", "Landroidx/lifecycle/LiveData;", "Lcom/raywenderlich/placebook/viewmodel/BookmarkDetailsViewModel$BookmarkDetailsView;", "bookmarkRepo", "Lcom/raywenderlich/placebook/repository/BookmarkRepo;", "bookmarkToBookmarkView", "bookmark", "Lcom/raywenderlich/placebook/model/Bookmark;", "bookmarkViewToBookmark", "bookmarkView", "deleteBookmark", "", "getBookmark", "bookmarkId", "", "getCategories", "", "", "getCategoryResourceId", "", "category", "(Ljava/lang/String;)Ljava/lang/Integer;", "mapBookmarkToBookmarkView", "updateBookmark", "BookmarkDetailsView", "app_debug"})
public final class BookmarkDetailsViewModel extends androidx.lifecycle.AndroidViewModel {
    private androidx.lifecycle.LiveData<com.raywenderlich.placebook.viewmodel.BookmarkDetailsViewModel.BookmarkDetailsView> bookmarkDetailsView;
    private com.raywenderlich.placebook.repository.BookmarkRepo bookmarkRepo;
    
    private final com.raywenderlich.placebook.viewmodel.BookmarkDetailsViewModel.BookmarkDetailsView bookmarkToBookmarkView(com.raywenderlich.placebook.model.Bookmark bookmark) {
        return null;
    }
    
    private final void mapBookmarkToBookmarkView(long bookmarkId) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<com.raywenderlich.placebook.viewmodel.BookmarkDetailsViewModel.BookmarkDetailsView> getBookmark(long bookmarkId) {
        return null;
    }
    
    private final com.raywenderlich.placebook.model.Bookmark bookmarkViewToBookmark(com.raywenderlich.placebook.viewmodel.BookmarkDetailsViewModel.BookmarkDetailsView bookmarkView) {
        return null;
    }
    
    public final void updateBookmark(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.placebook.viewmodel.BookmarkDetailsViewModel.BookmarkDetailsView bookmarkView) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCategoryResourceId(@org.jetbrains.annotations.NotNull()
    java.lang.String category) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCategories() {
        return null;
    }
    
    public final void deleteBookmark(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.placebook.viewmodel.BookmarkDetailsViewModel.BookmarkDetailsView bookmarkDetailsView) {
    }
    
    public BookmarkDetailsViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u000bH\u00c6\u0003J\t\u0010/\u001a\u00020\u000bH\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003Jl\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0010\u00106\u001a\u0004\u0018\u0001072\u0006\u00108\u001a\u000209J\t\u0010:\u001a\u00020;H\u00d6\u0001J\u0016\u0010<\u001a\u00020=2\u0006\u00108\u001a\u0002092\u0006\u0010>\u001a\u000207J\t\u0010?\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0010\"\u0004\b%\u0010\u0012R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0010\"\u0004\b\'\u0010\u0012\u00a8\u0006@"}, d2 = {"Lcom/raywenderlich/placebook/viewmodel/BookmarkDetailsViewModel$BookmarkDetailsView;", "", "id", "", "name", "", "phone", "address", "notes", "category", "longitude", "", "latitude", "placeId", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getCategory", "setCategory", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getLatitude", "()D", "setLatitude", "(D)V", "getLongitude", "setLongitude", "getName", "setName", "getNotes", "setNotes", "getPhone", "setPhone", "getPlaceId", "setPlaceId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;)Lcom/raywenderlich/placebook/viewmodel/BookmarkDetailsViewModel$BookmarkDetailsView;", "equals", "", "other", "getImage", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "hashCode", "", "setImage", "", "image", "toString", "app_debug"})
    public static final class BookmarkDetailsView {
        @org.jetbrains.annotations.Nullable()
        private java.lang.Long id;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String name;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String phone;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String address;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String notes;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String category;
        private double longitude;
        private double latitude;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String placeId;
        
        @org.jetbrains.annotations.Nullable()
        public final android.graphics.Bitmap getImage(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        public final void setImage(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.graphics.Bitmap image) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.Nullable()
        java.lang.Long p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPhone() {
            return null;
        }
        
        public final void setPhone(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAddress() {
            return null;
        }
        
        public final void setAddress(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getNotes() {
            return null;
        }
        
        public final void setNotes(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCategory() {
            return null;
        }
        
        public final void setCategory(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final double getLongitude() {
            return 0.0;
        }
        
        public final void setLongitude(double p0) {
        }
        
        public final double getLatitude() {
            return 0.0;
        }
        
        public final void setLatitude(double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPlaceId() {
            return null;
        }
        
        public final void setPlaceId(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public BookmarkDetailsView(@org.jetbrains.annotations.Nullable()
        java.lang.Long id, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String phone, @org.jetbrains.annotations.NotNull()
        java.lang.String address, @org.jetbrains.annotations.NotNull()
        java.lang.String notes, @org.jetbrains.annotations.NotNull()
        java.lang.String category, double longitude, double latitude, @org.jetbrains.annotations.Nullable()
        java.lang.String placeId) {
            super();
        }
        
        public BookmarkDetailsView() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
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
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component6() {
            return null;
        }
        
        public final double component7() {
            return 0.0;
        }
        
        public final double component8() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.raywenderlich.placebook.viewmodel.BookmarkDetailsViewModel.BookmarkDetailsView copy(@org.jetbrains.annotations.Nullable()
        java.lang.Long id, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String phone, @org.jetbrains.annotations.NotNull()
        java.lang.String address, @org.jetbrains.annotations.NotNull()
        java.lang.String notes, @org.jetbrains.annotations.NotNull()
        java.lang.String category, double longitude, double latitude, @org.jetbrains.annotations.Nullable()
        java.lang.String placeId) {
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